package com.example.retrofitusingrecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.retrofitusingrecycleview.Controller.AppController;
import com.example.retrofitusingrecycleview.DataModel.Files;
import com.example.retrofitusingrecycleview.DataModel.MainActivity2;
import com.example.retrofitusingrecycleview.DataModel.Model;
import com.example.retrofitusingrecycleview.DataModel.MyAdapter;

import java.util.ArrayList;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity {
      TextView id,file,android_token;
      RecyclerView recyclerView;
      TextView textView1;

      AppController appController;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        appController = (AppController) getApplicationContext();
        id=findViewById(R.id.text1);
        file=findViewById(R.id.text2);
        android_token=findViewById(R.id.text3);

        recyclerView = findViewById(R.id.recycleview1);



         appController.apiService.CallApi(new Callback<Model>() {
             @Override
             public void success(Model model, Response response) {
                 MyAdapter ma =new MyAdapter(MainActivity.this,model.getFiles());
                 recyclerView.setHasFixedSize(true);
                 LinearLayoutManager lm = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);
                 recyclerView.setLayoutManager(lm);
                 recyclerView.setAdapter(ma);
                 recyclerView.setItemAnimator(new DefaultItemAnimator());



             }


             @Override
             public void failure(RetrofitError error) {
                 Log.e("Error",error.toString());

             }
         });













    }
}