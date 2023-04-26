package com.romanmikhailenko.trackerapp.repositories

import com.romanmikhailenko.trackerapp.db.Run
import com.romanmikhailenko.trackerapp.db.RunDao
import javax.inject.Inject

class MainRepository @Inject constructor(
    val runDao: RunDao
) {

    suspend fun insertRun(run: Run) = runDao.insert(run)

    suspend fun deleteRun(run: Run) = runDao.delete(run)

    fun getRunsByDistance() = runDao.getRunsByDistance()

    fun getRunsByDate() = runDao.getRunsByDate()

    fun getRunsByMills() = runDao.getRunsByMills()

    fun getRunsByAverageSpeed() = runDao.getRunsByAverageSpeed()

    fun getRunsByCalories() = runDao.getRunsByCalories()

    fun getTotalDistance() = runDao.getTotalDistance()

    fun getTotalAverage() = runDao.getTotalAverage()

    fun getTotalMills() = runDao.getTotalMills()

    fun getTotalCalories() = runDao.getTotalCalories()





}