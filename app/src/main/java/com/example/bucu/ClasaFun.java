package com.example.bucu;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;

import androidx.annotation.Nullable;

public class ClasaFun extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fun);


        //CLick on Therme Image Button

        final ImageButton spa = (ImageButton) findViewById(R.id.spa);
        spa.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(ClasaFun.this,R.anim.bounce);
                spa.startAnimation(animation);

                Intent spaIntent = new Intent(ClasaFun.this, Spa.class);
                startActivity(spaIntent);

            }
        });

        //CLick on Comunist Image Button

        final ImageButton comunist = (ImageButton) findViewById(R.id.comunist);
        comunist.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(ClasaFun.this,R.anim.bounce);
                comunist.startAnimation(animation);

                Intent comunistIntent = new Intent(ClasaFun.this, Comunist.class);
                startActivity(comunistIntent);

            }
        });



        //Click on Museum Image Button

        final ImageButton muzeu = findViewById(R.id.muzeu);
        muzeu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //make the button bounce
                Animation animation = AnimationUtils.loadAnimation(ClasaFun.this,R.anim.bounce);
                muzeu.startAnimation(animation);

                Intent muzeuIntent = new Intent(ClasaFun.this, Muzeu.class);
                startActivity(muzeuIntent);

            }
        });


        //Click on Butic Image Button

        final ImageButton suvenir= findViewById(R.id.suvenir);
        suvenir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //make the button bounce
                Animation animation = AnimationUtils.loadAnimation(ClasaFun.this,R.anim.bounce);
                suvenir.startAnimation(animation);

                Intent suvenirIntent = new Intent(ClasaFun.this, Suvenir.class);
                startActivity(suvenirIntent);

            }
        });

        //Click on Afi palace Image Button

        final ImageButton mall = findViewById(R.id.mall);
        mall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //make the button bounce
                Animation animation = AnimationUtils.loadAnimation(ClasaFun.this,R.anim.bounce);
                mall.startAnimation(animation);

                Intent mallIntent = new Intent(ClasaFun.this, Mall.class);
                startActivity(mallIntent);

            }
        });


        //Click on Afi palace Image Button

        final ImageButton carte = findViewById(R.id.carte);
        carte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //make the button bounce
                Animation animation = AnimationUtils.loadAnimation(ClasaFun.this,R.anim.bounce);
                carte.startAnimation(animation);

                Intent carteIntent = new Intent(ClasaFun.this, Carte.class);
                startActivity(carteIntent);

            }
        });


        //Click On Athenaeum Image Button

        final ImageButton ateneu = (ImageButton) findViewById(R.id.ateneu);
        ateneu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(ClasaFun.this,R.anim.bounce);
                ateneu.startAnimation(animation);

                Intent ateneuIntent = new Intent(ClasaFun.this, Ateneu.class);
                startActivity(ateneuIntent);

            }
        });

        //Click On Opera Image Button

        final ImageButton opera = (ImageButton) findViewById(R.id.opera);
        opera.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(ClasaFun.this,R.anim.bounce);
                opera.startAnimation(animation);

                Intent operaIntent = new Intent(ClasaFun.this, Opera.class);
                startActivity(operaIntent);

            }
        });


        //Click On Opera Image Button

        final ImageButton cafe = (ImageButton) findViewById(R.id.cafe);
        cafe.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(ClasaFun.this,R.anim.bounce);
                cafe.startAnimation(animation);

                Intent cafeIntent = new Intent(ClasaFun.this, Cafe.class);
                startActivity(cafeIntent);

            }
        });







    }


}
