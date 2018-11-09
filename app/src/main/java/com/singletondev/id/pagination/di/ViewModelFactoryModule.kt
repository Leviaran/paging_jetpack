//package com.singletondev.id.pagination.di
//
//import android.app.Application
//import android.arch.lifecycle.ViewModel
//import android.arch.lifecycle.ViewModelProvider
//import android.arch.lifecycle.ViewModelProviders
//import com.singletondev.id.pagination.App
//import com.singletondev.id.pagination.di.qualifier.VIewModelKey
//import com.singletondev.id.pagination.mvvm.home.PaginViewModel
//import dagger.Binds
//import dagger.Module
//import dagger.multibindings.IntoMap
//import javax.inject.Inject
//import javax.inject.Provider
//
//@Module
//abstract class ViewModelFactoryModule {
//
//    @Binds
//    abstract fun bindViewModelFactory(factory : ViewModelFactory) : ViewModelProvider.Factory
//
//    @Binds
//    abstract fun bindApplication(app : App) : Application
//
//    @Binds
//    @IntoMap
//    @VIewModelKey(PaginViewModel::class)
//    abstract fun bindPagingViewModel(vm : PaginViewModel) : ViewModel
//}
//
//class ViewModelFactory @Inject constructor(val viewModel : Map<Class<out ViewModel>, @JvmSuppressWildcards Provider<ViewModel>>)
//    : ViewModelProvider.Factory{
//    override fun <T : ViewModel?> create(modelClass: Class<T>): T = viewModel[modelClass]?.get() as T
//}