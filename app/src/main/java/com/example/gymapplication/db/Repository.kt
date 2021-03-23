package com.example.gymapplication.db

import androidx.lifecycle.LiveData

class Repository(private val gymDao: GymDao) {
    fun getcustrepositorytable():LiveData<List<CustomerDetails>>
    {
        return gymDao.getcustomerdetails()//2
    }
    fun inserttablerepository(customerDetails: CustomerDetails){
        return gymDao.insertcustomerdetails(customerDetails)//1
    }
}





















//
//class Repository(private val sleepDao: SleepDao) {
//    fun getrepositorytable(): LiveData<List<SleepDetails>>
//    {
//        return sleepDao.gettable()
//    }
//
//    fun inserttablerepository(sleepDetails: SleepDetails){
//        return sleepDao.inserttable(sleepDetails)
//    }
//}