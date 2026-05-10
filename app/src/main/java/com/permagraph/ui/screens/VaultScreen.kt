package com.permagraph.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun VaultScreen(onAddEntry: () -> Unit, onOpenGraph: () -> Unit) {
    Scaffold(
        topBar = { TopAppBar(title = { Text("perma-graph") }) },
        floatingActionButton = {
            FloatingActionButton(onClick = onAddEntry) {
                Icon(Icons.Default.Add, contentDescription = "Add Entry")
            }
        }
    ) { padding ->
        Column(Modifier.padding(padding).fillMaxSize()) {
            Text("Your Knowledge Vault", style = MaterialTheme.typography.h4, modifier = Modifier.padding(24.dp))
            Button(onClick = onOpenGraph, modifier = Modifier.padding(24.dp)) {
                Text("Explore Your Graph")
            }
            // TODO: Display entries list, search, quick-add, etc.
        }
    }
}
