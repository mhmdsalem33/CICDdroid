package com.mhmd.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.mhmd.myapplication.databinding.ActivityMainBinding
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes

class MainActivity : AppCompatActivity() {


    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        AppCenter.start( application , "2eca6ca2-2df8-497a-aec1-f2e96cf5ad05", Analytics::class.java, Crashes::class.java)



        Log.d("TAG", "onCreate: ")

        binding.buttom.setOnClickListener {
            //throw Exception("Something went wrong.")
              Crashes.generateTestCrash()
        }
    }
}