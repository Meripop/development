package com.example.incomeexpenditureapp2.data


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "money")
data class Money(
    @PrimaryKey(autoGenerate = true) var moneyId: Long?,
    @ColumnInfo(name ="createDate") var createDate: String,
    @ColumnInfo(name ="name") var name: String,
    @ColumnInfo(name ="price") var price: Int,
    @ColumnInfo(name ="category") var category: Int

) : Serializable
