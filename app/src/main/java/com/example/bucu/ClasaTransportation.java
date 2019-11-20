package com.example.bucu;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

 public class ClasaTransportation extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transportation);

        //CLick on Metro Image Button

        final ImageButton metrou = (ImageButton) findViewById(R.id.metrou);
        metrou.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(ClasaTransportation.this,R.anim.bounce);
                metrou.startAnimation(animation);

                Intent metrouIntent = new Intent(ClasaTransportation.this, Metrou.class);
                startActivity(metrouIntent);

            }
        });

        //Click on  the city tour Image Button

        final ImageButton autobuz = (ImageButton) findViewById(R.id.tur);
        autobuz.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(ClasaTransportation.this,R.anim.bounce);
                autobuz.startAnimation(animation);

                Intent autobuzIntent = new Intent(ClasaTransportation.this, Autobuz.class);
                startActivity(autobuzIntent);

            }
        });

        //Click on the Train ImageButton
        final ImageButton tren = (ImageButton) findViewById(R.id.tren);
        tren.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(ClasaTransportation.this,R.anim.bounce);
                tren.startAnimation(animation);

                Intent trenIntent = new Intent(ClasaTransportation.this, Tren.class);
                startActivity(trenIntent);

            }
        });

        //Click on the Uber ImageButton
        final ImageButton uber = (ImageButton) findViewById(R.id.uber);
        uber.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(ClasaTransportation.this,R.anim.bounce);
                uber.startAnimation(animation);

                Intent uberIntent = new Intent(ClasaTransportation.this, Uber.class);
                startActivity(uberIntent);
            }
        });



        //Click on the Bolt ImageButton
        final ImageButton bolt = (ImageButton) findViewById(R.id.bolt);
        bolt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(ClasaTransportation.this,R.anim.bounce);
                bolt.startAnimation(animation);

                Intent boltIntent = new Intent(ClasaTransportation.this, Bolt.class);
                startActivity(boltIntent);
            }
        });

        //Click on the Yango ImageButton
        final ImageButton yango = (ImageButton) findViewById(R.id.yango);
        yango.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(ClasaTransportation.this,R.anim.bounce);
                yango.startAnimation(animation);

                Intent yangoIntent = new Intent(ClasaTransportation.this, Yango.class);
                startActivity(yangoIntent);
            }
        });


        //Click on the Cab ImageButton
        final ImageButton cab = (ImageButton) findViewById(R.id.cab);
        cab.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(ClasaTransportation.this,R.anim.bounce);
                cab.startAnimation(animation);

                Intent cabIntent = new Intent(ClasaTransportation.this, Cab.class);
                startActivity(cabIntent);
            }
        });


        //Click on the Lime ImageButton
        final ImageButton lime = (ImageButton) findViewById(R.id.lime);
        lime.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(ClasaTransportation.this,R.anim.bounce);
                lime.startAnimation(animation);

                Intent limeIntent = new Intent(ClasaTransportation.this, Lime.class);
                startActivity(limeIntent);
            }
        });


        //Click on the Vespa ImageButton
        final ImageButton vespa = (ImageButton) findViewById(R.id.vespa);
        vespa.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(ClasaTransportation.this,R.anim.bounce);
                vespa.startAnimation(animation);

                Intent vespaIntent = new Intent(ClasaTransportation.this, Vespa.class);
                startActivity(vespaIntent);
            }
        });




    }
        }
