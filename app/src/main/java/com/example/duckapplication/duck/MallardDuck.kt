package com.example.duckapplication.duck

import com.example.duckapplication.Duck
import com.example.duckapplication.di.NoFlyBehavior
import com.example.duckapplication.fly.FlyNoWay
import com.example.duckapplication.quack.QuackSound
import javax.inject.Inject

class MallardDuck @Inject constructor(
    @NoFlyBehavior flyBehavior: FlyNoWay,
    @com.example.duckapplication.di.QuackBehavior quackBehavior: QuackSound
) : Duck(flyBehavior, quackBehavior) {

    override fun display(): String {
        return super.display()
    }
}