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

public class Ciorbarie extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ciorbarie);

        //Load image via Link(memory management)

        ImageView imageView = findViewById(R.id.imagine_ciorbarie);
        Picasso.get().load("https://i.imgur.com/2Kh4ngQ.jpg").into(imageView);

        //intent to google maps + animation button

        final ImageButton locationCiorbarie = findViewById(R.id.location_ciorbarie);
        locationCiorbarie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Ciorbarie.this, R.anim.bounce);
                locationCiorbarie.startAnimation(animation);

                //navigating to the location

                Uri gmmIntentUri = Uri.parse("google.navigation:q=Calea+Dorobanti+71,+Bucharest+Romania");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

                Toast toast = Toast.makeText(getApplicationContext(), "Opening Google Maps", Toast.LENGTH_LONG);
                toast.show();

            }
        });

        // opening trip advisor site + button animation
        final ImageButton tripCiorbarie = findViewById(R.id.trip_ciorbarie);
        tripCiorbarie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Ciorbarie.this, R.anim.bounce);
                tripCiorbarie.startAnimation(animation);

                Uri webpage = Uri.parse("https://www.tripadvisor.com/Restaurant_Review-g294458-d11910072-Reviews-Ciorbarie-Bucharest.html");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
                Toast toast = Toast.makeText(getApplicationContext(), "Opening Tripadvisor.com", Toast.LENGTH_LONG);
                toast.show();


            }
        });

        //Opening Ciorbarie  Site

        final ImageButton siteCiorbarie = findViewById(R.id.site_ciorbarie);
        siteCiorbarie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Ciorbarie.this, R.anim.bounce);
                siteCiorbarie.startAnimation(animation);

                Uri webpage = Uri.parse("http://ciorbarie.ro/");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
                Toast toast = Toast.makeText(getApplicationContext(), "Opening ciorbarie.ro", Toast.LENGTH_LONG);
                toast.show();
            }

        });

        //Contact button Nor sky bar

        final ImageButton contactCiorbarie= findViewById(R.id.contact_ciorbarie);
        contactCiorbarie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Ciorbarie.this, R.anim.bounce);
                contactCiorbarie.startAnimation(animation);

                String phoneNumber = "0772 039 002";
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
