package com.singletondev.id.pagination.utils

sealed class NetworkState{
    object LOADING : NetworkState()
    object SUCCESS : NetworkState()
    object FAILED : NetworkState()
}