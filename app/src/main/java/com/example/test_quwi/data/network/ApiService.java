package com.example.test_quwi.data.network;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiService {

//    @GET("changes/")
//    Call<List<Chat>> loadChats(@Query("q") String status);

    @POST("auth/login")
    Call<ResponseBody> login(@Body RequestBody body);

    @GET("auth/logout")
    Call<ResponseBody> logout();
}