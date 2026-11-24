package com.example.liftquest.data

import com.example.liftquest.data.local.Achievement
import com.example.liftquest.data.local.Exercise

//==========================================
// Sample exercises
//==========================================
val sampleExercises = listOf(
    Exercise(name = "Bench Press", muscleGroup = "Chest", description = "Lie on a bench and press the bar up from your chest."),
    Exercise(name = "Incline Dumbbell Press", muscleGroup = "Chest", description = "Press dumbbells up on an inclined bench."),
    Exercise(name = "Cable Chest Fly", muscleGroup = "Chest", description = "Bring the cable handles together in front of your chest with soft elbows."),
    Exercise(name = "Pull-Up", muscleGroup = "Back", description = "Hang from a bar and pull your chin above it."),
    Exercise(name = "Barbell Row", muscleGroup = "Back", description = "Hinge forward and row the bar to your lower chest."),
    Exercise(name = "Lat Pulldown", muscleGroup = "Back", description = "Pull the bar down to your upper chest while seated."),
    Exercise(name = "Overhead Press", muscleGroup = "Shoulders", description = "Press the bar from your shoulders to overhead."),
    Exercise(name = "Lateral Raise", muscleGroup = "Shoulders", description = "Raise dumbbells out to the sides to shoulder height."),
    Exercise(name = "Face Pull", muscleGroup = "Shoulders", description = "Pull the rope towards your face with your elbows high."),
    Exercise(name = "Bicep Curl", muscleGroup = "Biceps", description = "Curl dumbbells up while keeping your elbows still."),
    Exercise(name = "Hammer Curl", muscleGroup = "Biceps", description = "Curl dumbbells with your palms facing each other."),
    Exercise(name = "Preacher Curl", muscleGroup = "Biceps", description = "Curl the bar with your upper arms resting on an angled pad."),
    Exercise(name = "Tricep Pushdown", muscleGroup = "Triceps", description = "Push the cable handle down until your arms are straight."),
    Exercise(name = "Skull Crusher", muscleGroup = "Triceps", description = "Lower the bar towards your forehead on a bench, then extend your arms."),
    Exercise(name = "Overhead Tricep Extension", muscleGroup = "Triceps", description = "Lower a dumbbell behind your head and press it back up."),
    Exercise(name = "Back Squat", muscleGroup = "Legs", description = "Squat down with the bar across your upper back."),
    Exercise(name = "Romanian Deadlift", muscleGroup = "Legs", description = "Hinge at the hips with the bar close to your legs."),
    Exercise(name = "Leg Press", muscleGroup = "Legs", description = "Push the platform away on the leg press machine."),
    Exercise(name = "Plank", muscleGroup = "Core", description = "Hold a straight line on your forearms and toes.")
)

//==========================================
// Default achievements
//==========================================
val defaultAchievements = listOf(
    Achievement(id = "first_workout", title = "First Steps", description = "Finish your first workout."),
    Achievement(id = "ten_workouts", title = "Getting Serious", description = "Finish 10 workouts."),
    Achievement(id = "first_pr", title = "New Record", description = "Set your first personal record."),
    Achievement(id = "streak_7", title = "Week Warrior", description = "Train 7 days in a row."),
    Achievement(id = "silver_rank", title = "Silver Lifter", description = "Reach Silver rank.")
)