package com.example.liftquest.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

//==========================================
// App database
//==========================================
@Database(
    entities = [
        Exercise::class,
        Workout::class,
        WorkoutSet::class,
        UserProfile::class,
        Achievement::class
    ],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun exerciseDao(): ExerciseDao
    abstract fun workoutDao(): WorkoutDao
    abstract fun workoutSetDao(): WorkoutSetDao
    abstract fun userProfileDao(): UserProfileDao
    abstract fun achievementDao(): AchievementDao

    companion object {
        @Volatile
        private var instance: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return instance ?: synchronized(this) {
                Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "liftquest.db"
                ).build().also { instance = it }
            }
        }
    }
}