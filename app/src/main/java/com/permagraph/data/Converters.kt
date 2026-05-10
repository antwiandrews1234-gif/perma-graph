package com.permagraph.data

import androidx.room.TypeConverter

class Converters {
    @TypeConverter
    fun fromStringList(value: List<String>): String = value.joinToString(";")

    @TypeConverter
    fun toStringList(data: String): List<String> =
        if (data.isEmpty()) emptyList() else data.split(";")
}
