package com.leanhealthhabits.workouts.workouts;

import android.app.Activity;
import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View exercisePhasesButton = this.findViewById(R.id.exercise_phases);
        exercisePhasesButton.setOnClickListener(this);

        View exerciseListButton = this.findViewById(R.id.exercise_list);
        exerciseListButton.setOnClickListener(this);

        View fourHourBodyButton = this.findViewById(R.id.fourhourbody);
        fourHourBodyButton.setOnClickListener(this);


        View habitsListButton = this.findViewById(R.id.habits_list);
        habitsListButton.setOnClickListener(this);



    }


    /**/
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {

            case R.id.exercise_phases:
                i = new Intent(this, ExercisePhasesActivity.class);
                startActivity(i);
                break;

            case R.id.fourhourbody:
                i = new Intent(this, FourHourBodyActivity.class);
                startActivity(i);
                break;

            case R.id.exercise_list:
                i = new Intent(this, ExerciseListActivity.class);
                startActivity(i);
                break;

            case R.id.habits_list:
                i = new Intent(this, HabitsListActivity.class);
                startActivity(i);
                break;
            //Additional buttons go heere
        }
    }
/**/

}
