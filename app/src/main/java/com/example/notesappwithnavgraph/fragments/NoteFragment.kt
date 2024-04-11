package com.example.notesappwithnavgraph.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.notesappwithnavgraph.R
import com.example.notesappwithnavgraph.databinding.FragmentNoteBinding

class NoteFragment : Fragment() {

    private lateinit var noteFrgBinding: FragmentNoteBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        noteFrgBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_note, container, false)

        noteFrgBinding.newNoteFAB.setOnClickListener {
            Navigation.findNavController(it)
                .navigate(R.id.action_noteFragment_to_noteDetailFragment)
        }

        return noteFrgBinding.root
    }

}