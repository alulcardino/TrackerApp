package com.romanmikhailenko.trackerapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.romanmikhailenko.trackerapp.R
import com.romanmikhailenko.trackerapp.databinding.ActivityMainBinding
import com.romanmikhailenko.trackerapp.databinding.FragmentTrackingBinding


class TrackingFragment : Fragment() {

    private var _binding: FragmentTrackingBinding? = null
    private val mBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTrackingBinding.inflate(layoutInflater, container, false)



        return mBinding.root
    }

}