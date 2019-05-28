package com.example.oop;

import android.util.Log;

public class SportsCar extends Car {
    public SportsCar(String color, String model, int doors, int speed) {
        super(color, model, doors, speed);
    }

    @Override
    public void hoot() {
//        super.hoot();
        Log.d("SportsCar", "Boom!");
    }

     public void hoot(String sound) {
        Log.d("SportsCar", sound);
     }
}
