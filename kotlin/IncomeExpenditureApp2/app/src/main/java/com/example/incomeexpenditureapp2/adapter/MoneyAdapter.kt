package com.example.incomeexpenditureapp2.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.incomeexpenditureapp2.MainActivity
import com.example.incomeexpenditureapp2.R
import com.example.incomeexpenditureapp2.data.AppDatabase
import com.example.incomeexpenditureapp2.data.Money
import com.example.incomeexpenditureapp2.touch.MoneyTouchHelperCallback
import kotlinx.android.synthetic.main.money_row.view.*
import java.util.*

class MoneyAdapter:RecyclerView.Adapter<MoneyAdapter.ViewHolder>,MoneyTouchHelperCallback {

    var moneyItems=mutableListOf<Money>(
        /*Money(null,"2012.02.20","husi",899,0),
        Money(null,"2012.02.20","husi",899,0),
        Money(null,"2012.02.20","husi",899,0),*/
)
    val context: Context
    constructor(context: Context, moneyList: List<Money>) :super(){
        this.context=context
        moneyItems.addAll(moneyList)
    }


    fun addMoney(money: Money){
        moneyItems.add(money)//lista vegere fuzi az elemet, csak azt rajzolja ujra
        notifyItemInserted(moneyItems.lastIndex) //frissiti az adaptert
    }
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) { //igy tudja ujra felhasznalni az recycleView-t
        var tvDate = itemView.tvDate
        var tvName = itemView.tvName
        var tvPrice=itemView.tvPrice
        var tvSpinnerCategory=itemView.tvSpinnerCategory
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(
            R.layout.money_row, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var moneyItem = moneyItems[position]

        holder.tvDate.text = moneyItem.createDate
        holder.tvName.text = moneyItem.name
        holder.tvPrice.text = moneyItem.price.toString()

        if (moneyItem.category == 0) {
            holder.tvSpinnerCategory.text = "Income"
        } else if (moneyItem.category == 1) {
            holder.tvSpinnerCategory.text = "Expenditure"
        }
    }

    override fun getItemCount(): Int {
        return moneyItems.size
    }

    fun deleteMoney(position: Int){
        var moneyToDelete=moneyItems.get(position)
        Thread{
            AppDatabase.getInstance(context).moneyDao().deleteMoney(moneyToDelete)

            (context as MainActivity).runOnUiThread{
                moneyItems.removeAt(position)
                notifyItemRemoved(position)
            }
        }.start()

    }
    override fun onDismissed(position: Int) {
        deleteMoney(position)
    }

    override fun onItemMoved(fromPosition: Int, toPosition: Int) {
        Collections.swap(moneyItems,fromPosition,toPosition)
        notifyItemMoved(fromPosition,toPosition)
    }
}



