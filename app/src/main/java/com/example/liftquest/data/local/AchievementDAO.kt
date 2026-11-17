package com.example.liftquest.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

//==========================================
// Achievement DAO
//==========================================
@Dao
interface AchievementDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertAll(achievements: List<Achievement>)

    @Update
    suspend fun update(achievement: Achievement)

    @Query("SELECT * FROM achievements")
    fun getAll(): Flow<List<Achievement>>

    @Query("SELECT * FROM achievements")
    suspend fun getAllOnce(): List<Achievement>
}