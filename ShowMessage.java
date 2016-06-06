package com.bazingalabs.toastlibdemo;

import android.app.Activity;
import android.widget.Toast;

/**
 * Created by apple on 06/06/16.
 */
public class ShowMessage {

Activity activity;

    String string="";
    public  ShowMessage(Activity activity, String yourMessageDetails){
        //
        this.activity=activity;
        string=yourMessageDetails;
    }

    public void show(){
        Toast.makeText(activity, string, Toast.LENGTH_SHORT).show();
    }
}
