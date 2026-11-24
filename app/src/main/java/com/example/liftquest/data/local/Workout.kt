package com.example.liftquest.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

//==========================================
// Workout entity
// The variable names explain what is contained
//==========================================
@Entity(tableName = "workouts")
data class Workout(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val dateMillis: Long,
    val durationSeconds: Int = 0,
    val xpEarned: Int = 0
)