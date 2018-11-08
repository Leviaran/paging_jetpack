package com.singletondev.id.pagination.di

import com.singletondev.id.pagination.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class AndroidModule {

    @ContributesAndroidInjector
    abstract fun bindActivity() : MainActivity
}