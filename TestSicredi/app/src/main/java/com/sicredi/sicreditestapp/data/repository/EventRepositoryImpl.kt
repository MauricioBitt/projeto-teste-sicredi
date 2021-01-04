package com.sicredi.sicreditestapp.data.repository

import com.sicredi.sicreditestapp.data.model.CheckInModel
import com.sicredi.sicreditestapp.data.model.EventModel
import com.sicredi.sicreditestapp.data.network.RetrofitService

class EventRepositoryImpl(private val retrofitService: RetrofitService): EventRepository{

    override suspend fun getEvents(): List<EventModel> = retrofitService.service.getEvents()

    override suspend fun getEvent(id: String): EventModel = retrofitService.service.getEvent(id)

    override suspend fun postCheckIn(checkIn: CheckInModel) = retrofitService.service.postCheckIn(checkIn)
}