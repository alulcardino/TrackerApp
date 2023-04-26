package com.romanmikhailenko.trackerapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.romanmikhailenko.trackerapp.R
import com.romanmikhailenko.trackerapp.databinding.ActivityMainBinding
import com.romanmikhailenko.trackerapp.databinding.FragmentRunBinding
import com.romanmikhailenko.trackerapp.databinding.FragmentTrackingBinding
import com.romanmikhailenko.trackerapp.ui.viewmodels.MainViewModel

class RunFragment : Fragment() {

    private val viewModel: MainViewModel by viewModels()

    private var _binding: FragmentRunBinding? = null
    private val mBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRunBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mBinding.but.setOnClickListener {
            findNavController().navigate(R.id.action_runFragment_to_trackingFragment)
        }
    }


}