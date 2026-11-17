package com.example.liftquest.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

//==========================================
// UserProfile entity
// Level and Rank are calculated later via total Xp
//==========================================
@Entity(tableName = "user_profile")
data class UserProfile(
    @PrimaryKey val id: Int = 1,
    val totalXp: Int = 0,
    val currentStreak: Int = 0,
    val lastWorkoutDay: Long = 0
)