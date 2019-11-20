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

public class Cec extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cec);




            //Load image via Link(memory management)

            ImageView imageView = findViewById(R.id.imagine_cec);
            Picasso.get().load("https://i.imgur.com/iWEsDmw.jpg").into(imageView);

            //intent to google maps + animation button

            final ImageButton locationCec = findViewById(R.id.location_cec);
            locationCec.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {

                    //make the button to bounce
                    Animation animation = AnimationUtils.loadAnimation(Cec.this,R.anim.bounce);
                    locationCec .startAnimation(animation);

                    //navigating to the location

                    Uri gmmIntentUri = Uri.parse("google.navigation:q=Palatul+Cec,+Bucharest+Romania");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    mapIntent.setPackage("com.google.android.apps.maps");
                    startActivity(mapIntent);

                    Toast toast=Toast.makeText(getApplicationContext(),"Opening Google Maps",Toast.LENGTH_LONG);
                    toast.show();

                }
            });

            // opening trip advisor site + button animation
            final ImageButton tripCec = findViewById(R.id.trip_cec);
            tripCec .setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {

                    //make the button to bounce
                    Animation animation = AnimationUtils.loadAnimation(Cec.this,R.anim.bounce);
                    tripCec .startAnimation(animation);

                    Uri webpage = Uri.parse("https://www.tripadvisor.com/Attraction_Review-g294458-d2645986-Reviews-CEC_Palace-Bucharest.html");
                    Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                    startActivity(intent);
                    Toast toast=Toast.makeText(getApplicationContext(),"Opening Tripadvisor.com",Toast.LENGTH_LONG);
                    toast.show();


                }
            });
    }
}
