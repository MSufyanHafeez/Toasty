package com.example.toastmodule;

import android.content.Context;
import android.widget.Toast;

public class ToastClass {
    public static void simpletoast(Context context, String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
    public static double sumFun(double a, double b){
        return a+b;
    }
    public static double subFun(double a, double b){
        return a-b;
    }
    public static double multiplyFun(double a, double b){
        return a*b;
    }
    public static double divideFun(double a, double b){
        return a/b;
    }
}
