package com.example.duckapplication

import android.content.Context
import android.util.Log
import com.example.duckapplication.fly.FlyBehavior
import com.example.duckapplication.quack.QuackBehavior

open class Duck(
    protected var flyBehavior: FlyBehavior,
    protected var quackBehavior: QuackBehavior
) {

    open fun display(): String {
        flyBehavior.fly()
        quackBehavior.quack()
        return "This Duck is ${flyBehavior.fly()} and ${quackBehavior.quack()}"
    }
}