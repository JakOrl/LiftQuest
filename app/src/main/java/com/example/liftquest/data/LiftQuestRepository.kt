package com.example.liftquest.data

import com.example.liftquest.data.local.Achievement
import com.example.liftquest.data.local.AchievementDao
import com.example.liftquest.data.local.Exercise
import com.example.liftquest.data.local.ExerciseDao
import com.example.liftquest.data.local.UserProfile
import com.example.liftquest.data.local.UserProfileDao
import com.example.liftquest.data.local.Workout
import com.example.liftquest.data.local.WorkoutDao
import com.example.liftquest.data.local.WorkoutSet
import com.example.liftquest.data.local.WorkoutSetDao
import kotlinx.coroutines.flow.Flow

//==========================================
// Repository
//==========================================
class LiftQuestRepository(
    private val exerciseDao: ExerciseDao,
    private val workoutDao: WorkoutDao,
    private val workoutSetDao: WorkoutSetDao,
    private val userProfileDao: UserProfileDao,
    private val achievementDao: AchievementDao
) {

    val exercises: Flow<List<Exercise>> = exerciseDao.getAll()
    val workouts: Flow<List<Workout>> = workoutDao.getAll()
    val allSets: Flow<List<WorkoutSet>> = workoutSetDao.getAllSets()
    val profile: Flow<UserProfile?> = userProfileDao.getProfile()
    val achievements: Flow<List<Achievement>> = achievementDao.getAll()

    suspend fun addExercise(exercise: Exercise): Long = exerciseDao.insert(exercise)

    suspend fun updateExercise(exercise: Exercise) = exerciseDao.update(exercise)

    suspend fun deleteExercise(exercise: Exercise) = exerciseDao.delete(exercise)

    suspend fun getExercise(id: Int): Exercise? = exerciseDao.getById(id)

    suspend fun saveWorkout(workout: Workout, sets: List<WorkoutSet>): Int {
        val workoutId = workoutDao.insert(workout).toInt()
        workoutSetDao.insertAll(sets.map { it.copy(workoutId = workoutId) })
        return workoutId
    }

    fun getSetsForWorkout(workoutId: Int): Flow<List<WorkoutSet>> =
        workoutSetDao.getSetsForWorkout(workoutId)

    suspend fun getBestWeight(exerciseId: Int): Double? =
        workoutSetDao.getBestWeight(exerciseId)

    suspend fun getProfileOnce(): UserProfile? = userProfileDao.getProfileOnce()

    suspend fun updateProfile(profile: UserProfile) = userProfileDao.update(profile)

    suspend fun getAchievementsOnce(): List<Achievement> = achievementDao.getAllOnce()

    suspend fun updateAchievement(achievement: Achievement) = achievementDao.update(achievement)

    suspend fun seedIfNeeded() {
        if (exerciseDao.count() == 0) {
            exerciseDao.insertAll(sampleExercises)
        }
        userProfileDao.insert(UserProfile())
        achievementDao.insertAll(defaultAchievements)
    }
}