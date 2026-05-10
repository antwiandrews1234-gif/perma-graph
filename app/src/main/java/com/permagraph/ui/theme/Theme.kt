package com.permagraph.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = androidx.compose.ui.graphics.Color(0xFFa855f7),
    background = androidx.compose.ui.graphics.Color(0xFF18181f),
    surface = androidx.compose.ui.graphics.Color(0xFF202028)
)
private val LightColorPalette = lightColors(
    primary = androidx.compose.ui.graphics.Color(0xFFa855f7),
    background = androidx.compose.ui.graphics.Color(0xFFfafafa),
    surface = androidx.compose.ui.graphics.Color(0xFFf4f4ff)
)

@Composable
fun PermaGraphTheme(content: @Composable () -> Unit) {
    val colors = if (isSystemInDarkTheme()) DarkColorPalette else LightColorPalette
    MaterialTheme(colors = colors, content = content)
}
