package com.permagraph.data

import androidx.room.Entity

@Entity(primaryKeys = ["fromId", "toId"])
data class Relationship(
    val fromId: String,
    val toId: String,
    val label: String // "inspiredBy", "relatedTo", etc.
)
