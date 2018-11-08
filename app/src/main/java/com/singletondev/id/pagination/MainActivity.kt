package com.singletondev.id.pagination

import android.arch.lifecycle.Observer
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.singletondev.id.pagination.base.BaseActivity
import com.singletondev.id.pagination.databinding.ActivityMainBinding
import com.singletondev.id.pagination.mvvm.home.PaginViewModel
import com.singletondev.id.pagination.mvvm.home.PagingAdapter
import javax.inject.Inject

class MainActivity : BaseActivity<PaginViewModel>() {

    @Inject lateinit var pagingViewModel: PaginViewModel
    private lateinit var adapter : PagingAdapter

    override fun getViewModelClass(): Class<PaginViewModel> {
        return PaginViewModel::class.java
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        binding.rvPaging.layoutManager = LinearLayoutManager(this)

        adapter = PagingAdapter()

        pagingViewModel.start()

        pagingViewModel.articleLiveData.observe(this, Observer {
            adapter.submitList(it)
        })

        pagingViewModel.networkState.observe(this, Observer {
            adapter.setNetworkState(it!!)
        })

        binding.rvPaging.adapter = adapter


    }
}
