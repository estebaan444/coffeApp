package com.estebi.coffeapp.shared_VM

import com.estebi.coffeapp.adapters.Caffe

class Shared_VM {
    companion object{
        val listOfCaffes: ArrayList<String> = ArrayList()
        val listOfPrices: ArrayList<Int> = ArrayList()
        fun sumTotal(): Int {
            return listOfPrices.sum()
        }
    }
}