package com.ehsanfallahi.mvvmwithhiltdi.room

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query


interface BlogDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertBlog(blogEntity:BlogCacheEntity):Long

    @Query("SELECT * FROM blogs_table")
    suspend fun getBlog():List<BlogCacheEntity>
}