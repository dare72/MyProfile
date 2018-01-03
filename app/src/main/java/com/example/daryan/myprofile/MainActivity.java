package com.example.daryan.myprofile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Switches to next activity page
     * @param view view of the page
     */
    public void switchActivity(View view) {

        Button btn = findViewById(R.id.hobby_btn);

        //On click listener to go to a new activity.
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, HobbyActivity.class));
            }
        });
    }
}
