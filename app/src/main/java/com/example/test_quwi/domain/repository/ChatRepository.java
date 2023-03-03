package com.example.test_quwi.domain.repository;

import com.example.test_quwi.common.utils.Result;
import com.example.test_quwi.data.model.Chat;

import java.util.List;

public interface ChatRepository {
    Result<List<Chat>> getChats();
}
