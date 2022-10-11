package com.example.qlitecomroom

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(context : Context): ViewModel() {

    val selectUsers: LiveData<List<Usuario>>
    val repository : UserRepository

    init {
        val userDao = UserDataBase.getDataBase(context).userDao()
        repository = UserRepository(userDao)
        selectUsers = repository.selectUsers
    }

    fun addUser(usuario: Usuario){
        viewModelScope.launch(Dispatchers.IO) {
            repository.addUser(usuario)
        }
    }
}