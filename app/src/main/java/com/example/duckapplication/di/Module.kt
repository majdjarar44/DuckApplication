package com.example.duckapplication.di

import com.example.duckapplication.fly.FlyNoWay
import com.example.duckapplication.fly.FlyWithWings
import com.example.duckapplication.quack.MuteSound
import com.example.duckapplication.quack.QuackSound
import com.example.duckapplication.quack.SquackSound
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
object Module {

    @FlyBehavior
    @Provides
    fun provideSimpleFlyBehavior(): FlyWithWings = FlyWithWings()

    @NoFlyBehavior
    @Provides
    fun provideNoFlyBehavior(): FlyNoWay= FlyNoWay()

    @SquackBehavior
    @Provides
    fun provideSquackBehavior(): SquackSound = SquackSound()

    @QuackBehavior
    @Provides
    fun provideQuackBehavior(): QuackSound = QuackSound()

    @MuteBehavior
    @Provides
    fun provideMuteBehavior(): MuteSound = MuteSound()

}