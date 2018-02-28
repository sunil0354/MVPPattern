package com.app.sunilmvp.retrofit;

import com.app.sunilmvp.adapter.User;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by MY PC on 27-Dec-17.
 */

public interface APIInterface {
    @POST("/api/users")
    Call<User> createUser(@Body User user);
//    @POST("/api/users")
//    Call<User> createUser(@Body User user);
//
//    @GET("/api/users?")
//    Call<UserList> doGetUserList(@Query("page") String page);
//
//    @FormUrlEncoded
//    @POST("/api/users?")
//    Call<UserList> doCreateUserWithField(@Field("name") String name, @Field("job") String job);
}