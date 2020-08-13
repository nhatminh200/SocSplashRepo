package com.example.socsplash

import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class SplashFrag : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.splash_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val timeCountDownTimer = object : CountDownTimer(5000, 1000) {
            override fun onFinish() {
                findNavController().navigate(R.id.action_splashFrag_to_homeFrag)
            }

            override fun onTick(p0: Long) {
                Log.d("Time counting down", "$p0")
            }
        }.start()
    }
}
