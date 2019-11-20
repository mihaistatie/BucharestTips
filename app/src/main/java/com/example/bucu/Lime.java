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

public class Lime extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lime);

        //Load image via Link(memory management)

        ImageView imageView = findViewById(R.id.imagine_lime);
        Picasso.get().load("https://i.imgur.com/5sJSPlJ.jpg").into(imageView);




        //Opening yango Site

        final ImageButton siteLime = findViewById(R.id.site_lime);
        siteLime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Lime.this, R.anim.bounce);
                siteLime.startAnimation(animation);

                Uri webpage = Uri.parse("https://www.li.me/en-us/home");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
                Toast toast = Toast.makeText(getApplicationContext(), "Opening lime.com", Toast.LENGTH_LONG);
                toast.show();
            }

        });


        final ImageButton googleLime = findViewById(R.id.google_lime);
        googleLime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Lime.this, R.anim.bounce);
                googleLime.startAnimation(animation);

                Uri webpage = Uri.parse("https://play.google.com/store/apps/details?id=com.limebike&hl=ro");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
                Toast toast = Toast.makeText(getApplicationContext(), "Opening googleplay.com", Toast.LENGTH_LONG);
                toast.show();
            }

        });


    }
}
