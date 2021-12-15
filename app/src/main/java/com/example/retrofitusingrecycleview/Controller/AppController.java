package com.example.retrofitusingrecycleview.Controller;

import android.app.Application;

import com.example.retrofitusingrecycleview.Services.ApiService;

import retrofit.RestAdapter;
import retrofit.http.GET;

public class AppController extends Application {

      public ApiService apiService;
      private static final String SHOPCH11_SERVER = "https://musicseparation.com";

      @Override
      public void onCreate()
      {
            super.onCreate();
            RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint(SHOPCH11_SERVER).build();

            apiService = restAdapter.create(ApiService.class);



      }

      }
