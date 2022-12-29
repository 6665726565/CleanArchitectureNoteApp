package com.plcoding.cleanarchitecturenoteapp.features_note.presenter.notes

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.plcoding.cleanarchitecturenoteapp.features_note.domain.use_case.NoteUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AddEditNoteViewModel @Inject constructor(

    private val noteUseCases: NoteUseCases

) : ViewModel() {

    private val _state = mutableStateOf(NotesState())
    val state : State<NotesState> = _state
}