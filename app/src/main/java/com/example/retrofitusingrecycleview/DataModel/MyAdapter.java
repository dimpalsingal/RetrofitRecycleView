package com.example.retrofitusingrecycleview.DataModel;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofitusingrecycleview.R;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>
      {
             public Intent intent;
             public Activity context;
       ArrayList<Files>  files = new ArrayList();

          public MyAdapter(Activity context , ArrayList<Files> files) {
              this.files = files;
              this.context=context;
          }


          @NonNull
          @Override
          public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
              View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_view_item, parent, false);
              return new MyViewHolder(view);

          }

          @Override
          public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
               Files f1 = files.get(position);
              holder.id.setText(String.valueOf(f1.getUser_id()));
              holder.file.setText(f1.getFile());
              holder.android_token.setText(String.valueOf(f1.getAndroid_token()));
              holder.linear.setOnClickListener(new OnClickListener() {
                  @Override
                  public void onClick(View v) {
                      Intent intent = new Intent(context,MainActivity2.class);
//                       intent.putExtra("id",f1.getUser_id());
//                       intent.putExtra( "number_of_stems",f1.getNumber_of_stems());
//                      intent.putExtra("encoding",f1.getEncoding());
//                      intent.putExtra( "file",f1.getFile());
//                      intent.putExtra("music_path",f1.getMusic_path());
//                      intent.putExtra( "voice_path",f1.getVoice_path());
//                      intent.putExtra("user_id",f1.getUser_id());
//                      intent.putExtra( "isYoutube",f1.getIsYoutube());
//                      intent.putExtra("job_key",f1.getJob_key());
//                      intent.putExtra( "job_status",f1.getJob_status());
//                      intent.putExtra("android_token",f1.getAndroid_token());
//                      intent.putExtra( "finished_index",f1.getFinished_index());
//                      intent.putExtra("present_index",f1.getPresent_index());
//                      intent.putExtra( "updated_at",f1.getUpdated_at());
//                      intent.putExtra( "created_at",f1.getCreated_at());
                      intent.putExtra("data",f1);
                       context.startActivity(intent);
                  }
              });

          }

          @Override
          public int getItemCount() {

              return files.size();
          }





          class MyViewHolder extends RecyclerView.ViewHolder  {

              public TextView id, file, android_token;
             public LinearLayout linear;


              public MyViewHolder(View itemView) {
                  super(itemView);

                 id = itemView.findViewById(R.id.text1);
                  file = itemView.findViewById(R.id.text2);
                  android_token = itemView.findViewById(R.id.text2);
                  linear =  itemView.findViewById(R.id.linear);



              }

          }

}