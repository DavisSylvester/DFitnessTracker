package com.davissylvester.dfitnesstracker;



import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MusicalStructureApp extends AppCompatActivity {

//    private Button btnFrag1  = findViewById(R.id.btnShowFrag1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musical_structure_app);

        Button btnFrag1  = findViewById(R.id.btnShowFrag1);
         btnFrag1.setOnClickListener(this::showFrag1);
    }


    public void showFrag1(View view) {

        Fragment davisFrag = new davis();


        getSupportFragmentManager().beginTransaction()
            .add(R.id.csContainer, davisFrag)
            .commit();
    }
}
