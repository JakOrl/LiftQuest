package com.example.liftquest.navigation

import androidx.annotation.DrawableRes
import com.example.liftquest.R

//==========================================
// Screens
//==========================================
sealed class Screen(val route: String, val title: String, @DrawableRes val iconRes: Int) {
    data object Home : Screen("home", "Home", R.drawable.ic_home)
    data object Exercises : Screen("exercises", "Exercises", R.drawable.ic_exercises)
    data object Progress : Screen("progress", "Progress", R.drawable.ic_progress)
    data object Settings : Screen("settings", "Settings", R.drawable.ic_settings)
}

//==========================================
// Bottom navigation items
//==========================================
val bottomNavItems = listOf(Screen.Home, Screen.Exercises, Screen.Progress, Screen.Settings)