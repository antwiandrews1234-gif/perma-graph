package com.permagraph.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = [Entry::class, Relationship::class], version = 1)
@TypeConverters(Converters::class)
abstract class PermaGraphDatabase : RoomDatabase() {
    abstract fun entryDao(): EntryDao
    abstract fun relationshipDao(): RelationshipDao

    companion object {
        @Volatile private var INSTANCE: PermaGraphDatabase? = null

        fun getInstance(context: Context): PermaGraphDatabase =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: Room.databaseBuilder(
                    context.applicationContext,
                    PermaGraphDatabase::class.java, "perma_graph.db"
                ).build().also { INSTANCE = it }
            }
    }
}
