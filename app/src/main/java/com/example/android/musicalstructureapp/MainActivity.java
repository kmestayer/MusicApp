package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);


        // Find the View that shows the numbers category
        TextView song1 = (TextView) findViewById(R.id.song1);

        // Set a click listener on that View
        song1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent song1Intent = new Intent(MainActivity.this, SongOneActivity.class);
                startActivity(song1Intent);
            }
        });

        // Find the View that shows the family category
        TextView song2 = (TextView) findViewById(R.id.song2);

        // Set a click listener on that View
        song2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent song2Intent = new Intent(MainActivity.this, SongTwoActivity.class);

                // Start the new activity
                startActivity(song2Intent);
            }
        });

        // Find the View that shows the colors category
        TextView song3 = (TextView) findViewById(R.id.song3);

        // Set a click listener on that View
        song3.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ColorsActivity}
                Intent song3Intent = new Intent(MainActivity.this, SongThreeActivity.class);

                // Start the new activity
                startActivity(song3Intent);
            }
        });

        // Find the View that shows the phrases category
        TextView song4 = (TextView) findViewById(R.id.song4);

        // Set a click listener on that View
        song4.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent song4Intent = new Intent(MainActivity.this, SongFourActivity.class);

                // Start the new activity
                startActivity(song4Intent);
            }
        });


    }
}
