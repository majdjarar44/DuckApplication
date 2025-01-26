package com.example.duckapplication.fly

import android.content.Context
import android.util.Log
import android.widget.Toast

class FlyNoWay : FlyBehavior {

    override fun fly():String {
        Log.d("Fly Behavior", "FlyNoWay")
        return " No Fly"
    }
}