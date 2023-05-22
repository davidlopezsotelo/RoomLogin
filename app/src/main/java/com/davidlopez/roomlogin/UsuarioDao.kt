package com.davidlopez.roomlogin

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UsuarioDao {

    @Insert
    fun insertUser(user: Usuario)

    @Query("SELECT * FROM usuarios WHERE name = :name")
    fun getUserByName(name: String): Usuario?

}