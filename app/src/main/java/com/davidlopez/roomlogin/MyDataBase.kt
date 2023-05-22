package com.davidlopez.roomlogin

import androidx.room.Database
import androidx.room.RoomDatabase


// clase que crea la base de datos en room


@Database(entities = [Usuario::class], version = 1)
abstract class MyDataBase : RoomDatabase(){

    abstract class usuarioDao(): UsuarioDao


}