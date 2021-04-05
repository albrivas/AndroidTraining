package com.example.androidtraining

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.example.androidtraining.databinding.FragmentWithToolbarBinding

class FragmentWithToolbar : Fragment() {

    private lateinit var fragmentWithToolbarViewModel: FragmentWithToolbarViewModel
    private lateinit var binding: FragmentWithToolbarBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentWithToolbarBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        instances()
        observers()
    }

    private fun observers() {
        fragmentWithToolbarViewModel.model.observe(viewLifecycleOwner, Observer(::updateUi))
    }

    private fun instances() {
        fragmentWithToolbarViewModel = ViewModelProvider(this).get(FragmentWithToolbarViewModel::class.java)

        // TODO: Vincular el ViewModel con la vista y asignar el lifecycleOwner

    }

    private fun updateUi(model: FragmentWithToolbarViewModel.UiModel) {
        when (model) {
            FragmentWithToolbarViewModel.UiModel.NavigateBack -> (activity as? MainActivity)?.navigateToBack()
        }
    }

}