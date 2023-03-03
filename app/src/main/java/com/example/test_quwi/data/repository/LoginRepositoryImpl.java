package com.example.test_quwi.data.repository;

import com.example.test_quwi.common.utils.Result;
import com.example.test_quwi.common.utils.UserCallback;
import com.example.test_quwi.data.LoginDataSource;
import com.example.test_quwi.data.model.User;
import com.example.test_quwi.data.network.ApiService;
import com.example.test_quwi.domain.di.SimpleDIContainer;
import com.example.test_quwi.domain.repository.LoginRepository;

import java.io.IOException;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginRepositoryImpl implements LoginRepository {

    ApiService service;

    private User user = null;

    public LoginRepositoryImpl(LoginDataSource dataSource) {
        service = SimpleDIContainer.getNetworkClient().service;
    }

    public boolean isLoggedIn() {
        return user != null;
    }

    @Override
    public void logout() {
        user = null;
        service.logout();
    }

    private void setLoggedInUser(User user) {
        this.user = user;
    }

    @Override
    public void login(String username, String password, UserCallback callback) {
        try {
            RequestBody requestBody = new MultipartBody.Builder()
                    .setType(MultipartBody.FORM)
                    .addFormDataPart("email", username)
                    .addFormDataPart("password", password)
                    .build();
            Call<ResponseBody> call = service.login(requestBody);
            call.enqueue(new Callback<ResponseBody>() {
                @Override
                public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                    ResponseBody responseBody = response.body();

                    User fakeUser =
                            new User(
                                    java.util.UUID.randomUUID().toString(),
                                    "Jane Doe");
                    callback.onCallback(new Result.Success(fakeUser));
                }

                @Override
                public void onFailure(Call<ResponseBody> call, Throwable t) {
                    callback.onCallback(new Result.Error(new IOException("Error logging in", t)));
                }
            });
        } catch (Exception e) {
            callback.onCallback(new Result.Error(new IOException("Error logging in", e)));
        }
    }
}