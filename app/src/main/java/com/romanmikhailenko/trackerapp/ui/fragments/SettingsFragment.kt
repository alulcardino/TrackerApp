package com.romanmikhailenko.trackerapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.romanmikhailenko.trackerapp.R
import com.romanmikhailenko.trackerapp.databinding.ActivityMainBinding
import com.romanmikhailenko.trackerapp.ui.viewmodels.MainViewModel
import com.romanmikhailenko.trackerapp.ui.viewmodels.StatisticsViewModel


class SettingsFragment : Fragment() {

    private val viewModel: StatisticsViewModel by viewModels()

    private var _binding: ActivityMainBinding? = null
    private val mBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_settings, container, false)
    }

}