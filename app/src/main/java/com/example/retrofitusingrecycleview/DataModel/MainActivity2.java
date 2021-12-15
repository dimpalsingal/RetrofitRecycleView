package com.example.retrofitusingrecycleview.DataModel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.retrofitusingrecycleview.Controller.AppController;
import com.example.retrofitusingrecycleview.MainActivity;
import com.example.retrofitusingrecycleview.R;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity2 extends AppCompatActivity {
      TextView textView1 , textView2,textView3 , textView4,textView5 , textView6,textView7, textView8,textView9 , textView10,textView11 , textView12
              ,textView13, textView14,textView15 , textView16;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView1=findViewById(R.id.text1);
        textView2=findViewById(R.id.text2);
        textView3=findViewById(R.id.text3);
        textView4=findViewById(R.id.text4);
        textView5=findViewById(R.id.text5);
        textView6=findViewById(R.id.text6);
        textView7=findViewById(R.id.text7);
        textView8=findViewById(R.id.text8);
        textView9=findViewById(R.id.text9);
        textView10=findViewById(R.id.text10);
        textView11=findViewById(R.id.text11);
        textView12=findViewById(R.id.text12);
        textView13=findViewById(R.id.text13);
        textView14=findViewById(R.id.text14);
        textView15=findViewById(R.id.text15);


        textView1.setText(getIntent().getStringExtra("id"));
        textView2.setText(getIntent().getStringExtra("number_of_stems"));
        textView3.setText(getIntent().getStringExtra("encoding"));
        textView4.setText(getIntent().getStringExtra("file"));
        textView5.setText(getIntent().getStringExtra("music_path"));
        textView6.setText(getIntent().getStringExtra("voice_path"));
        textView7.setText(getIntent().getStringExtra("user_id"));
        textView8.setText(getIntent().getStringExtra("isYoutube"));
        textView9.setText(getIntent().getStringExtra("job_key"));
        textView10.setText(getIntent().getStringExtra("job_status"));
        textView11.setText(getIntent().getStringExtra("android_token"));
        textView12.setText(getIntent().getStringExtra("finished_index"));
        textView13.setText(getIntent().getStringExtra("present_index"));
        textView14.setText(getIntent().getStringExtra("updated_at"));
        textView15.setText(getIntent().getStringExtra("created_at"));

//    Files f1=getIntent().getParcelableExtra("data");
//    textView1.setText(f1.getId());
//        textView2.setText(f1.getNumber_of_stems());
//        textView1.setText(f1.getEncoding());
//        textView1.setText(f1.getFile());
//        textView1.setText(f1.getMusic_path());
//        textView1.setText(f1.getVoice_path());
//        textView1.setText(f1.getUser_id());
//        textView1.setText(f1.getId());


    }

}
