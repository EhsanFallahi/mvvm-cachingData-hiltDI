package com.ehsanfallahi.mvvmwithhiltdi.room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [BlogCacheEntity::class],version = 1,exportSchema = false)
abstract class BlogDatabase:RoomDatabase() {
    abstract fun blogDao():BlogDao
    companion object{
        val DATABASE_NaME="blog_database"
    }
}