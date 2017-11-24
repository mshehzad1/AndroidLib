package com.origami.myandroidlibray;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.origami.androidlib.MapsActivity;
import com.origami.androidlib.MyView;
import com.origami.androidlib.SimpleActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View view = new MyView(this);
        setContentView(view);

        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }
}
