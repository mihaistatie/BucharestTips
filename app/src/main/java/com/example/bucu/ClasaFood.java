package com.example.bucu;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ClasaFood extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food);

        //CLick on Caru cu Bere Image Button

        final ImageButton caru = (ImageButton) findViewById(R.id.caru);
        caru.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(ClasaFood.this,R.anim.bounce);
                caru.startAnimation(animation);

                Intent  caruIntent = new Intent(ClasaFood.this, Caru.class);
                startActivity(caruIntent);

            }
        });


        //CLick on Hanul lu' Manuc Image Button

        final ImageButton hanu = (ImageButton) findViewById(R.id.hanu);
        hanu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(ClasaFood.this,R.anim.bounce);
                hanu.startAnimation(animation);

                Intent  hanuIntent = new Intent(ClasaFood.this, Hanu.class);
                startActivity(hanuIntent);

            }
        });

        //CLick on Vivo fusion Image Button

        final ImageButton vivo = (ImageButton) findViewById(R.id.vivo);
        vivo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(ClasaFood.this,R.anim.bounce);
                vivo.startAnimation(animation);

                Intent  vivoIntent = new Intent(ClasaFood.this, Vivo.class);
                startActivity(vivoIntent);

            }
        });

        //CLick on 18 lounge Image Button

        final ImageButton res18 = (ImageButton) findViewById(R.id.res18);
        res18.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(ClasaFood.this,R.anim.bounce);
                res18.startAnimation(animation);

                Intent  res18Intent = new Intent(ClasaFood.this, Res18.class);
                startActivity(res18Intent);

            }
        });

        //CLick on Cismigiu lounge Image Button

        final ImageButton cismigiu = (ImageButton) findViewById(R.id.cismigiu);
        cismigiu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(ClasaFood.this,R.anim.bounce);
                cismigiu.startAnimation(animation);

                Intent  cismigiuIntent = new Intent(ClasaFood.this, Cismigiu.class);
                startActivity(cismigiuIntent);

            }
        });


        //CLick on Nor sky bar  Image Button

        final ImageButton nor = (ImageButton) findViewById(R.id.nor);
        nor.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(ClasaFood.this,R.anim.bounce);
                nor.startAnimation(animation);

                Intent  norIntent = new Intent(ClasaFood.this, Nor.class);
                startActivity(norIntent);

            }
        });

        //CLick on Bucatarasul   Image Button

        final ImageButton bucataras = (ImageButton) findViewById(R.id.bucataras);
        bucataras.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(ClasaFood.this,R.anim.bounce);
                bucataras.startAnimation(animation);

                Intent  norIntent = new Intent(ClasaFood.this, Bucataras.class);
                startActivity(norIntent);

            }
        });

        //CLick on Ciorbarie   Image Button

        final ImageButton ciorbarie = (ImageButton) findViewById(R.id.ciorbarie);
        ciorbarie.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(ClasaFood.this,R.anim.bounce);
                ciorbarie.startAnimation(animation);

                Intent  ciorbarieIntent = new Intent(ClasaFood.this, Ciorbarie.class);
                startActivity(ciorbarieIntent);

            }
        });


        //CLick on Pizza   Image Button

        final ImageButton pizza = (ImageButton) findViewById(R.id.pizza);
        pizza.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(ClasaFood.this,R.anim.bounce);
                pizza.startAnimation(animation);

                Intent  pizzaIntent = new Intent(ClasaFood.this, Pizza.class);
                startActivity(pizzaIntent);

            }
        });


    }
}
