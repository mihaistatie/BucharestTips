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

import java.sql.Struct;

public class Tren extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tren);

        //Load image via Link(memory management)

        ImageView imageView = findViewById(R.id.imagine_tren);
        Picasso.get().load("https://i.imgur.com/lLGlTbI.jpg").into(imageView);

        //intent to google maps + animation button

        final ImageButton locationTren = findViewById(R.id.location_tren);
        locationTren.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Tren.this,R.anim.bounce);
                locationTren .startAnimation(animation);

                //navigating to the location

                Uri gmmIntentUri = Uri.parse("google.navigation:q=Garad+de+Nord,+Bucharest+Romania");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

                Toast toast=Toast.makeText(getApplicationContext(),"Opening Google Maps",Toast.LENGTH_LONG);
                toast.show();

            }
        });

        // opening trip advisor site + button animation
        final ImageButton tripTren = findViewById(R.id.trip_tren);
        tripTren.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Tren.this,R.anim.bounce);
                tripTren .startAnimation(animation);

                Uri webpage = Uri.parse("https://www.tripadvisor.com/Attraction_Review-g294458-d7904776-Reviews-Gara_de_Nord_Bucharest_North_Train_Station-Bucharest.html");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
                Toast toast=Toast.makeText(getApplicationContext(),"Opening Tripadvisor.com",Toast.LENGTH_LONG);
                toast.show();


            }
        });

        //Opening Tren Site

        final ImageButton siteTren = findViewById(R.id.site_tren);
        siteTren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Tren.this, R.anim.bounce);
                siteTren.startAnimation(animation);

                Uri webpage = Uri.parse("https://www.cfrcalatori.ro/en/");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
                Toast toast = Toast.makeText(getApplicationContext(), "Opening cfrcalatori.ro", Toast.LENGTH_LONG);
                toast.show();
            }

        });

         //Contact button Tren
        final ImageButton contactTren = findViewById(R.id.contact_tren);
        contactTren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Tren.this, R.anim.bounce);
                contactTren.startAnimation(animation);

                String phoneNumber = "(021) 9521";
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


