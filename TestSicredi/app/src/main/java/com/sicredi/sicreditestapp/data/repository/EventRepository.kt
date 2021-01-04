package com.sicredi.sicreditestapp.data.repository

import com.sicredi.sicreditestapp.data.model.CheckInModel
import com.sicredi.sicreditestapp.data.model.EventModel

interface EventRepository {
    suspend fun getEvents(): List<EventModel>
    suspend fun getEvent(id: String): EventModel
    suspend fun postCheckIn(checkIn: CheckInModel)
}