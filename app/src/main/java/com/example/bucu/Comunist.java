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

public class Comunist extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.comunist);

        //Load image via Link(memory management)

        ImageView imageView = findViewById(R.id.imagine_comunist);
        Picasso.get().load("https://i.imgur.com/SPVECnN.jpg").into(imageView);

        //intent to google maps + animation button

        final ImageButton locationComunist = findViewById(R.id.location_comunist);
        locationComunist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Comunist.this, R.anim.bounce);
                locationComunist.startAnimation(animation);

                //navigating to the location

                Uri gmmIntentUri = Uri.parse("google.navigation:q=Red+Patrol,+Bucharest+Romania");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

                Toast toast = Toast.makeText(getApplicationContext(), "Opening Google Maps", Toast.LENGTH_LONG);
                toast.show();

            }
        });

        // opening trip advisor site + button animation
        final ImageButton tripComunist = findViewById(R.id.trip_comunist);
        tripComunist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Comunist.this, R.anim.bounce);
                tripComunist.startAnimation(animation);

                Uri webpage = Uri.parse("https://www.tripadvisor.com/AttractionProductReview-g294458-d15040186-RedPatrol_Communist_Tour_with_Dacia-Bucharest.html");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
                Toast toast = Toast.makeText(getApplicationContext(), "Opening Tripadvisor.com", Toast.LENGTH_LONG);
                toast.show();


            }
        });

        //Opening Pizza Latin Site

        final ImageButton siteComunist = findViewById(R.id.site_comunist);
        siteComunist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Comunist.this, R.anim.bounce);
                siteComunist.startAnimation(animation);

                Uri webpage = Uri.parse("https://redpatrol.ro/");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
                Toast toast = Toast.makeText(getApplicationContext(), "Opening redpatrol.ro", Toast.LENGTH_LONG);
                toast.show();
            }

        });

        //Contact button Red Patrol bar

        final ImageButton contactComunist= findViewById(R.id.contact_comunist);
        contactComunist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Comunist.this, R.anim.bounce);
                contactComunist.startAnimation(animation);

                String phoneNumber = "0723 638 664";
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + phoneNumber));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);

                }

                Toast toast = Toast.makeText(getApplicationContext(), "Making a call", Toast.LENGTH_LONG);
                toast.show();


            }

        });
    }
}
