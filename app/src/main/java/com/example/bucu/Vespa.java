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

public class Vespa extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vespa);

        //Load image via Link(memory management)

        ImageView imageView = findViewById(R.id.imagine_vespa);
        Picasso.get().load("https://i.imgur.com/8MCY6Z6.jpg").into(imageView);

        //intent to google maps + animation button

        final ImageButton locationVespa = findViewById(R.id.location_vespa);
        locationVespa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Vespa.this, R.anim.bounce);
                locationVespa.startAnimation(animation);

                //navigating to the location

                Uri gmmIntentUri = Uri.parse("google.navigation:q=Calea+Victoriei+143,+Bucharest+Romania");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

                Toast toast = Toast.makeText(getApplicationContext(), "Opening Google Maps", Toast.LENGTH_LONG);
                toast.show();

            }
        });

        // opening trip advisor site + button animation
        final ImageButton tripVespa = findViewById(R.id.trip_vespa);
        tripVespa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Vespa.this, R.anim.bounce);
                tripVespa.startAnimation(animation);

                Uri webpage = Uri.parse("https://www.tripadvisor.co.nz/Attraction_Review-g294458-d13108550-Reviews-VespaBucharest-Bucharest.html");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
                Toast toast = Toast.makeText(getApplicationContext(), "Opening Tripadvisor.com", Toast.LENGTH_LONG);
                toast.show();


            }
        });

        //Opening Vespa Site

        final ImageButton siteVespa = findViewById(R.id.site_vespa);
        siteVespa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Vespa.this, R.anim.bounce);
                siteVespa.startAnimation(animation);

                Uri webpage = Uri.parse("https://vespabucharest.ro/");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
                Toast toast = Toast.makeText(getApplicationContext(), "Opening vespabucharest.ro", Toast.LENGTH_LONG);
                toast.show();
            }

        });

        //Contact button Vespa
        final ImageButton contactVespa = findViewById(R.id.contact_vespa);
        contactVespa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Vespa.this, R.anim.bounce);
                contactVespa.startAnimation(animation);

                String phoneNumber = "0721151527";
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

