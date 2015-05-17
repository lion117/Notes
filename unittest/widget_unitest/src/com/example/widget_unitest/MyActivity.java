package com.example.widget_unitest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */

    final  Button btn_img;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        btn_img = (Button)findViewById(R.id.btn_img);
        btn_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                
            }
        });




    }



}
