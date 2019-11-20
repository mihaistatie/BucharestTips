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

public class Cab  extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cab);

        //Load image via Link(memory management)

        ImageView imageView = findViewById(R.id.imagine_cab);
        Picasso.get().load("https://i.imgur.com/fo6WoLW.png").into(imageView);




        //Opening yango Site

        final ImageButton siteCab = findViewById(R.id.site_cab);
        siteCab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Cab.this, R.anim.bounce);
                siteCab.startAnimation(animation);

                Uri webpage = Uri.parse("https://www.blackcab.ro/en/");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
                Toast toast = Toast.makeText(getApplicationContext(), "Opening blackcab.ro", Toast.LENGTH_LONG);
                toast.show();
            }

        });


        final ImageButton googleCab = findViewById(R.id.google_cab);
        googleCab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Cab.this, R.anim.bounce);
                googleCab.startAnimation(animation);

                Uri webpage = Uri.parse("https://play.google.com/store/apps/details?id=com.haulmont.taxidroid.client.miiles&hl=ro");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
                Toast toast = Toast.makeText(getApplicationContext(), "Opening googleplay.com", Toast.LENGTH_LONG);
                toast.show();
            }

        });


    }
}
