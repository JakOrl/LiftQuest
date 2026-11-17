package com.example.liftquest.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

//==========================================
// WorkoutSet DAO
//==========================================
@Dao
interface WorkoutSetDao {

    @Insert
    suspend fun insert(set: WorkoutSet): Long

    @Insert
    suspend fun insertAll(sets: List<WorkoutSet>)

    @Query("SELECT * FROM workout_sets WHERE workoutId = :workoutId")
    fun getSetsForWorkout(workoutId: Int): Flow<List<WorkoutSet>>

    @Query("SELECT * FROM workout_sets")
    fun getAllSets(): Flow<List<WorkoutSet>>

    @Query("SELECT MAX(weightKg) FROM workout_sets WHERE exerciseId = :exerciseId")
    suspend fun getBestWeight(exerciseId: Int): Double?
}