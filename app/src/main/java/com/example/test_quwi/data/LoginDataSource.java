package com.example.test_quwi.data;

import com.example.test_quwi.common.utils.Result;
import com.example.test_quwi.data.model.User;

import java.io.IOException;

public class LoginDataSource {

    public Result<User> login(String username, String password) {
        try {

            User fakeUser =
                    new User(
                            java.util.UUID.randomUUID().toString(),
                            "Jane Doe");
            return new Result.Success<>(fakeUser);
        } catch (Exception e) {
            return new Result.Error(new IOException("Error logging in", e));
        }
    }

    public void logout() {
        // TODO: revoke authentication
    }
}