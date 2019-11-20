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

public class Hanu  extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hanu);

        //Load image via Link(memory management)

        ImageView imageView = findViewById(R.id.imagine_hanu);
        Picasso.get().load("https://i.imgur.com/jtyE42Q.jpg").into(imageView);

        //intent to google maps + animation button

        final ImageButton locationHanu = findViewById(R.id.location_hanu);
        locationHanu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Hanu.this,R.anim.bounce);
                locationHanu.startAnimation(animation);

                //navigating to the location

                Uri gmmIntentUri = Uri.parse("google.navigation:q=Hanu+lui+Manuc,+Bucharest+Romania");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

                Toast toast=Toast.makeText(getApplicationContext(),"Opening Google Maps",Toast.LENGTH_LONG);
                toast.show();

            }
        });

        // opening trip advisor site + button animation
        final ImageButton tripHanu = findViewById(R.id.trip_hanu);
        tripHanu .setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Hanu.this,R.anim.bounce);
                tripHanu .startAnimation(animation);

                Uri webpage = Uri.parse("https://www.tripadvisor.com/Restaurant_Review-g294458-d739908-Reviews-Restaurant_Hanu_lui_Manuc-Bucharest.html");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
                Toast toast=Toast.makeText(getApplicationContext(),"Opening Tripadvisor.com",Toast.LENGTH_LONG);
                toast.show();


            }
        });

        //Opening Hanu lu' Manuc Site

        final ImageButton siteHanu = findViewById(R.id.site_hanu);
        siteHanu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Hanu.this, R.anim.bounce);
                siteHanu.startAnimation(animation);

                Uri webpage = Uri.parse("https://www.hanulluimanuc.ro/en/");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
                Toast toast = Toast.makeText(getApplicationContext(), "Opening hanulluimanuc.ro", Toast.LENGTH_LONG);
                toast.show();
            }

        });

        //Contact button Hanu lui Manuc

        final ImageButton contactHanu = findViewById(R.id.contact_hanu);
        contactHanu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Hanu.this, R.anim.bounce);
                contactHanu.startAnimation(animation);

                String phoneNumber = "0730 188 653";
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
