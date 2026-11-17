package com.example.liftquest.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

//==========================================
// Achievement entity
//==========================================
@Entity(tableName = "achievements")
data class Achievement(
    @PrimaryKey val id: String,
    val title: String,
    val description: String,
    val isUnlocked: Boolean = false,
    val unlockedAtMillis: Long = 0
)