package com.example.liftquest.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = Gold80,
    onPrimary = OnGold,
    secondary = PurpleSoft,
    onSecondary = OnPurpleSoft,
    secondaryContainer = PurpleContainerDark,
    onSecondaryContainer = OnPurpleContainerDark,
    tertiary = PaleGold,
    background = NightPurple,
    onBackground = TextOnDark,
    surface = DeepPurple,
    onSurface = TextOnDark,
    surfaceVariant = PurpleVariantDark,
    onSurfaceVariant = TextMutedDark,
    surfaceContainer = PurpleContainerLow,
    surfaceContainerHigh = PurpleContainerHigh,
    outline = OutlineDark
)

private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    onPrimary = Color.White,
    primaryContainer = PurpleContainerLight,
    onPrimaryContainer = OnPurpleContainerLight,
    secondary = DarkGold,
    onSecondary = Color.White,
    secondaryContainer = GoldContainerLight,
    onSecondaryContainer = OnGoldContainerLight,
    background = SurfaceLight,
    onBackground = TextOnLight,
    surface = SurfaceLight,
    onSurface = TextOnLight,
    surfaceVariant = SurfaceVariantLight,
    onSurfaceVariant = TextMutedLight,
    surfaceContainer = SurfaceContainerLight,
    surfaceContainerHighest = Color.White,
    outline = OutlineLight
)

@Composable
fun LiftQuestTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}