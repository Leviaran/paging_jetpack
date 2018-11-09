//package com.singletondev.id.pagination.mvvm.home
//
//import android.arch.paging.PagedListAdapter
//import android.support.v7.widget.RecyclerView
//import android.view.LayoutInflater
//import android.view.ViewGroup
//import com.singletondev.id.pagination.databinding.ItemPagingListBinding
//import com.singletondev.id.pagination.databinding.LoadingBinding
//import com.singletondev.id.pagination.utils.NetworkState
//import com.singletondev.id.pagination.data.model.Result
//
//
//
//class PagingAdapter : PagedListAdapter<Result, RecyclerView.ViewHolder>(Result.DIFFUTIL_CALLBACK){
//
//    private val TYPE_PROGRESS = 0
//    private val TYPE_ITEM = 1
//    private var networkState : NetworkState? = null
//
//
//
//    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): RecyclerView.ViewHolder {
//        //TODO create two ViewHolder
//    }
//
//
//    override fun onBindViewHolder(p0: RecyclerView.ViewHolder, p1: Int) {
//        //TODO create two BindViewHolder
//    }
//
//    override fun getItemViewType(position: Int): Int {
//        //TODO condition if Progress and if Item with hasExtraRow and Position -1
//    }
//
//    //TODO create function hasExtraRow based networkState non Success
//    private fun hasExtraRow() : Boolean{
//
//    }
//
//    //TODO setNetworkState compare networkState and ExtraRow two each other
//    fun setNetworkState(newNetworkState: NetworkState){
//
//
//        //TODO make condition if previousExtraRow different to newExtraRow to notifiy remove and insert
//        if (previousExtraRow != newExtraRow){
//
//        } else if (newExtraRow && previousNetworkState != newNetworkState){
//            //TODO make condition if previousExtraRow different to newExtraRow to notifiy remove and insert
//        }
//    }
//
//    //TODO create NewsViewHolder
//    inner class NewsItemViewHolder(var view : ItemPagingListBinding) : RecyclerView.ViewHolder(view.root){
//
//
//    }
//
//    //TODO create LoadingViewHolder
//    inner class LoadingItemViewHolder(var view : LoadingBinding) : RecyclerView.ViewHolder(view.root){
//
//
//    }
//
//}