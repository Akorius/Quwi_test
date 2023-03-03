package com.example.test_quwi.common.utils;

import com.example.test_quwi.data.model.User;

public interface UserCallback {
    void onCallback(Result<User> user);
}