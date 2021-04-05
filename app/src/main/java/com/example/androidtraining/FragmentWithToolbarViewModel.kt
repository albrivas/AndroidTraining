package com.example.androidtraining

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FragmentWithToolbarViewModel : ViewModel() {

    private val _model = MutableLiveData<UiModel>()
    val model: LiveData<UiModel> get() = _model

    private val _randomText = MutableLiveData<String>()
    val randomText: LiveData<String> get() = _randomText

    init {
        _randomText.value = randomText()
    }

    sealed class UiModel {
        object NavigateBack : UiModel()
    }

    fun onClickBack() {
        _model.value = UiModel.NavigateBack
    }

    private fun randomText(): String {
        return listOf("Prueba 1", "Prueba 2", "Prueba 3", "Prueba 4").random()
    }
}