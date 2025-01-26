package com.example.duckapplication.duck

import com.example.duckapplication.Duck
import com.example.duckapplication.di.FlyBehavior
import com.example.duckapplication.di.NoFlyBehavior
import com.example.duckapplication.fly.FlyWithWings
import com.example.duckapplication.quack.MuteSound
import javax.inject.Inject

class RubberDuck@Inject constructor(
    @FlyBehavior flyBehavior: FlyWithWings,
    @com.example.duckapplication.di.MuteBehavior quackBehavior: MuteSound
) : Duck(flyBehavior, quackBehavior) {

    override fun display(): String {
        return super.display()
    }
}