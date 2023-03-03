package com.example.test_quwi.common.utils;

import com.example.test_quwi.data.model.User;

import okhttp3.ResponseBody;

public interface ResponseCallback {
    void onCallback(ResponseBody body);
}