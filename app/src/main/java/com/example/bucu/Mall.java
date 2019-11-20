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

public class Mall  extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mall);

        //Load image via Link(memory management)

        ImageView imageView = findViewById(R.id.imagine_mall);
        Picasso.get().load("https://i.imgur.com/eTXAlfN.jpg").into(imageView);

        //intent to google maps + animation button

        final ImageButton locationMall = findViewById(R.id.location_mall);
        locationMall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Mall.this, R.anim.bounce);
                locationMall.startAnimation(animation);

                //navigating to the location

                Uri gmmIntentUri = Uri.parse("google.navigation:q=AFI+Cotroceni,+Bucharest+Romania");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

                Toast toast = Toast.makeText(getApplicationContext(), "Opening Google Maps", Toast.LENGTH_LONG);
                toast.show();

            }
        });

        // opening trip advisor site + button animation
        final ImageButton tripMall = findViewById(R.id.trip_mall);
        tripMall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Mall.this, R.anim.bounce);
                tripMall.startAnimation(animation);

                Uri webpage = Uri.parse("https://www.tripadvisor.com/Attraction_Review-g294458-d3340332-Reviews-AFI_Cotroceni-Bucharest.html");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
                Toast toast = Toast.makeText(getApplicationContext(), "Opening Tripadvisor.com", Toast.LENGTH_LONG);
                toast.show();


            }
        });

        //Opening Souvenir Site

        final ImageButton siteMall = findViewById(R.id.site_mall);
        siteMall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Mall.this, R.anim.bounce);
                siteMall.startAnimation(animation);

                Uri webpage = Uri.parse("https://www.en.aficotroceni.ro/");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
                Toast toast = Toast.makeText(getApplicationContext(), "Opening aficotroceni.ro", Toast.LENGTH_LONG);
                toast.show();
            }

        });

        //Contact button Red Patrol bar

        final ImageButton contactMall= findViewById(R.id.contact_mall);
        contactMall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Mall.this, R.anim.bounce);
                contactMall.startAnimation(animation);

                String phoneNumber = " 031 425 7510";
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
