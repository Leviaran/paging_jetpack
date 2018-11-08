package com.singletondev.id.pagination.mvvm.home.di

import com.singletondev.id.pagination.data.source.remote.Endpoint
import com.singletondev.id.pagination.data.source.repository.PagingDataFactory
import com.singletondev.id.pagination.data.source.repository.PagingDataSource
import dagger.Module
import dagger.Provides

@Module
class PagingModule {

    @Provides
    fun providePagingDataSource(apiService : Endpoint) : PagingDataSource {
        return PagingDataSource(apiService)
    }

    @Provides
    fun providePagingDataFactory(pagingDataSource: PagingDataSource) : PagingDataFactory{
        return PagingDataFactory(pagingDataSource)
    }
}