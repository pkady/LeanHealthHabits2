package com.leanhealthhabits.workouts.workouts;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExercisePhasesActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_phases);

        Button phaseOneButton = (Button) findViewById(R.id.phase_one_button);
        phaseOneButton.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.phase_one_button:
                Intent i = new Intent(this, PhaseOneActivity.class);
                startActivity(i);
                break;

            //Additional buttons go heere
        }
    }
}
