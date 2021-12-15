package com.example.retrofitusingrecycleview.Services;

import com.example.retrofitusingrecycleview.DataModel.Model;

import retrofit.Callback;
import retrofit.http.GET;

public interface ApiService

{
        @GET("/api/lastrows/")
         public void CallApi(Callback<Model> modelCallback);


}
