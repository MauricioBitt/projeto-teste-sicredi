package com.sicredi.sicreditestapp.di

import com.sicredi.sicreditestapp.data.network.RetrofitService
import com.sicredi.sicreditestapp.data.repository.EventRepository
import com.sicredi.sicreditestapp.data.repository.EventRepositoryImpl
import org.koin.dsl.module

val dataModule = module {
    factory { RetrofitService() }
    factory<EventRepository> { EventRepositoryImpl(get()) }
}