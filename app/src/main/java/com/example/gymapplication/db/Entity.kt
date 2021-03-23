package com.example.gymapplication.db

import androidx.databinding.BaseObservable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "customerdetails")
data class CustomerDetails (
    @ColumnInfo(name = "id")
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    @ColumnInfo(name = "Name")
    val Name:String,
    @ColumnInfo(name = "Age")
    val Age:Int,
    @ColumnInfo(name = "Gender")
    val Gender:String,
    @ColumnInfo(name = "Height")
    val Height:String,
    @ColumnInfo(name = "Weight")
    val Weight:String,

//    @ColumnInfo(name = "PhnNumber")
//    val PhnNumber:Int,
//    @ColumnInfo(name = "Address")
//    val Address:Int,
): BaseObservable()


