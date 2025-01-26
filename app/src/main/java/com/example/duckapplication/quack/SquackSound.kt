package com.example.duckapplication.quack

import android.util.Log

class SquackSound:QuackBehavior {
    override fun quack() :String{
        Log.d("Quack Behavior" ,"This Duck is Squack")
        return "Squack Sound"
    }
}