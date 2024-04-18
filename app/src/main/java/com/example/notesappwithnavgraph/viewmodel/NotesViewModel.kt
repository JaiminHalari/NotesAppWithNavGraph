package com.example.notesappwithnavgraph.viewmodel

import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.example.notesappwithnavgraph.R
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NotesViewModel @Inject constructor() : ViewModel() {

    fun onClickSubmitButton(navController: NavController) {
        navController.navigate(R.id.action_noteFragment_to_noteDetailFragment)
    }

}