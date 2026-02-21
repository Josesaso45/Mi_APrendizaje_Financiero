package com.example.mi_aprendizaje_financiero.data.model

import com.google.gson.annotations.SerializedName
/**
 * Un data class esta hecho solo para guardar datos
 * Nos regala funciones como equals(), hashcode(), toString(),)
 * */
data class UserResponse(

    //SerializedName vincula el nombre que viene del servidor(json)
    //con el nombre que tu quieras usar en kotlin
    @SerializedName("id")
    val id: Int,

    @SerializedName("name")
    val name: String,

    @SerializedName("email")
    val email: String,

    @SerializedName("fullname")
    val nombreCompleto: String,

    @SerializedName("balance")
    val saldo: Double
)
