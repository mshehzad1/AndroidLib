package com.origami.myandroidlibray;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.origami.androidlib.MyView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View view = new MyView(this);
        setContentView(view);
    }
}
