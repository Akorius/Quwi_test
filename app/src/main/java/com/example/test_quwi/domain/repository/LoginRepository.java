package com.example.test_quwi.domain.repository;

import com.example.test_quwi.common.utils.Result;
import com.example.test_quwi.data.model.User;

public interface LoginRepository {
    Result<User> login(String username, String password);
    void logout();
}
