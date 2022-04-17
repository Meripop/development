package com.example.incomeexpenditureapp2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.incomeexpenditureapp2.data.AppDatabase
import com.example.incomeexpenditureapp2.databinding.ActivitySumBinding


class SumActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySumBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySumBinding.inflate(layoutInflater)
        setContentView(binding.root)

        exPenM()

    }
    private fun exPenM() {
        Thread {
            val resTwo = AppDatabase.getInstance(this@SumActivity).moneyDao().getIncomeMoney(0)
            var totalIncome = 0
            for (money in resTwo) {
                totalIncome += money.price
            }
            binding.tvIncome.text = ""
            binding.tvIncome.append("${totalIncome} €")

            val res = AppDatabase.getInstance(this@SumActivity).moneyDao().getExpenditureMoney(1)
            var totalExp = 0
            for (money in res) {
                totalExp += money.price
            }
            binding.tvExpenditure.text = ""
            binding.tvExpenditure.append("${totalExp} €")

            binding.tvSum.text = ""
            val sumMon1: Int = (totalIncome-totalExp)

            binding.tvSum.append("${sumMon1}")
        }.start()

    }



    }


