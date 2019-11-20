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

public class Res18 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.res18);

        //Load image via Link(memory management)

        ImageView imageView = findViewById(R.id.imagine_res18);
        Picasso.get().load("https://i.imgur.com/lVjVJ4Y.jpg").into(imageView);

        //intent to google maps + animation button

        final ImageButton locationRes18 = findViewById(R.id.location_res18);
        locationRes18.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Res18.this,R.anim.bounce);
                locationRes18.startAnimation(animation);

                //navigating to the location

                Uri gmmIntentUri = Uri.parse("google.navigation:q=18+Lounge,+Bucharest+Romania");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

                Toast toast=Toast.makeText(getApplicationContext(),"Opening Google Maps",Toast.LENGTH_LONG);
                toast.show();

            }
        });

        // opening trip advisor site + button animation
        final ImageButton tripRes18= findViewById(R.id.trip_res18);
        tripRes18 .setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Res18.this,R.anim.bounce);
                tripRes18 .startAnimation(animation);

                Uri webpage = Uri.parse("https://www.tripadvisor.com/Restaurant_Review-g294458-d3669410-Reviews-18-Bucharest.html");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
                Toast toast=Toast.makeText(getApplicationContext(),"Opening Tripadvisor.com",Toast.LENGTH_LONG);
                toast.show();


            }
        });

        //Opening 18 Lounge Fusion Bar Site

        final ImageButton siteRes18 = findViewById(R.id.site_res18);
        siteRes18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Res18.this, R.anim.bounce);
                siteRes18.startAnimation(animation);

                Uri webpage = Uri.parse("https://www.18lounge.ro/");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
                Toast toast = Toast.makeText(getApplicationContext(), "Opening 18lounge.ro", Toast.LENGTH_LONG);
                toast.show();
            }

        });

        //Contact button 18Lounge food bar

        final ImageButton contactRes18 = findViewById(R.id.contact_res18);
        contactRes18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Res18.this, R.anim.bounce);
                contactRes18.startAnimation(animation);

                String phoneNumber = "0733 501 401";
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
