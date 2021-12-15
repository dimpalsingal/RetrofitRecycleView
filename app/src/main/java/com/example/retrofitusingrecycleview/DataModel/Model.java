package com.example.retrofitusingrecycleview.DataModel;

import java.util.ArrayList;

public class Model
   {

           private ArrayList<Files> files;

           private String status;

           public ArrayList<Files> getFiles ()
           {
               return files;
           }

           public void setFiles (ArrayList<Files> files)
           {
               this.files = files;
           }

           public String getStatus ()
           {
               return status;
           }

           public void setStatus (String status)
           {
               this.status = status;
           }
   }
