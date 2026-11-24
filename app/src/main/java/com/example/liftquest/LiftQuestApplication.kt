package com.example.liftquest

import android.app.Application
import com.example.liftquest.data.LiftQuestRepository
import com.example.liftquest.data.local.AppDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

//==========================================
// Application
//==========================================
class LiftQuestApplication : Application() {

    val database by lazy { AppDatabase.getDatabase(this) }

    val repository by lazy {
        LiftQuestRepository(
            database.exerciseDao(),
            database.workoutDao(),
            database.workoutSetDao(),
            database.userProfileDao(),
            database.achievementDao()
        )
    }

    override fun onCreate() {
        super.onCreate()
        CoroutineScope(Dispatchers.IO).launch {
            repository.seedIfNeeded()
        }
    }
}