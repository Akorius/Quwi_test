package com.example.test_quwi.ui.login.viewModel;

import androidx.annotation.Nullable;

public class LoginResult {
    @Nullable
    private UserView data;
    @Nullable
    private Integer error;

    LoginResult(@Nullable Integer error) {
        this.error = error;
    }

    LoginResult(@Nullable UserView success) {
        this.data = success;
    }

    @Nullable
    public UserView getData() {
        return data;
    }

    @Nullable
    public Integer getError() {
        return error;
    }
}