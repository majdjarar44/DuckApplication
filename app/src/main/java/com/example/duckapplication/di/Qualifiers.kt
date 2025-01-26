package com.example.duckapplication.di

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FlyBehavior

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class NoFlyBehavior

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class QuackBehavior

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class SquackBehavior

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class MuteBehavior