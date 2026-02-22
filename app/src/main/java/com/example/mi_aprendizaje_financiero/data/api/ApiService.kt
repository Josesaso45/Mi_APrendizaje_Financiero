package com.example.mi_aprendizaje_financiero.data.api

import retrofit2.http.Body
import retrofit2.http.POST
import com.example.mi_aprendizaje_financiero.data.model.UserResponse
import com.example.mi_aprendizaje_financiero.LoginRequest


interface ApiService {
    //En el proyecto original la ruta es para el login
    //@POST le dice a Retrofit que enviaremos datos
    //suspend permite que se use con Coroutines (lifecycleScope)

    @POST("login")
    suspend fun login(@Body request: LoginRequest): UserResponse

}