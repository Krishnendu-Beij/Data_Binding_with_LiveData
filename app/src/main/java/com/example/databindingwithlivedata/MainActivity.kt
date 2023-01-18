package com.example.databindingwithlivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.databindingwithlivedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var dataBinding: ActivityMainBinding
    lateinit var appViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        appViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

//        appViewModel.liveData.observe(this, Observer {
//            dataBinding.quoteText.text = it
//        })
//        dataBinding.btnUpdate.setOnClickListener {
//            appViewModel.UpdateLiveData()
//        }
        dataBinding.variableMainViewModel = appViewModel

        dataBinding.lifecycleOwner = this
    }
}