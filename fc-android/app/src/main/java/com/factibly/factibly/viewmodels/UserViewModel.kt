package com.factibly.factibly.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.factibly.factibly.CurrentUserQuery
import com.factibly.factibly.repositories.UserRepository
import kotlinx.coroutines.launch

class UserViewModel @ViewModelInject constructor(
    private val repository: UserRepository
) : ViewModel() {

    private val _loggedIn = MutableLiveData<Boolean>()
    val loggedIn: LiveData<Boolean> = _loggedIn

    private val _user = MutableLiveData<CurrentUserQuery.CurrentUser>()
    val user: LiveData<CurrentUserQuery.CurrentUser> = _user

    fun login(email: String, password: String) {
        viewModelScope.launch {
            _loggedIn.value = repository.login(email, password).data?.login != null
        }
    }

    fun getCurrentUser() {
        viewModelScope.launch {
            _user.value = repository.getCurrentUser().data?.currentUser
        }
    }
}