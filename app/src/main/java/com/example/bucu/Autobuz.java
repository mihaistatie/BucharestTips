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

public class  Autobuz extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.autobuz);

        //Load image via Link(memory management)

        ImageView imageView = findViewById(R.id.imagine_autobuz);
        Picasso.get().load("https://i.imgur.com/WFpBlWp.jpg").into(imageView);

        //intent to google maps + animation button

        final ImageButton locationAutobuz = findViewById(R.id.location_autobuz);
        locationAutobuz.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Autobuz.this,R.anim.bounce);
                locationAutobuz .startAnimation(animation);

                //navigating to the location

                Uri gmmIntentUri = Uri.parse("google.navigation:q=Bucharest+City+Tour,+Bucharest+Romania");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

                Toast toast=Toast.makeText(getApplicationContext(),"Opening Google Maps",Toast.LENGTH_LONG);
                toast.show();

            }
        });

        // opening trip advisor site + button animation
        final ImageButton tripAutobuz = findViewById(R.id.trip_autobuz);
        tripAutobuz .setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Autobuz.this,R.anim.bounce);
                tripAutobuz .startAnimation(animation);

                Uri webpage = Uri.parse("https://www.tripadvisor.com/Attraction_Review-g294458-d2512747-Reviews-Bucharest_Hop_on_Hop_off_Sightseeing_Bus_tour-Bucharest.html");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
                Toast toast=Toast.makeText(getApplicationContext(),"Opening Tripadvisor.com",Toast.LENGTH_LONG);
                toast.show();


            }
        });

        //Opening Autobuz Site

        final ImageButton siteAutobuz = findViewById(R.id.site_autobuz);
        siteAutobuz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Autobuz.this, R.anim.bounce);
                siteAutobuz.startAnimation(animation);

                Uri webpage = Uri.parse("http://bucharestcitytour.stbsa.ro/index_eng.html");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
                Toast toast = Toast.makeText(getApplicationContext(), "Opening bucharestcitytour.ro", Toast.LENGTH_LONG);
                toast.show();
            }

        });


        final ImageButton contactAutobuz = findViewById(R.id.contact_autobuz);
        contactAutobuz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Autobuz.this, R.anim.bounce);
                contactAutobuz.startAnimation(animation);

                    String phoneNumber = "(021) 307 4212";
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" + phoneNumber));
                    if (intent.resolveActivity(getPackageManager()) != null) {
                        startActivity(intent);

                        Toast toast = Toast.makeText(getApplicationContext(), "Making a call", Toast.LENGTH_LONG);
                        toast.show();
                    }



            }

        });

    }
}
