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

public class Ateneu extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ateneu);


        //Load image via Link(memory management)

        ImageView imageView = findViewById(R.id.imagine_ateneu);
        Picasso.get().load("https://i.imgur.com/1JUK22t.jpg").into(imageView);

        //intent to google maps + animation button

        final ImageButton locationAteneu = findViewById(R.id.location_ateneu);
        locationAteneu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Ateneu.this,R.anim.bounce);
                locationAteneu .startAnimation(animation);

                //navigating to the location

                Uri gmmIntentUri = Uri.parse("google.navigation:q=Ateneul+Roman,+Bucharest+Romania");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

                Toast toast=Toast.makeText(getApplicationContext(),"Opening Google Maps",Toast.LENGTH_LONG);
                toast.show();

            }
        });

        // opening trip advisor site + button animation
        final ImageButton tripAteneu = findViewById(R.id.trip_ateneu);
        tripAteneu .setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Ateneu.this,R.anim.bounce);
                tripAteneu .startAnimation(animation);

                Uri webpage = Uri.parse("https://www.tripadvisor.com/Attraction_Review-g294458-d523712-Reviews-Romanian_Athenaeum_Ateneul_Roman-Bucharest.html");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
                Toast toast=Toast.makeText(getApplicationContext(),"Opening Tripadvisor.com",Toast.LENGTH_LONG);
                toast.show();


            }
        });

        //Opening Atheneu Site

        final ImageButton siteAteneu = findViewById(R.id.site_ateneu);
        siteAteneu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Ateneu.this, R.anim.bounce);
                siteAteneu.startAnimation(animation);

                Uri webpage = Uri.parse("https://www.fge.org.ro/");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
                Toast toast = Toast.makeText(getApplicationContext(), "Opening fge.ro", Toast.LENGTH_LONG);
                toast.show();
            }

        });


        //Contact button ateneu

        final ImageButton contactAteneu= findViewById(R.id.contact_ateneu);
        contactAteneu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Ateneu.this, R.anim.bounce);
                contactAteneu.startAnimation(animation);

                String phoneNumber = "021 315 6875";
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
