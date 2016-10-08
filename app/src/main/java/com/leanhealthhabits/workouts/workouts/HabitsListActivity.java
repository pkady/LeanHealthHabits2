package com.leanhealthhabits.workouts.workouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class HabitsListActivity extends AppCompatActivity implements View.OnClickListener{

    int number_checked_boxes = 0;
    int number_unchecked_boxes = 0;
    float percent_compliance = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_habits_list);


    }

    public void calculateCompliance (View view) {


        CheckBox checkBoxFishOil = (CheckBox) findViewById(R.id.fish_oil_checkbox);
        if (checkBoxFishOil.isChecked())

            number_checked_boxes += 1;
        else{
            number_unchecked_boxes += 1;
        }

        CheckBox checkBoxMeals = (CheckBox) findViewById(R.id.meals_per_day_checkbox);
        if (checkBoxMeals.isChecked())

            number_checked_boxes += 1;
        else{
            number_unchecked_boxes += 1;
        }

        percent_compliance = number_checked_boxes/(number_checked_boxes + number_unchecked_boxes);

        TextView compliance_text_view = (TextView) findViewById(R.id.compliance_text_view);

        compliance_text_view.setText("% " + (100 * percent_compliance));
    }

    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {

            /*
            case R.id.phase_one_button:
                i = new Intent(this, PhaseOneActivity.class);
                startActivity(i);
                break;
*/
            //Additional buttons go heere
        }
    }

}
