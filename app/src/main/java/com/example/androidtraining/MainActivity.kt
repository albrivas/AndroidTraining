package com.example.androidtraining

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.androidtraining.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // TODO: lateinit var binding


    private lateinit var mainActivityViewModel: MainActivityViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: inflar la vista con ViewBingin


        // TODO: llamar a la funcion instances


        // TODO: llamar a la funcion observers


        // TODO: llamar a la funcion loadUrlWebView


        // TODO: cargar el viewBinding con setContentView

    }

    private fun instances() {
        mainActivityViewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        // TODO: Vincular el ViewModel con la vista y asignar el lifecycleOwner a la actividad

    }

    private fun observers() {
        // TODO: Observar la variable model del ViewModel en la funcion updateUi()

    }

    // TODO: Crear un funcion llamada updateUi() donde se le pase el model del ViewModel, escuchar el evento de NavigateToFragment y llamar a la funcion navigateToFragment


    // TODO: Crear una funcion llamada loadUrlWebView cargando la url (https://kotlinlang.org/) en el webview y habilitando javascript


    private fun navigateToFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(
            R.id.fragment_container,
            fragment
        ).commit()

        mainActivityViewModel.fragmentContainerVisibility.value = true
    }

    //region NAVIGATION

    fun navigateToBack() {
        mainActivityViewModel.fragmentContainerVisibility.value = false
    }

    //endregion

    //region OVERRIDE

    override fun onBackPressed() {

    }

    //endregion



}