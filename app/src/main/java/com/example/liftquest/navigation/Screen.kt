package com.example.liftquest.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

//==========================================
// Screens
//==========================================
sealed class Screen(val route: String, val title: String, val icon: ImageVector) {
    data object Home : Screen("home", "Home", Icons.Filled.Home)
    data object Exercises : Screen("exercises", "Exercises", Icons.AutoMirrored.Filled.List)
    data object Progress : Screen("progress", "Progress", Icons.Filled.DateRange)
    data object Settings : Screen("settings", "Settings", Icons.Filled.Settings)
}

//==========================================
// Bottom navigation items
//==========================================
val bottomNavItems = listOf(Screen.Home, Screen.Exercises, Screen.Progress, Screen.Settings)