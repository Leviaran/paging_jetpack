package com.singletondev.id.pagination.base

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
//import com.singletondev.id.pagination.di.ViewModelFactory
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

abstract class BaseActivity<VM : ViewModel> : DaggerAppCompatActivity() {

    private lateinit var viewModel: VM
    @Inject lateinit var viewModelFactory: ViewModelProvider.Factory

    lateinit var mActivity : AppCompatActivity

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        mActivity = this
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(getViewModelClass())
    }

    abstract fun getViewModelClass() : Class<VM>

}