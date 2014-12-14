package com.example.frametest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by 启 on 2014/9/17.
 */
public class FrameLayoutTest extends Activity implements View.OnClickListener{
    private Button button1, button2;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.framelayout_test);
        imageView = (ImageView)findViewById(R.id.img);
        button1 =(Button)findViewById(R.id.button1);
        button2 =(Button)findViewById(R.id.button2);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button1:
                imageView.setVisibility(View.INVISIBLE);
                break;
            case  R.id.button2:
                imageView.setVisibility(View.VISIBLE);
                break;

        }
    }
}
