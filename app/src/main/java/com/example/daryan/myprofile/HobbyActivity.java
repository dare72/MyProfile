package com.example.daryan.myprofile;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HobbyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hobby);
    }

    /**
     * User clicks on the image and it goes Gig Harbor MMA website.
     * @param view view of page
     */
    public void goToURL(View view) {
        String url = "http://www.gigharbormma.com/";
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    /**
     * User clicks on the button to go to the next page.
     * @param view view of the page
     */
    public void goToMap(View view) {
        Button btn = findViewById(R.id.map_btn); //Connects backend to frontend UI

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HobbyActivity.this, MapActivity.class));
            }
        });
    }
}
