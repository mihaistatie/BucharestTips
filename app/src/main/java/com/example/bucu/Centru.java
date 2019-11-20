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

public class Centru extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.centru);


        //Load image via Link(memory management)

        ImageView imageView = findViewById(R.id.imagine_centru);
        Picasso.get().load("https://i.imgur.com/m9I9BBc.png").into(imageView);

        //intent to google maps + animation button

        final ImageButton locationCentru= findViewById(R.id.location_centru);
        locationCentru.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Centru.this,R.anim.bounce);
                locationCentru .startAnimation(animation);

                //navigating to the location

                Uri gmmIntentUri = Uri.parse("google.navigation:q=Centrul+Vechi,+Bucharest+Romania");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

                Toast toast=Toast.makeText(getApplicationContext(),"Opening Google Maps",Toast.LENGTH_LONG);
                toast.show();

            }
        });

        // opening trip advisor site + button animation
        final ImageButton tripCentru = findViewById(R.id.trip_centru);
        tripCentru .setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Centru.this,R.anim.bounce);
                tripCentru .startAnimation(animation);

                Uri webpage = Uri.parse("https://www.tripadvisor.com/Attraction_Review-g294458-d554991-Reviews-Old_Town-Bucharest.html");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
                Toast toast=Toast.makeText(getApplicationContext(),"Opening Tripadvisor.com",Toast.LENGTH_LONG);
                toast.show();


            }
        });

        //Opening Centru Site

        final ImageButton siteCentru = findViewById(R.id.site_centru);
        siteCentru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Centru.this, R.anim.bounce);
                siteCentru.startAnimation(animation);

                Uri webpage = Uri.parse("https://www.pelipscani.ro/");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
                Toast toast = Toast.makeText(getApplicationContext(), "Opening pelipscani.ro", Toast.LENGTH_LONG);
                toast.show();
            }

        });
    }
}
