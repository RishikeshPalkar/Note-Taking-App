package com.example.notetakingapp

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.notetakingapp.database.NoteDatabase
import com.example.notetakingapp.databinding.ActivityMainBinding
import com.example.notetakingapp.repository.NoteRepository
import com.example.notetakingapp.viewmodel.NoteViewModel
import com.example.notetakingapp.viewmodel.NoteViewModelFactory

class MainActivity : AppCompatActivity() {

    lateinit var noteViewModel: NoteViewModel

    private lateinit var binding: ActivityMainBinding

    val notesViewModel: NoteViewModel by viewModels { 
        val database = NoteDatabase(this)
        val repository = NoteRepository(database)
        NoteViewModelFactory(application, repository)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
    }
}
