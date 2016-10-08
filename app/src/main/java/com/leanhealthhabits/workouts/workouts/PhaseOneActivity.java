package com.leanhealthhabits.workouts.workouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PhaseOneActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase_one);

        View phaseOneWkOneLBOneButton = this.findViewById(R.id.phase_one_wk_one_lb_one);
        phaseOneWkOneLBOneButton.setOnClickListener(this);

        View phaseOneWkOneUBOneButton = this.findViewById(R.id.phase_one_wk_one_ub_one);
        phaseOneWkOneUBOneButton.setOnClickListener(this);

        View phaseOneWkOneAROneButton = this.findViewById(R.id.phase_one_wk_one_ar_one);
        phaseOneWkOneAROneButton.setOnClickListener(this);

        View phaseOneWkOneLBTwoButton = this.findViewById(R.id.phase_one_wk_one_lb_two);
        phaseOneWkOneLBTwoButton.setOnClickListener(this);

        View phaseOneWkOneUBTwoButton = this.findViewById(R.id.phase_one_wk_one_ub_two);
        phaseOneWkOneUBTwoButton.setOnClickListener(this);

        View phaseOneWkOneARTwoButton = this.findViewById(R.id.phase_one_wk_one_ar_two);
        phaseOneWkOneARTwoButton.setOnClickListener(this);

        View phaseOneWkOneIntervalButton = this.findViewById(R.id.phase_one_wk_one_interval);
        phaseOneWkOneIntervalButton.setOnClickListener(this);
    }

    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.phase_one_wk_one_lb_one:
                i = new Intent(this, PhaseOneLB1Activity.class);
                startActivity(i);
                break;

            case R.id.phase_one_wk_one_ub_one:
                i = new Intent(this, PhaseOneUB1Activity.class);
                startActivity(i);
                break;

            case R.id.phase_one_wk_one_ar_one:
                i = new Intent(this, PhaseOneARActivity.class);
                startActivity(i);
                break;

            case R.id.phase_one_wk_one_lb_two:
                i = new Intent(this, PhaseOneLB2Activity.class);
                startActivity(i);
                break;

            case R.id.phase_one_wk_one_ub_two:
                i = new Intent(this, PhaseOneUB2Activity.class);
                startActivity(i);
                break;
            case R.id.phase_one_wk_one_ar_two:
                i = new Intent(this, PhaseOneARActivity.class);
                startActivity(i);
                break;

            case R.id.phase_one_wk_one_interval:
                i = new Intent(this, PhaseOneIntervalsActivity.class);
                startActivity(i);
                break;

            //Additional buttons go heere
        }
    }

}
/*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase_one);

        View phaseOneButton = this.findViewById(R.id.phase_one_wk_one_lb_one);
        phaseOneButton.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.phase_one_wk_one_lb_one:
                Intent i = new Intent(this, PhaseOneActivity.class);
                startActivity(i);
                break;

            //Additional buttons go heere
        }
    }
*/