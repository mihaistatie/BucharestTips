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

public class Metrou extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.metrou);


        //Load image via Link(memory management)

        ImageView imageView = findViewById(R.id.imagine_metrou);
        Picasso.get().load("https://i.imgur.com/ElAkaH6.jpg").into(imageView);


        //Opening Muzeu Site

        final ImageButton siteMetrou = findViewById(R.id.site_metrou);
        siteMetrou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(Metrou.this, R.anim.bounce);
                siteMetrou.startAnimation(animation);

                Uri webpage = Uri.parse("http://www.metrorex.ro/first_page_p1352-2");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
                Toast toast = Toast.makeText(getApplicationContext(), "Opening metrorex.ro", Toast.LENGTH_LONG);
                toast.show();
            }

        });
    }
}
