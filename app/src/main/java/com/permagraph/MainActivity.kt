package com.permagraph

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import com.permagraph.ui.screens.VaultScreen
import com.permagraph.ui.theme.PermaGraphTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PermaGraphTheme {
                Surface(color = MaterialTheme.colors.background) {
                    VaultScreen(
                        onAddEntry = { /* TODO: Show add entry dialog/screen */ },
                        onOpenGraph = { /* TODO: Show graph visualizer */ }
                    )
                }
            }
        }
    }
}
