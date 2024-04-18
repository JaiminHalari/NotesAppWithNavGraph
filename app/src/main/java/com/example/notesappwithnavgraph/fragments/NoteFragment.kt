package com.example.notesappwithnavgraph.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.notesappwithnavgraph.R
import com.example.notesappwithnavgraph.databinding.FragmentNoteBinding
import com.example.notesappwithnavgraph.viewmodel.NotesViewModel

class NoteFragment : Fragment() {

    private lateinit var noteFrgBinding: FragmentNoteBinding
    private val notesViewModel: NotesViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        noteFrgBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_note, container, false)
        noteFrgBinding.lifecycleOwner = viewLifecycleOwner
        noteFrgBinding.noteViewModel = notesViewModel
        noteFrgBinding.navController = findNavController()

        return noteFrgBinding.root
    }

}