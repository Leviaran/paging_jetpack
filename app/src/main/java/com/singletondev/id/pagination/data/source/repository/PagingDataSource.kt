package com.singletondev.id.pagination.data.source.repository

import android.arch.lifecycle.MutableLiveData
import android.arch.paging.PageKeyedDataSource
import com.singletondev.id.pagination.BuildConfig
import com.singletondev.id.pagination.base.BaseApiModel
import com.singletondev.id.pagination.data.model.Result
import com.singletondev.id.pagination.data.source.remote.Endpoint
import com.singletondev.id.pagination.utils.NetworkState
import io.reactivex.SingleObserver
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject



class PagingDataSource @Inject constructor(val apiService : Endpoint) : PageKeyedDataSource<Long, Result>(){

    var initialState = MutableLiveData<NetworkState>()
    var networkState = MutableLiveData<NetworkState>()

    override fun loadInitial(params: LoadInitialParams<Long>, callback: LoadInitialCallback<Long, Result>) {
        initialState.postValue(NetworkState.LOADING)
        networkState.postValue(NetworkState.LOADING)

       apiService.getNewsApi(BuildConfig.API_KEY)
           .subscribeOn(Schedulers.io())
           .observeOn(AndroidSchedulers.mainThread())
           .subscribe(object : SingleObserver<BaseApiModel<Result>>{
               override fun onSuccess(value: BaseApiModel<Result>?) {
                   callback.onResult(value!!.results.toMutableList(), null, 2L)
                   initialState.postValue(NetworkState.SUCCESS)
                   networkState.postValue(NetworkState.SUCCESS)
               }

               override fun onSubscribe(d: Disposable?) {

               }

               override fun onError(e: Throwable?) {
                   networkState.postValue(NetworkState.FAILED)
               }
           })
    }

    override fun loadAfter(params: LoadParams<Long>, callback: LoadCallback<Long, Result>) {
        networkState.postValue(NetworkState.LOADING)

        apiService.getNewsApi(BuildConfig.API_KEY)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : SingleObserver<BaseApiModel<Result>>{
                override fun onSuccess(value: BaseApiModel<Result>?) {
                    networkState.postValue(NetworkState.SUCCESS)
                    callback.onResult(value!!.results, (params.key+1))
                }

                override fun onSubscribe(d: Disposable?) {
                }

                override fun onError(e: Throwable?) {
                    networkState.postValue(NetworkState.FAILED)
                }
            })
    }

    override fun loadBefore(params: LoadParams<Long>, callback: LoadCallback<Long, Result>) {
    }

}