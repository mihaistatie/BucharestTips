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

public class Pizza extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pizza);

        //Load image via Link(memory management)

        ImageView imageView = findViewById(R.id.imagine_pizza);
        Picasso.get().load("https://i.imgur.com/RbBDe7A.jpg").into(imageView);

        //intent to google maps + animation button

        final ImageButton locationPizza = findViewById(R.id.location_pizza);
        locationPizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Pizza.this, R.anim.bounce);
                locationPizza.startAnimation(animation);

                //navigating to the location

                Uri gmmIntentUri = Uri.parse("google.navigation:q=Latin+Pizza,+Bucharest+Romania");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

                Toast toast = Toast.makeText(getApplicationContext(), "Opening Google Maps", Toast.LENGTH_LONG);
                toast.show();

            }
        });

        // opening trip advisor site + button animation
        final ImageButton tripPizza = findViewById(R.id.trip_pizza);
        tripPizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Pizza.this, R.anim.bounce);
                tripPizza.startAnimation(animation);

                Uri webpage = Uri.parse("https://www.tripadvisor.com/Restaurant_Review-g294458-d10662211-Reviews-Latin_Pizza-Bucharest.html");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
                Toast toast = Toast.makeText(getApplicationContext(), "Opening Tripadvisor.com", Toast.LENGTH_LONG);
                toast.show();


            }
        });

        //Opening Pizza Latin Site

        final ImageButton sitePizza = findViewById(R.id.site_pizza);
        sitePizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Pizza.this, R.anim.bounce);
                sitePizza.startAnimation(animation);

                Uri webpage = Uri.parse("https://www.latinpizza.ro/");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
                Toast toast = Toast.makeText(getApplicationContext(), "Opening latinpizza.ro", Toast.LENGTH_LONG);
                toast.show();
            }

        });

        //Contact button Nor sky bar

        final ImageButton contactpizza= findViewById(R.id.contact_pizza);
        contactpizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Pizza.this, R.anim.bounce);
                contactpizza.startAnimation(animation);

                String phoneNumber = "0746 909 189";
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
