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

public class Yango extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yango);

        //Load image via Link(memory management)

        ImageView imageView = findViewById(R.id.imagine_yango);
        Picasso.get().load("https://i.imgur.com/foH3sKl.jpg").into(imageView);




        //Opening yango Site

        final ImageButton siteYango = findViewById(R.id.site_yango);
        siteYango.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Yango.this, R.anim.bounce);
                siteYango.startAnimation(animation);

                Uri webpage = Uri.parse("https://yango.yandex.com/ro_ro/");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
                Toast toast = Toast.makeText(getApplicationContext(), "Opening yango.com", Toast.LENGTH_LONG);
                toast.show();
            }

        });


        final ImageButton googleYango = findViewById(R.id.google_yango);
        googleYango.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Yango.this, R.anim.bounce);
                googleYango.startAnimation(animation);

                Uri webpage = Uri.parse("https://play.google.com/store/apps/details?id=com.yandex.yango&hl=ro");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
                Toast toast = Toast.makeText(getApplicationContext(), "Opening googleplay.com", Toast.LENGTH_LONG);
                toast.show();
            }

        });


    }
}
