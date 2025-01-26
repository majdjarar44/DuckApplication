package com.example.duckapplication.fly

import android.util.Log

class FlyWithWings:FlyBehavior {

    override fun fly() :String{
        Log.d("Fly Behavior" ,"This Duck is Fly ")
        return " is Fly"
    }
}