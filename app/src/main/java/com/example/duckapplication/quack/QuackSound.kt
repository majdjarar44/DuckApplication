package com.example.duckapplication.quack

import android.util.Log

class QuackSound:QuackBehavior {
    override fun quack() :String{
        Log.d("Quack Behavior" ,"This Duck is Quack")
        return " Quack Sound"
    }
}