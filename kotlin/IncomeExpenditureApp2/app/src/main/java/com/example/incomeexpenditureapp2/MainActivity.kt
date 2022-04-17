package com.example.incomeexpenditureapp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.ItemTouchHelper
import com.example.incomeexpenditureapp2.adapter.MoneyAdapter
import com.example.incomeexpenditureapp2.data.AppDatabase
import com.example.incomeexpenditureapp2.data.Money
import com.example.incomeexpenditureapp2.databinding.ActivityMainBinding
import com.example.incomeexpenditureapp2.touch.MoneyRecyclerTouchCallback
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    private lateinit var binding: ActivityMainBinding
    private lateinit var moneyAdapter: MoneyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initSpinner()
        initRecyclerView()


        binding.btnCheckAllIn.setOnClickListener {
            val startSummation= Intent(this,SumActivity::class.java)
            startActivity(startSummation)
        }
        binding.btnSave.setOnClickListener{
            if (etName.text.isNotEmpty()) {
                if (etPrice.text.isNotEmpty()) {
                    saveMoney()
                    queryMoney()
                } else {
                    etPrice.error = "This field can not be empty"
                }
            } else {
                etName.error = "This field can not be empty"
            }
        }
    }

    private fun initRecyclerView() {
        Thread {
            var moneyList = AppDatabase.getInstance(this@MainActivity).moneyDao().getAllItem()

            runOnUiThread {
                moneyAdapter= MoneyAdapter(this, moneyList)
                recyclerMoney.adapter=moneyAdapter

                val itemDecoration = DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
                recyclerMoney.addItemDecoration(itemDecoration)

                val touchCallback = MoneyRecyclerTouchCallback(moneyAdapter)
                val itemTouchHelper = ItemTouchHelper(touchCallback)
                itemTouchHelper.attachToRecyclerView(recyclerMoney)

            }

        }.start()
    }

    private fun saveMoney() {
        Thread{
            var newMoney = Money(
                    null,
            Date(System.currentTimeMillis()).toString(),
            etName.text.toString(),
            etPrice.text.toString().toInt(),
            spinnerCategory.selectedItemPosition
            );

            var newId = AppDatabase.getInstance(this@MainActivity).moneyDao().insertMoney(newMoney)
            newMoney.moneyId = newId;
            runOnUiThread{
                moneyAdapter.addMoney(newMoney)
            }
        }.start()
    }

    fun queryMoney(){
        Thread{
            var money= AppDatabase.getInstance(this@MainActivity).moneyDao().getAllItem()

            runOnUiThread{

                money.forEach { moneyAdapter=MoneyAdapter(this@MainActivity,money)
                    recyclerMoney.adapter=moneyAdapter }
            }
        }.start()
    }


    fun initSpinner(){
        var categoryAdapter = ArrayAdapter.createFromResource(
            this@MainActivity,
            R.array.category_array,
            android.R.layout.simple_spinner_item
        )
        categoryAdapter.setDropDownViewResource(
            android.R.layout.simple_spinner_dropdown_item
        )
        spinnerCategory.adapter = categoryAdapter
        spinnerCategory.onItemSelectedListener = this
    }

    var selectEnabled=false
    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        if(selectEnabled){
            Toast.makeText(this,
                spinnerCategory.getItemAtPosition(position).toString(),Toast.LENGTH_LONG).show()
        }else{
        selectEnabled=true}
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        Toast.makeText(this,
            spinnerCategory.getItemAtPosition(0).toString(),Toast.LENGTH_LONG).show()
    }


}