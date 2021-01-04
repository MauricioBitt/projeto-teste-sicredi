package com.sicredi.sicreditestapp.ui.eventlist

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sicredi.sicreditestapp.data.model.EventModel
import com.sicredi.sicreditestapp.data.repository.EventRepository
import kotlinx.coroutines.launch

class EventListViewModel(private val repository: EventRepository) : ViewModel() {

    val eventsLiveData: MutableLiveData<List<EventModel>> = MutableLiveData()
    val loadingLiveData: MutableLiveData<Boolean> = MutableLiveData()
    val errorEventDetailLiveData: MutableLiveData<Boolean> = MutableLiveData()

    fun getEvents() {
        loadingLiveData.value = true
        errorEventDetailLiveData.value = false
        viewModelScope.launch {
            try {
                eventsLiveData.value = repository.getEvents()
            } catch (e: Exception) {
                errorEventDetailLiveData.value = true
            }
            loadingLiveData.value = false
        }
    }
}