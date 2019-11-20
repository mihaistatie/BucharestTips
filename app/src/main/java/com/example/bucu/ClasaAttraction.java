package com.example.bucu;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;


public class ClasaAttraction extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attraction);

        //Click on Arch ImageButton

        final ImageButton arc = (ImageButton) findViewById(R.id.arc);
        arc.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(ClasaAttraction.this,R.anim.bounce);
                arc.startAnimation(animation);

                Intent arcIntent = new Intent(ClasaAttraction.this, Arc.class);
                startActivity(arcIntent);

            }
        });

        //Click on PresHouse Image Button

        final ImageButton press = (ImageButton) findViewById(R.id.presei);
        press.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(ClasaAttraction.this,R.anim.bounce);
                press.startAnimation(animation);

                Intent pressIntent = new Intent(ClasaAttraction.this, Press.class);
                startActivity(pressIntent);

            }
        });


        //Click On Athenaeum Image Button

        final ImageButton ateneu = (ImageButton) findViewById(R.id.ateneu);
        ateneu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(ClasaAttraction.this,R.anim.bounce);
                ateneu.startAnimation(animation);

                Intent pressIntent = new Intent(ClasaAttraction.this, Ateneu.class);
                startActivity(pressIntent);

            }
        });

        //Click On Cec_Palace Image Button

        final ImageButton cec = (ImageButton) findViewById(R.id.cec);
        cec.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(ClasaAttraction.this,R.anim.bounce);
                cec.startAnimation(animation);

                Intent pressIntent = new Intent(ClasaAttraction.this, Cec.class);
                startActivity(pressIntent);

            }
        });

        //Click on Museum Image Button

        final ImageButton muzeu = findViewById(R.id.muzeu);
        muzeu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //make the button bounce
                Animation animation = AnimationUtils.loadAnimation(ClasaAttraction.this,R.anim.bounce);
                muzeu.startAnimation(animation);

                Intent muzeuIntent = new Intent(ClasaAttraction.this, Muzeu.class);
                startActivity(muzeuIntent);

            }
        });

        //CLick on Old Town Image Button

        final ImageButton centru = findViewById(R.id.centru);
        centru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //make the button bounce
                Animation animation = AnimationUtils.loadAnimation(ClasaAttraction.this,R.anim.bounce);
                centru.startAnimation(animation);

                Intent centruIntent = new Intent(ClasaAttraction.this, Centru.class);
                startActivity(centruIntent);

            }
        });

        //Click on Parliament Image Button

        final ImageButton parlament = findViewById(R.id.parlament);
        parlament.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //make the button bounce
                Animation animation = AnimationUtils.loadAnimation(ClasaAttraction.this,R.anim.bounce);
                parlament.startAnimation(animation);

                Intent centruIntent = new Intent(ClasaAttraction.this, Parlament.class);
                startActivity(centruIntent);

            }
        });












        }

    }

