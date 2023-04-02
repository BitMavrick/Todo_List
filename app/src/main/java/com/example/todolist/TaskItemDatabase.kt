package com.example.todolist

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [TaskItem::class], version = 1, exportSchema = false)
abstract class TaskItemDatabase: RoomDatabase()  {
    abstract fun taskItemDao(): TaskItemDao

    companion object{
        @Volatile
        private var INSTANCE: TaskItemDatabase? = null


    }
}