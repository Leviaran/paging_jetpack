//package com.singletondev.id.pagination.di
//
//import android.content.Context
////import com.singletondev.id.pagination.mvvm.home.di.PagingModule
//import dagger.BindsInstance
//import dagger.Component
//import dagger.android.AndroidInjector
//import dagger.android.support.AndroidSupportInjectionModule
//import dagger.android.support.DaggerApplication
//import javax.inject.Singleton
//
//@Singleton
//@Component(modules = [
//AndroidSupportInjectionModule::class,
//NetworkModule::class,
//AndroidModule::class])
////ViewModelFactoryModule::class,
////PagingModule::class])
//interface AppComponent : AndroidInjector<DaggerApplication> {
//
//    @Component.Builder
//    interface Builder{
//
//        @BindsInstance fun context(context : Context) : Builder
//        fun build() : AppComponent
//
//    }
//}