package com.setiadi.meong.reynaldi.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class CustomToast {

    public static void c(Context c,String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }
}
