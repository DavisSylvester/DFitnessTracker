package com.davissylvester.dfitnesstracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ScoreKeeper extends AppCompatActivity {

     String sideA = "A";
     String sideB = "B";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_keeper);
    }

    protected void AddDonut(View view) {

    }

    protected void AddStirFry(View view) {

    }

    protected void AddOatmeal(View view) {

    }

    protected void AddSnicker(View view) {


        switch (view.getId()) {

            case R.id.btnDonutA:
                AddDonuts(sideA);
                break;

            case R.id.btnSnickersA:
                AddDonuts(sideA);
                break;

            case R.id.btnOatmealA:
                AddDonuts(sideA);
                break;

            case R.id.btnStirFryA:
                AddDonuts(sideA);
                break;

            case R.id.btnDonutB:
                AddDonuts(sideB);
                break;

            case R.id.btnSnickersB:
                AddDonuts(sideB);
                break;

            case R.id.btnOatmealB:
                AddDonuts(sideB);
                break;

            case R.id.btnStirFryB:
                AddDonuts(sideB);
                break;
        }


    }
}
