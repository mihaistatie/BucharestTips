package com.example.bucu;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class Parlament extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parlament);

        //Load image via Link(memory management)

        ImageView imageView = findViewById(R.id.imagine_parlament);
        Picasso.get().load("https://i.imgur.com/bJEPWfn.png").into(imageView);

        //intent to google maps + animation button

        final ImageButton locationParlament= findViewById(R.id.location_parlament);
        locationParlament.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Parlament.this,R.anim.bounce);
                locationParlament .startAnimation(animation);

                //navigating to the location

                Uri gmmIntentUri = Uri.parse("google.navigation:q=Casa+Poporului,+Bucharest+Romania");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

                Toast toast=Toast.makeText(getApplicationContext(),"Opening Google Maps",Toast.LENGTH_LONG);
                toast.show();

            }
        });

        // opening trip advisor site + button animation
        final ImageButton tripParlament = findViewById(R.id.trip_parlament);
        tripParlament .setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Parlament.this,R.anim.bounce);
                tripParlament .startAnimation(animation);

                Uri webpage = Uri.parse("https://www.tripadvisor.com/Attraction_Review-g294458-d318176-Reviews-Palace_of_Parliament-Bucharest.html");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
                Toast toast=Toast.makeText(getApplicationContext(),"Opening Tripadvisor.com",Toast.LENGTH_LONG);
                toast.show();


            }
        });

        //Opening Centru Site

        final ImageButton siteParlament = findViewById(R.id.site_parlament);
        siteParlament.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Parlament.this, R.anim.bounce);
                siteParlament.startAnimation(animation);

                Uri webpage = Uri.parse("http://cic.cdep.ro/en");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
                Toast toast = Toast.makeText(getApplicationContext(), "Opening cic.cdep.ro/en", Toast.LENGTH_LONG);
                toast.show();
            }

        });
    }
}
