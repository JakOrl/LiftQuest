package com.example.liftquest.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

//==========================================
// UserProfile DAO
//==========================================
@Dao
interface UserProfileDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(profile: UserProfile)

    @Update
    suspend fun update(profile: UserProfile)

    @Query("SELECT * FROM user_profile WHERE id = 1")
    fun getProfile(): Flow<UserProfile?>

    @Query("SELECT * FROM user_profile WHERE id = 1")
    suspend fun getProfileOnce(): UserProfile?
}