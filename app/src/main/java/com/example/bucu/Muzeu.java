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

public class Muzeu extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.muzeu);

        //Load image via Link(memory management)

        ImageView imageView = findViewById(R.id.imagine_muzeu);
        Picasso.get().load("https://i.imgur.com/pTsaWhs.jpg").into(imageView);

        //intent to google maps + animation button

        final ImageButton locationMuzeu = findViewById(R.id.location_muzeu);
        locationMuzeu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Muzeu.this,R.anim.bounce);
                locationMuzeu .startAnimation(animation);

                //navigating to the location

                Uri gmmIntentUri = Uri.parse("google.navigation:q=Muzeul+Antipa,+Bucharest+Romania");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

                Toast toast=Toast.makeText(getApplicationContext(),"Opening Google Maps",Toast.LENGTH_LONG);
                toast.show();

            }
        });

        // opening trip advisor site + button animation
        final ImageButton tripMuzeu = findViewById(R.id.trip_muzeu);
        tripMuzeu .setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Muzeu.this,R.anim.bounce);
                tripMuzeu .startAnimation(animation);

                Uri webpage = Uri.parse("https://www.tripadvisor.com/Attraction_Review-g294458-d2624832-Reviews-Grigore_Antipa_National_Museum_of_Natural_History-Bucharest.html");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
                Toast toast=Toast.makeText(getApplicationContext(),"Opening Tripadvisor.com",Toast.LENGTH_LONG);
                toast.show();


            }
        });

        //Opening Autobuz Site

        final ImageButton siteMuzeu = findViewById(R.id.site_muzeu);
        siteMuzeu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Muzeu.this, R.anim.bounce);
                siteMuzeu.startAnimation(animation);

                Uri webpage = Uri.parse("https://antipa.ro/");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
                Toast toast = Toast.makeText(getApplicationContext(), "Opening antipa  .ro", Toast.LENGTH_LONG);
                toast.show();
            }

        });
    }
}
