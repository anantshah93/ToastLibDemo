package com.bazingalabs.libdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.bazingalabs.toastlibdemo.ShowMessage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final ShowMessage showMessage =new ShowMessage(this,"Hi Anant");


        Button button_click=(Button)findViewById(R.id.button_click);
        button_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMessage.show();
            }
        });
    }


}
