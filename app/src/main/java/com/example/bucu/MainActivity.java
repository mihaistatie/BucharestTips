package com.example.bucu;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.content.Intent;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        //hide text from toolbar
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.logobucuresti);
        getSupportActionBar().setDisplayUseLogoEnabled(true);



        //ATTRACTIONS BUTTON CLICK--> ALL THE ATTRACTIONS
       final Button attraction = (Button) findViewById(R.id.attractions);
        attraction.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.bounce);
                attraction.startAnimation(animation);

                Intent attractionIntent = new Intent(MainActivity.this, ClasaAttraction.class);
                startActivity(attractionIntent);
            }
        });

        //TRANSPORTATION BUTTON CLICK--> ALL THE TRANSPORTATION
       final Button transportation = (Button) findViewById(R.id.transport);
        transportation.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.bounce);
                transportation.startAnimation(animation);
                Intent transportationIntent = new Intent(MainActivity.this, ClasaTransportation.class);
                startActivity(transportationIntent);
            }
        });

        //FOOD BUTTON CLICK--> BEST FOOD IN CITY
       final Button food = (Button) findViewById(R.id.foods);
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.bounce);
                food.startAnimation(animation);
                Intent foodIntent = new Intent(MainActivity.this, ClasaFood.class);
                startActivity(foodIntent);
            }
        });

        //ENTERTAINMENT BUTTON CLICK--> BEST PLACES IN TOWN
       final Button fun =(Button) findViewById(R.id.megafun);
        fun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //make the button to bounce
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.bounce);
                fun.startAnimation(animation);
                Intent funIntent = new Intent(MainActivity.this, ClasaFun.class);
                startActivity(funIntent);
            }
        });


    }




}
