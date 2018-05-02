package com.davissylvester.dfitnesstracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class ScoreKeeper extends AppCompatActivity {

     String sideA = "A";
     String sideB = "B";

     int calorieTotalA = 0;
     int calorieTotalB = 0;
     int donutTotalA = 0;
     int donutTotalB = 0;
     int stirFryTotalA = 0;
     int stirFryTotalB = 0;
     int oatmealTotalA = 0;
     int oatmealTotalB = 0;
     int snickerTotalA = 0;
     int snickerTotalB = 0;

     int caloriesPerDonut = 500;
     int caloriesPerOatmeal = 50;
     int caloriesPerSnicker = 250;
     int caloriesPerStirFry = 140;

    TextView demoA;
    TextView demoB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_keeper);

        demoA = findViewById(R.id.txtActiveCalorieCounterA);

        demoB = findViewById(R.id.txtActiveCalorieCounterB);

        demoA.setText("0");
        demoB.setText("0");
    }

    protected void AddDonut(View view) {

        AddToTotals(view);
    }

    protected void AddStirFry(View view) {

        AddToTotals(view);
    }

    protected void AddOatmeal(View view) {

        AddToTotals(view);
    }

    protected void AddSnicker(View view) {


        AddToTotals(view);


    }

    protected void ResetA(View view) {

        calorieTotalA = 0;
        demoA.setText("0");

    }

    protected void ResetB(View view) {

        calorieTotalB = 0;
        demoB.setText("0");
    }

    private void AddToTotals(View view) {
        switch (view.getId()) {

            case R.id.btnDonutA:
                AddDonutToTotal(sideA);
                break;

            case R.id.btnSnickersA:
                AddSnickerToTotal(sideA);
                break;

            case R.id.btnOatmealA:
                AddOatmealToTotal(sideA);
                break;

            case R.id.btnStirFryA:
                AddStirFryToTotal(sideA);
                break;

            case R.id.btnDonutB:
                AddDonutToTotal(sideB);
                break;

            case R.id.btnSnickersB:
                AddSnickerToTotal(sideB);
                break;

            case R.id.btnOatmealB:
                AddOatmealToTotal(sideB);
                break;

            case R.id.btnStirFryB:
                AddStirFryToTotal(sideB);
                break;


                default:
                    break;

        }
    }

    private void  AddDonutToTotal(String side) {

        switch (side) {

            case "A":
                donutTotalA = donutTotalA + caloriesPerDonut;
                calorieTotalA = calorieTotalA + caloriesPerDonut;

                String total = Integer.toString(calorieTotalA);

                demoA.setText(total);
                break;

            case "B":
                donutTotalB = donutTotalB +  caloriesPerDonut;
                calorieTotalB = calorieTotalB + caloriesPerDonut;

                String totalB = Integer.toString(calorieTotalB);

                demoB.setText(totalB);
                break;

        }

    }

    private void  AddOatmealToTotal(String side) {

        switch (side) {

            case "A":
                oatmealTotalA = oatmealTotalA + caloriesPerOatmeal;
                calorieTotalA = calorieTotalA + caloriesPerOatmeal;

                String total = Integer.toString(calorieTotalA);

                demoA.setText(total);
                break;

            case "B":
                oatmealTotalB = oatmealTotalB +  + caloriesPerOatmeal;
                calorieTotalB = calorieTotalB + caloriesPerOatmeal;

                String totalB = Integer.toString(calorieTotalB);

                demoB.setText(totalB);
                break;

        }

    }

    private void  AddSnickerToTotal(String side) {

        switch (side) {

            case "A":
                snickerTotalA = snickerTotalA + caloriesPerSnicker;
                calorieTotalA = calorieTotalA + caloriesPerSnicker;

                String total = Integer.toString(calorieTotalA);

                demoA.setText(total);
                break;


            case "B":
                snickerTotalB = snickerTotalB +  + caloriesPerSnicker;
                calorieTotalB = calorieTotalB + caloriesPerSnicker;

                String totalB = Integer.toString(calorieTotalB);

                demoB.setText(totalB);
                break;

        }

    }

    private void  AddStirFryToTotal(String side) {

        switch (side) {

            case "A":
                stirFryTotalA = stirFryTotalA + caloriesPerStirFry;
                calorieTotalA = calorieTotalA + caloriesPerStirFry;

                String total = Integer.toString(calorieTotalA);

                demoA.setText(total);
                break;

            case "B":
                stirFryTotalB = stirFryTotalB +  caloriesPerStirFry;
                calorieTotalB = calorieTotalB + caloriesPerStirFry;

                String totalB = Integer.toString(calorieTotalB);

                demoB.setText(totalB);
                break;

        }

    }


}
