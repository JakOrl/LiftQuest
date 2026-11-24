package com.example.liftquest.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.liftquest.ui.screens.ExercisesScreen
import com.example.liftquest.ui.screens.HomeScreen
import com.example.liftquest.ui.screens.ProgressScreen
import com.example.liftquest.ui.screens.SettingsScreen

//==========================================
// Navigation graph
//==========================================
@Composable
fun AppNavigation(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route,
        modifier = modifier
    ) {
        composable(Screen.Home.route) { HomeScreen() }
        composable(Screen.Exercises.route) { ExercisesScreen() }
        composable(Screen.Progress.route) { ProgressScreen() }
        composable(Screen.Settings.route) { SettingsScreen() }
    }
}