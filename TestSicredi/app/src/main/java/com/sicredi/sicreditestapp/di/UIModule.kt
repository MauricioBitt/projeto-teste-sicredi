package com.sicredi.sicreditestapp.di

import com.sicredi.sicreditestapp.ui.eventdetail.EventDetailViewModel
import com.sicredi.sicreditestapp.ui.eventlist.EventListViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val uiModule = module {
    viewModel { EventListViewModel(get()) }
    viewModel { EventDetailViewModel(get()) }
}