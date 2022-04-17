package com.example.incomeexpenditureapp2.data

import androidx.room.*

@Dao
interface MoneyDAO {
    @Query("SELECT * FROM money")
    fun getAllItem(): List<Money>
    @Query("SELECT * FROM money WHERE category=:money")
    fun getIncomeMoney(money: Int): List<Money>
    @Query("SELECT * FROM money WHERE category=:money")
    fun getExpenditureMoney(money: Int): List<Money>

    @Insert
    fun insertMoney(money: Money):Long
    @Delete
    fun deleteMoney(money: Money)
    @Update
    fun updateMoney(money: Money)
}