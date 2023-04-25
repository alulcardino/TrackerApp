package com.romanmikhailenko.trackerapp.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "running_table")
data class Run (
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val timestamp: Long = 0L,
    val distance: Int = 0,
    val averageSpeed: Float = 0f,
    val timeInMils: Long = 0L,
    val calories: Int = 0
)