package com.singletondev.id.pagination.data.source.repository

import android.arch.lifecycle.MutableLiveData
import android.arch.paging.PageKeyedDataSource
import android.util.Log
import com.singletondev.id.pagination.data.model.Result
import com.singletondev.id.pagination.BuildConfig
import com.singletondev.id.pagination.data.model.BaseModel
import com.singletondev.id.pagination.data.source.remote.Endpoint
import com.singletondev.id.pagination.utils.NetworkState
import io.reactivex.SingleObserver
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject



class PagingDataSource @Inject constructor(val apiService : Endpoint) : PageKeyedDataSource<Long, Result>(){

   //TODO create consume restApi here

}