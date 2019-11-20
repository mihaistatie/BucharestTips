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

import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.NetworkPolicy;
import com.squareup.picasso.Picasso;

public class Arc extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.arc);


        //Load image via Link(memory management)

        imageView = findViewById(R.id.imagine_arc);
        Picasso.get().load("https://i.imgur.com/IrqnbNq.jpg").into(imageView);






        //intent to google maps + animation button
        final ImageButton locationArch = findViewById(R.id.location_arch);
        locationArch.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Arc.this,R.anim.bounce);
                locationArch.startAnimation(animation);

                //navigating to the location

                Uri gmmIntentUri = Uri.parse("google.navigation:q=Arc+Triumf,+Bucharest+Romania");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

                Toast toast=Toast.makeText(getApplicationContext(),"Opening Google Maps",Toast.LENGTH_LONG);
                toast.show();

            }
        });

        // opening trip advisor site + button animation
        final ImageButton tripArch = findViewById(R.id.trip_arch);
        tripArch.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Arc.this,R.anim.bounce);
                tripArch.startAnimation(animation);

                Uri webpage = Uri.parse("https://www.tripadvisor.com/Attraction_Review-g294458-d548228-Reviews-Triumph_Arch-Bucharest.html");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
                Toast toast=Toast.makeText(getApplicationContext(),"Opening Tripadvisor.com",Toast.LENGTH_LONG);
                toast.show();


            }
        });


    }
}
