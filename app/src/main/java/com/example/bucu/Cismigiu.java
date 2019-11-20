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

public class Cismigiu extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cismigiu);

        //Load image via Link(memory management)

        ImageView imageView = findViewById(R.id.imagine_cismigiu);
        Picasso.get().load("https://i.imgur.com/2IW08Ci.jpg").into(imageView);

        //intent to google maps + animation button

        final ImageButton locationCismigiu = findViewById(R.id.location_cismigiu);
        locationCismigiu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Cismigiu.this,R.anim.bounce);
                locationCismigiu.startAnimation(animation);

                //navigating to the location

                Uri gmmIntentUri = Uri.parse("google.navigation:q=Cismigiu+Bistrou+La+Etaj,+Bucharest+Romania");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

                Toast toast=Toast.makeText(getApplicationContext(),"Opening Google Maps",Toast.LENGTH_LONG);
                toast.show();

            }
        });

        // opening trip advisor site + button animation
        final ImageButton tripCismigiu= findViewById(R.id.trip_cismigiu);
        tripCismigiu .setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Cismigiu.this,R.anim.bounce);
                tripCismigiu .startAnimation(animation);

                Uri webpage = Uri.parse("https://www.tripadvisor.com/Restaurant_Review-g294458-d15034018-Reviews-Cismigiu_Bistro_la_Etaj-Bucharest.html");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
                Toast toast=Toast.makeText(getApplicationContext(),"Opening Tripadvisor.com",Toast.LENGTH_LONG);
                toast.show();


            }
        });

        //Opening Cismigiu Bistro Site

        final ImageButton siteCismigiu = findViewById(R.id.site_cismigiu);
        siteCismigiu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Cismigiu.this, R.anim.bounce);
                siteCismigiu.startAnimation(animation);

                Uri webpage = Uri.parse("http://cismigiu.ro/en/");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
                Toast toast = Toast.makeText(getApplicationContext(), "Opening cismigiu.ro", Toast.LENGTH_LONG);
                toast.show();
            }

        });

        //Contact button Cismigiu Bistro

        final ImageButton contactCismigiu = findViewById(R.id.contact_cismigiu);
        contactCismigiu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Cismigiu.this, R.anim.bounce);
                contactCismigiu.startAnimation(animation);

                String phoneNumber = "0722 722 227";
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
