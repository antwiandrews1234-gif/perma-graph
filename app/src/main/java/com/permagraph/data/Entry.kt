package com.permagraph.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Entry(
    @PrimaryKey val id: String,
    val title: String,
    val content: String,
    val created: Long,
    val modified: Long,
    val type: String, // "note", "person", "image", "audio", etc
    val tags: List<String>
)
