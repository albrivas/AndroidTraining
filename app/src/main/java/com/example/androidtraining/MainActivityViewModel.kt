package com.example.androidtraining

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {

    val fragmentContainerVisibility = MutableLiveData(false)

    private val _model = MutableLiveData<UiModel>()
    val model: LiveData<UiModel> get() = _model

    sealed class UiModel {
        object NavigateToFragment: UiModel()
    }

    fun onClickButton() {
        _model.value = UiModel.NavigateToFragment
    }

}