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

public class Vivo extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vivo);

        //Load image via Link(memory management)

        ImageView imageView = findViewById(R.id.imagine_vivo);
        Picasso.get().load("https://i.imgur.com/qzgliqI.jpg").into(imageView);

        //intent to google maps + animation button

        final ImageButton locationVivo = findViewById(R.id.location_vivo);
        locationVivo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Vivo.this,R.anim.bounce);
                locationVivo.startAnimation(animation);

                //navigating to the location

                Uri gmmIntentUri = Uri.parse("google.navigation:q=Calea+Floreasca+60,+Bucharest+Romania");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

                Toast toast=Toast.makeText(getApplicationContext(),"Opening Google Maps",Toast.LENGTH_LONG);
                toast.show();

            }
        });

        // opening trip advisor site + button animation
        final ImageButton tripVivo = findViewById(R.id.trip_vivo);
        tripVivo .setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Vivo.this,R.anim.bounce);
                tripVivo .startAnimation(animation);

                Uri webpage = Uri.parse("https://www.tripadvisor.com/Restaurant_Review-g294458-d7754041-Reviews-Vivo_Fusion_Food_Bar_Bucuresti-Bucharest.html");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
                Toast toast=Toast.makeText(getApplicationContext(),"Opening Tripadvisor.com",Toast.LENGTH_LONG);
                toast.show();


            }
        });

        //Opening Vivo Fusion Bar Site

        final ImageButton siteVivo = findViewById(R.id.site_vivo);
        siteVivo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Vivo.this, R.anim.bounce);
                siteVivo.startAnimation(animation);

                Uri webpage = Uri.parse("https://www.vivofoodbar.com/");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
                Toast toast = Toast.makeText(getApplicationContext(), "Opening vivofood.com", Toast.LENGTH_LONG);
                toast.show();
            }

        });

        //Contact button Vivo food bar

        final ImageButton contactVivo = findViewById(R.id.contact_vivo);
        contactVivo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Vivo.this, R.anim.bounce);
                contactVivo.startAnimation(animation);

                String phoneNumber = "021 233 9688";
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
