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

public class Cafe extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cafe);

        //Load image via Link(memory management)

        ImageView imageView = findViewById(R.id.imagine_cafe);
        Picasso.get().load("https://i.imgur.com/Dc0fkcA.jpg").into(imageView);

        //intent to google maps + animation button

        final ImageButton locationCafe = findViewById(R.id.location_cafe);
        locationCafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Cafe.this, R.anim.bounce);
                locationCafe.startAnimation(animation);

                //navigating to the location

                Uri gmmIntentUri = Uri.parse("google.navigation:q=Seneca+Anticafe,+Bucharest+Romania");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

                Toast toast = Toast.makeText(getApplicationContext(), "Opening Google Maps", Toast.LENGTH_LONG);
                toast.show();

            }
        });

        // opening trip advisor site + button animation
        final ImageButton tripCafe = findViewById(R.id.trip_cafe);
        tripCafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Cafe.this, R.anim.bounce);
                tripCafe.startAnimation(animation);

                Uri webpage = Uri.parse("https://www.tripadvisor.com/Restaurant_Review-g294458-d7790370-Reviews-Seneca_Anticafe-Bucharest.html");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
                Toast toast = Toast.makeText(getApplicationContext(), "Opening Tripadvisor.com", Toast.LENGTH_LONG);
                toast.show();


            }
        });

        //Opening Souvenir Site

        final ImageButton siteCafe = findViewById(R.id.site_cafe);
        siteCafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Cafe.this, R.anim.bounce);
                siteCafe.startAnimation(animation);

                Uri webpage = Uri.parse("https://www.senecanticafe.ro/t-en");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
                Toast toast = Toast.makeText(getApplicationContext(), "Opening senecanticafe.ro", Toast.LENGTH_LONG);
                toast.show();
            }

        });

        //Contact button Seneca anticafe

        final ImageButton contactCafe= findViewById(R.id.contact_cafe);
        contactCafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Cafe.this, R.anim.bounce);
                contactCafe.startAnimation(animation);

                String phoneNumber = " 0720 331 100";
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
