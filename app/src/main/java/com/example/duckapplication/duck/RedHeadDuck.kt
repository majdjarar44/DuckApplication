package com.example.duckapplication.duck

import com.example.duckapplication.Duck
import com.example.duckapplication.di.NoFlyBehavior
import com.example.duckapplication.fly.FlyNoWay
import com.example.duckapplication.quack.MuteSound
import javax.inject.Inject

class RedHeadDuck @Inject constructor(
    @NoFlyBehavior flyBehavior: FlyNoWay,
    @com.example.duckapplication.di.MuteBehavior quackBehavior: MuteSound
) : Duck(flyBehavior, quackBehavior) {

    override fun display(): String {
        return super.display()
    }
}