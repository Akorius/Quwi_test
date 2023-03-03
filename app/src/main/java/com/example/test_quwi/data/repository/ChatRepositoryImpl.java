package com.example.test_quwi.data.repository;

import com.example.test_quwi.common.utils.Result;
import com.example.test_quwi.data.LoginDataSource;
import com.example.test_quwi.data.model.Chat;
import com.example.test_quwi.data.model.User;
import com.example.test_quwi.domain.repository.ChatRepository;
import com.example.test_quwi.domain.repository.LoginRepository;

import java.util.List;

public class ChatRepositoryImpl implements ChatRepository {

    private LoginDataSource dataSource;


    public ChatRepositoryImpl(LoginDataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public Result<List<Chat>> getChats() {
        return null;
    }
}