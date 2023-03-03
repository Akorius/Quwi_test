package com.example.test_quwi.ui.login.viewModel;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.test_quwi.domain.di.SimpleDIContainer;

public class LoginViewModelFactory implements ViewModelProvider.Factory {

    @NonNull
    @Override
    @SuppressWarnings("unchecked")
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (modelClass.isAssignableFrom(LoginViewModel.class)) {
            return (T) new LoginViewModel(SimpleDIContainer.getLoginRepository());
        } else {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
    }
}