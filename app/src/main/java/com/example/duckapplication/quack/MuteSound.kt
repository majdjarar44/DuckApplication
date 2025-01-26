package com.example.duckapplication.quack

import android.util.Log

class MuteSound : QuackBehavior {

    override fun quack():String {
        Log.d("Quack Behavior" ,"This Duck is Mute")
        return " Mute Sound"

    }

}