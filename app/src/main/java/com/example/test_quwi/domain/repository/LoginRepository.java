package com.example.test_quwi.domain.repository;

import com.example.test_quwi.common.utils.Result;
import com.example.test_quwi.common.utils.UserCallback;
import com.example.test_quwi.data.model.User;

public interface LoginRepository {
    void login(String username, String password, UserCallback callback);
    void logout();
}
