package com.example.test_quwi.ui.chat.viewModel;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.test_quwi.domain.di.SimpleDIContainer;

public class ChatViewModelFactory implements ViewModelProvider.Factory {

    @NonNull
    @Override
    @SuppressWarnings("unchecked")
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (modelClass.isAssignableFrom(ChatViewModel.class)) {
            return (T) new ChatViewModel(SimpleDIContainer.getChatRepository());
        } else {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
    }
}