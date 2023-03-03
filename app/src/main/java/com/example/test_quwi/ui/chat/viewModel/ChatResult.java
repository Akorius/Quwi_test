package com.example.test_quwi.ui.chat.viewModel;

import androidx.annotation.Nullable;

import com.example.test_quwi.data.model.Chat;

import java.util.List;

public class ChatResult {
    @Nullable
    private List<Chat> data;
    @Nullable
    private Integer error;

    ChatResult(@Nullable Integer error) {
        this.error = error;
    }

    ChatResult(@Nullable  List<Chat> success) {
        this.data = success;
    }

    @Nullable
    public  List<Chat> getData() {
        return data;
    }

    @Nullable
    public Integer getError() {
        return error;
    }
}