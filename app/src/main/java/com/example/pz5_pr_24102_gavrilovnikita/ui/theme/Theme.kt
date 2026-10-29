package com.example.pz5_pr_24102_gavrilovnikita.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
    primary = Blue,
    secondary = Orange,
    tertiary = Green,
    background = Navy,
    surface = NavyLight,
    onPrimary = TextLight,
    onBackground = TextLight,
    onSurface = TextLight
)

private val LightColorScheme = lightColorScheme(
    primary = Blue,
    secondary = Orange,
    tertiary = Green,
    background = BackgroundLight,
    surface = SurfaceLight,
    onPrimary = TextLight,
    onBackground = TextDark,
    onSurface = TextDark
)

@Composable
fun PZ5_PR24102_GavrilovNikitaTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}