package com.davidlopez.roomlogin

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity( tableName = "usuarios")
data class Usuario (
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val password: String
        )