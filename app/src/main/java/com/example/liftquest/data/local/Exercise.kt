package com.example.liftquest.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

//==========================================
// Exercise entity
// The variable names explain what is contained
//==========================================
@Entity(tableName = "exercises")
data class Exercise(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
    val muscleGroup: String,
    val description: String = "",
    val isCustom: Boolean = false
)