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

public class Bolt  extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bolt);

        //Load image via Link(memory management)

        ImageView imageView = findViewById(R.id.imagine_bolt);
        Picasso.get().load("https://i.imgur.com/psca37k.jpg").into(imageView);




        //Opening Bolt Site

        final ImageButton siteBolt = findViewById(R.id.site_bolt);
        siteBolt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Bolt.this, R.anim.bounce);
                siteBolt.startAnimation(animation);

                Uri webpage = Uri.parse("https://bolt.eu/ro/");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
                Toast toast = Toast.makeText(getApplicationContext(), "Opening bolt.eu", Toast.LENGTH_LONG);
                toast.show();
            }

        });



        final ImageButton googleBolt = findViewById(R.id.google_bolt);
        googleBolt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Bolt.this, R.anim.bounce);
                googleBolt.startAnimation(animation);

                Uri webpage = Uri.parse("https://play.google.com/store/apps/details?id=ee.mtakso.client&hl=ro");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
                Toast toast = Toast.makeText(getApplicationContext(), "Opening googleplay.com", Toast.LENGTH_LONG);
                toast.show();
            }

        });


    }
}
