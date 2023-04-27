package com.romanmikhailenko.trackerapp.utils

import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment

fun Fragment.checkPermission(string: String) : Boolean {
    return when(PackageManager.PERMISSION_GRANTED) {
        ContextCompat.checkSelfPermission((activity as AppCompatActivity), string) -> true
        else -> false
    }
}