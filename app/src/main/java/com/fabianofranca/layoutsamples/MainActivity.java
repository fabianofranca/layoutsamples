package com.fabianofranca.layoutsamples;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final FrameLayout container = (FrameLayout)findViewById(R.id.container);

        Button hierarchy = (Button)findViewById(R.id.hierarchy);

        hierarchy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Hierarchy.class);
                startActivity(intent);
            }
        });

        Button overDraw = (Button)findViewById(R.id.over_draw);

        overDraw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, OverDraw.class);
                startActivity(intent);
            }
        });
    }
}
