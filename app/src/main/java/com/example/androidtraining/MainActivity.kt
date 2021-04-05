package com.example.androidtraining

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.androidtraining.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // TODO: lateinit var binding
    private lateinit var binding: ActivityMainBinding

    // TODO: lateinit var viewModel
    private lateinit var mainActivityViewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Inflate view with viewBinding
        binding = ActivityMainBinding.inflate(layoutInflater)

        // TODO: call fun instances
        instances()

        // TODO: call fun observers
        observers()

        // TODO: call fun loadUrlWebView
        loadUrlWebView()

        // TODO: Load viewBinding
        setContentView(binding.root)
    }

    private fun instances() {
        mainActivityViewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        binding.apply {
            viewModel = mainActivityViewModel
            lifecycleOwner = this@MainActivity
        }
    }

    private fun observers() {
        mainActivityViewModel.model.observe(this, Observer(::updateUi))
    }

    private fun updateUi(model: MainActivityViewModel.UiModel) {
        when (model) {
            MainActivityViewModel.UiModel.NavigateToFragment -> navigateToFragment(
                FragmentWithToolbar()
            )
        }
    }

    // TODO: Create a private function that loads a url (https://kotlinlang.org/) to the webView and enable javascript
    private fun loadUrlWebView() {
        binding.containerWebview.apply {
            settings.javaScriptEnabled = true
            loadUrl("https://kotlinlang.org/")
        }
    }

    // TODO: create private function that load fragments in FragmentContainerView
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