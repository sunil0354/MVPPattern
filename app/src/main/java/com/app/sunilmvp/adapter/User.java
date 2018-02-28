package com.app.sunilmvp.adapter;

import com.google.gson.annotations.SerializedName;

/**
 * Created by MY PC on 20-Feb-18.
 */

public class User {

    @SerializedName("name")
    public String name;
    @SerializedName("job")
    public String job;
    @SerializedName("id")
    public String id;
    @SerializedName("createdAt")
    public String createdAt;

    public User(String name, String job) {
        this.name = name;
        this.job = job;
    }


}
