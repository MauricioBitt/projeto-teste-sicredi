package com.sicredi.sicreditestapp.data.network

import com.sicredi.sicreditestapp.data.model.CheckInModel
import com.sicredi.sicreditestapp.data.model.EventModel
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface ApiService {
    @GET("/events")
    suspend fun getEvents(): List<EventModel>

    @GET("/events/{id}")
    suspend fun getEvent(@Path("id") id: String): EventModel

    @POST("/checkin")
    suspend fun postCheckIn(@Body checkIn: CheckInModel)
}