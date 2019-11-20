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

public class Suvenir extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.suvenir);

        //Load image via Link(memory management)

        ImageView imageView = findViewById(R.id.imagine_suvenir);
        Picasso.get().load("https://i.imgur.com/L6xlarR.jpg").into(imageView);

        //intent to google maps + animation button

        final ImageButton locationSuvenir = findViewById(R.id.location_suvenir);
        locationSuvenir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Suvenir.this, R.anim.bounce);
                locationSuvenir.startAnimation(animation);

                //navigating to the location

                Uri gmmIntentUri = Uri.parse("google.navigation:q=Romania+Boutique,+Bucharest+Romania");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

                Toast toast = Toast.makeText(getApplicationContext(), "Opening Google Maps", Toast.LENGTH_LONG);
                toast.show();

            }
        });

        // opening trip advisor site + button animation
        final ImageButton tripSuvenir = findViewById(R.id.trip_suvenir);
        tripSuvenir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Suvenir.this, R.anim.bounce);
                tripSuvenir.startAnimation(animation);

                Uri webpage = Uri.parse("https://www.tripadvisor.com/Attraction_Review-g294458-d7682537-Reviews-Romanian_Boutique-Bucharest.html");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
                Toast toast = Toast.makeText(getApplicationContext(), "Opening Tripadvisor.com", Toast.LENGTH_LONG);
                toast.show();


            }
        });

        //Opening Souvenir Site

        final ImageButton siteSuvenir = findViewById(R.id.site_suvenir);
        siteSuvenir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Suvenir.this, R.anim.bounce);
                siteSuvenir.startAnimation(animation);

                Uri webpage = Uri.parse("http://www.romanianboutique.ro/");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
                Toast toast = Toast.makeText(getApplicationContext(), "Opening romanianboutique.ro", Toast.LENGTH_LONG);
                toast.show();
            }

        });

        //Contact button Red Patrol bar

        final ImageButton contactSuvenir= findViewById(R.id.contact_suvenir);
        contactSuvenir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Suvenir.this, R.anim.bounce);
                contactSuvenir.startAnimation(animation);

                String phoneNumber = " 0721 389 927";
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
