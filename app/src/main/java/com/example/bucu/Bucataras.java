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

public class Bucataras extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bucataras);

        //Load image via Link(memory management)

        ImageView imageView = findViewById(R.id.imagine_bucataras);
        Picasso.get().load("https://i.imgur.com/8dkPK9k.jpg").into(imageView);

        //intent to google maps + animation button

        final ImageButton locationBucataras = findViewById(R.id.location_bucataras);
        locationBucataras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Bucataras.this, R.anim.bounce);
                locationBucataras.startAnimation(animation);

                //navigating to the location

                Uri gmmIntentUri = Uri.parse("google.navigation:q=Bucatarasul+Cel+Dibaci,+Bucharest+Romania");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

                Toast toast = Toast.makeText(getApplicationContext(), "Opening Google Maps", Toast.LENGTH_LONG);
                toast.show();

            }
        });

        // opening trip advisor site + button animation
        final ImageButton tripBucataras = findViewById(R.id.trip_bucataras);
        tripBucataras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Bucataras.this, R.anim.bounce);
                tripBucataras.startAnimation(animation);

                Uri webpage = Uri.parse("https://www.tripadvisor.com/Restaurant_Review-g294458-d5269917-Reviews-Bucatarasul_cel_Dibaci-Bucharest.html");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
                Toast toast = Toast.makeText(getApplicationContext(), "Opening Tripadvisor.com", Toast.LENGTH_LONG);
                toast.show();


            }
        });

        //Opening Bucatarasul cel dibaci  Site

        final ImageButton siteBucataras = findViewById(R.id.site_bucataras);
        siteBucataras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Bucataras.this, R.anim.bounce);
                siteBucataras.startAnimation(animation);

                Uri webpage = Uri.parse("https://www.bucatarasul.ro/");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
                Toast toast = Toast.makeText(getApplicationContext(), "Opening bucatarasul.ro", Toast.LENGTH_LONG);
                toast.show();
            }

        });

        //Contact button Nor sky bar

        final ImageButton contactBucataras = findViewById(R.id.contact_bucataras);
        contactBucataras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Bucataras.this, R.anim.bounce);
                contactBucataras.startAnimation(animation);

                String phoneNumber = "0730 340 436";
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
