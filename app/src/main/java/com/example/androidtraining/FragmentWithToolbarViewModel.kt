package com.example.androidtraining

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FragmentWithToolbarViewModel : ViewModel() {

    private val _model = MutableLiveData<UiModel>()
    val model: LiveData<UiModel> get() = _model

    private val _randomText = MutableLiveData<String>()
    val randomText: LiveData<String> get() = _randomText

    // TODO: Asignar el valor que devuelve la funcion randomText()
    init {

    }

    sealed class UiModel {
        object NavigateBack : UiModel()
    }

    // TODO: funcion onClick de la flecha para volver atrás


    // TODO: Funcion que devuelva de una lista de Strings uno de forma aleatoria. Llamar a la funcion randomText()

}