package com.permagraph.data

import androidx.room.*

@Dao
interface EntryDao {
    @Query("SELECT * FROM Entry ORDER BY modified DESC")
    suspend fun getAll(): List<Entry>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(entry: Entry)

    @Delete
    suspend fun delete(entry: Entry)
}
