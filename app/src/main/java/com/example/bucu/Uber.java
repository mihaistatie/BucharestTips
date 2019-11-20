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

public class Uber  extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uber);

        //Load image via Link(memory management)

        ImageView imageView = findViewById(R.id.imagine_uber);
        Picasso.get().load("https://i.imgur.com/UaumfFc.jpg").into(imageView);




        //Opening Uber Site

        final ImageButton siteUber = findViewById(R.id.site_uber);
        siteUber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Uber.this, R.anim.bounce);
                siteUber.startAnimation(animation);

                Uri webpage = Uri.parse("https://www.uber.com/ro/ro/");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
                Toast toast = Toast.makeText(getApplicationContext(), "Opening uber.com", Toast.LENGTH_LONG);
                toast.show();
            }

        });


        final ImageButton googleUber = findViewById(R.id.google_uber);
        googleUber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Uber.this, R.anim.bounce);
                googleUber.startAnimation(animation);

                Uri webpage = Uri.parse("https://play.google.com/store/apps/details?id=com.ubercab&hl=ro");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
                Toast toast = Toast.makeText(getApplicationContext(), "Opening googleplay.com", Toast.LENGTH_LONG);
                toast.show();
            }

        });


    }
}
