package com.example.gymapplication.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
@Dao
interface GymDao {
   @Insert
   fun insertcustomerdetails(customerDetails: CustomerDetails)//1

   @Query("select * from customerdetails")
   fun getcustomerdetails():LiveData<List<CustomerDetails>>//2
}