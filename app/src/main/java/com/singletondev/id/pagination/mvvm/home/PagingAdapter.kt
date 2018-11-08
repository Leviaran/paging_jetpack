package com.singletondev.id.pagination.mvvm.home

import android.arch.paging.PagedListAdapter
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.singletondev.id.pagination.data.model.Result
import com.singletondev.id.pagination.databinding.ItemPagingListBinding
import com.singletondev.id.pagination.databinding.LoadingBinding
import com.singletondev.id.pagination.utils.NetworkState

class PagingAdapter : PagedListAdapter<Result, RecyclerView.ViewHolder>(Result.DIFFUTIL_CALLBACK){

    private val TYPE_PROGRESS = 0
    private val TYPE_ITEM = 1
    private var networkState : NetworkState? = null

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): RecyclerView.ViewHolder {
        val layoutInflater = LayoutInflater.from(p0.context)
        return if (p1 == TYPE_PROGRESS){
            LoadingItemViewHolder(LoadingBinding.inflate(layoutInflater, p0, false))
        } else {
            NewsItemViewHolder(ItemPagingListBinding.inflate(layoutInflater, p0, false))
        }
    }

    override fun onBindViewHolder(p0: RecyclerView.ViewHolder, p1: Int) {
        if (p0 is NewsItemViewHolder){
            p0.bindItem(getItem(p1))
        } else if (p0 is LoadingItemViewHolder) {
            p0.bindItem(networkState)
        }
    }

    override fun getItemViewType(position: Int): Int {
        return if (hasExtraRow() && position == itemCount -1){
            TYPE_PROGRESS
        } else {
            TYPE_ITEM
        }
    }

    private fun hasExtraRow() : Boolean{
        networkState.let {
            return networkState != NetworkState.SUCCESS
        }
    }

    fun setNetworkState(newNetworkState: NetworkState){
        val previousNetworkState = this.networkState
        val previousExtraRow = hasExtraRow()
        this.networkState = newNetworkState
        val newExtraRow = hasExtraRow()

        if (previousExtraRow != newExtraRow){
            if (previousExtraRow){
                notifyItemRemoved(itemCount)
            } else {
                notifyItemInserted(itemCount)
            }
        } else if (newExtraRow && previousNetworkState != newNetworkState){
            notifyItemChanged(itemCount)
        }
    }

    inner class NewsItemViewHolder(var view : ItemPagingListBinding) : RecyclerView.ViewHolder(view.root){

        fun bindItem(item : Result?){
            view.item = item
            view.executePendingBindings()
        }
    }

    inner class LoadingItemViewHolder(var view : LoadingBinding) : RecyclerView.ViewHolder(view.root){

        fun bindItem(networkState: NetworkState?){
            view.networkState = networkState
            view.executePendingBindings()
        }
    }

}