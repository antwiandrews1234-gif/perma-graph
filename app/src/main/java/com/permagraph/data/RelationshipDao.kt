package com.permagraph.data

import androidx.room.*

@Dao
interface RelationshipDao {
    @Query("SELECT * FROM Relationship WHERE fromId = :entryId OR toId = :entryId")
    suspend fun getForEntry(entryId: String): List<Relationship>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(relationship: Relationship)

    @Delete
    suspend fun delete(relationship: Relationship)
}
