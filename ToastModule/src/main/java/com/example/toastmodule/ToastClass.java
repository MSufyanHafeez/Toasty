package com.example.toastmodule;

import android.content.Context;
import android.widget.Toast;

public class ToastClass {
    public static void simpletoast(Context context, String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
