package com.example.test_quwi.data;

import com.example.test_quwi.common.utils.Result;
import com.example.test_quwi.common.utils.UserCallback;
import com.example.test_quwi.data.model.User;
import com.example.test_quwi.data.network.ApiService;
import com.example.test_quwi.domain.di.SimpleDIContainer;

import java.io.IOException;

import kotlin.Function;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.Query;

public class LoginDataSource {
    ApiService service;

    public LoginDataSource() {
        service = SimpleDIContainer.getNetworkClient().service;
    }



    public void logout() {
        // TODO: revoke authentication
    }
}