package com.romanmikhailenko.trackerapp.db

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface RunDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(run: Run)

    @Delete
    suspend fun delete(run: Run)

    @Query("SELECT * FROM running_table SORTED BY distance DESC")
    fun getRunsByDistance() : LiveData<List<Run>>

    @Query("SELECT * FROM running_table SORTED BY timestamp DESC")
    fun getRunsByDate() : LiveData<List<Run>>

    @Query("SELECT * FROM running_table SORTED BY timeInMils DESC")
    fun getRunsByMills() : LiveData<List<Run>>

    @Query("SELECT * FROM running_table SORTED BY averageSpeed DESC")
    fun getRunsByAverageSpeed() : LiveData<List<Run>>

    @Query("SELECT * FROM running_table SORTED BY calories DESC")
    fun getRunsByCalories() : LiveData<List<Run>>

    @Query("SELECT SUM(averageSpeed) FROM running_table")
    fun getTotalDistance() : LiveData<Int>

    @Query("SELECT AVG(distance) FROM running_table")
    fun getTotalAverage() : LiveData<Float>

    @Query("SELECT SUM(timeInMils) FROM running_table")
    fun getTotalMills() : LiveData<Long>

    @Query("SELECT SUM(calories) FROM running_table")
    fun getTotalCalories() : LiveData<Int>

}