package com.example.test_quwi.ui.chat.viewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.test_quwi.R;
import com.example.test_quwi.common.utils.Result;
import com.example.test_quwi.data.model.Chat;
import com.example.test_quwi.domain.repository.ChatRepository;

import java.util.List;

public class ChatViewModel extends ViewModel {

    private MutableLiveData<ChatResult> chatResult = new MutableLiveData<>();
    private ChatRepository chatRepository;

    public ChatViewModel(ChatRepository chatRepository) {
        this.chatRepository = chatRepository;
    }

    public LiveData<ChatResult> getChatResult() {
        return chatResult;
    }

    public void getChats() {
        Result<List<Chat>> result = chatRepository.getChats();

        if (result instanceof Result.Success) {
            List<Chat> data = ((Result.Success<List<Chat>>) result).getData();
            chatResult.setValue(new ChatResult(data));
        } else {
            chatResult.setValue(new ChatResult(R.string.login_failed));
        }
    }
}