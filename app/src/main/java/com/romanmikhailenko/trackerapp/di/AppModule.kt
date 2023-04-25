package com.romanmikhailenko.trackerapp.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.romanmikhailenko.trackerapp.db.RunningDatabase
import com.romanmikhailenko.trackerapp.utils.Constants.DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideRunningDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(
        context,
        RunningDatabase::class.java,
        DATABASE_NAME
    ).build()

    @Provides
    fun provideRoomDao(db : RunningDatabase) = db.getRunDao()
}