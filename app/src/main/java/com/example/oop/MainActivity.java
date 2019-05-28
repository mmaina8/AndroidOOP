package com.example.oop;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Car toyota = new Car("White", "Toyota", 4, 100);
        Car ford = new Car("Orange","Ranger", 4,180);
        Car mercedes = new Car("Black", "AMG", 4, 200);
        Car rollsRoyce = new Car("Red", "Phantom", 2,240);
        Car audi = new Car("White", "RS8", 2, 240);
        toyota.hoot();

        ford.carryGoods();

        toyota.accelerate(76);
        Log.d("Car", "Toyota speed " + toyota.getSpeed());

        audi.getColor();
        Log.d("Car", audi.getColor());

        Taxi taxi = new Taxi("Yellow", "Toyota", 4, 100);
        taxi.hoot();
        taxi.stop();
        Log.d("Taxi", "Taxi speed " + taxi.getSpeed());

        SportsCar sportsCar = new SportsCar("Red", "Ferrari", 2, 100);
        sportsCar.accelerate(80);
        Log.d("SportsCar", "Sports Car speed " + sportsCar.getSpeed());
        sportsCar.hoot();
        sportsCar.hoot("Joyyyyyy");


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
