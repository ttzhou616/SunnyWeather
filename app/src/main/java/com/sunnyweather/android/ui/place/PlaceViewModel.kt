package com.sunnyweather.android.ui.place

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.switchMap
import com.sunnyweather.android.logic.query.Repository
import com.sunnyweather.android.logic.model.Place

class PlaceViewModel : ViewModel() {

    private val searchLivedata = MutableLiveData<String>()

    val placeList = ArrayList<Place>()

    val placeLivedata = searchLivedata.switchMap { query ->
        Repository.searchPlaces(query)
    }

    fun searchPlaces(query: String){
        searchLivedata.value = query
    }

}