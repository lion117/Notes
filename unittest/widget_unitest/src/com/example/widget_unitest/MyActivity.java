package com.example.widget_unitest;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */

//    final  Button btn_img;
    ImageButton imag_btn;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        imag_btn = (ImageButton)findViewById(R.id.img_btn);
        imag_btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                imag_btn.setImageDrawable(Drawable.createFromPath("E:/Git_open_project/Notes/unittest/widget_unitest/res/drawable-xhdpi/new_note_pressed.png"));
                }
                else if (event.getAction() == MotionEvent.ACTION_UP) {
                    imag_btn.setImageDrawable(Drawable.createFromPath("E:/Git_open_project/Notes/unittest/widget_unitest/res/drawable-xhdpi/new_note_normal.png"));
                }

                return  false;
            }
        });
    }







}
