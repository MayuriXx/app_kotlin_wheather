package com.example.app_kotlin_wheather.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.app_kotlin_wheather.R

class CityFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater?.inflate(R.layout.city_fragment, container, false)
        return view
//        return super.onCreateView(inflater, container, savedInstanceState)
    }
}