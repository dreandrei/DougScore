package com.example.android.dougscore;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int currentCar = 0;
    int scoreMyCar = 0;
    int scoreYourCar = 0;
    String scoreType = "";

    public void setCurrentMyCar(View v) {
        currentCar = 1;
        disableMyCar();
        enableYourCar();

    }

    public void setCurrentYourCar(View v) {
        currentCar = 2;
        enableMyCar();
        disableYourCar();
    }

    public void displayScore() {
        TextView scoreView = (TextView) findViewById(R.id.car_score);
        scoreView.setText(scoreMyCar + " - " + scoreYourCar);
        scoreType = "";
    }

    public void reset(View v) {
        scoreMyCar = 0;
        scoreYourCar = 0;
        currentCar = 0;
        scoreType = "";
        displayScore();
        enableAllButtons();
    }

    public void disableButton() {
        if (scoreType == "setStyling") {
            disableStyling();
        }

        if (scoreType == "setAcceleration") {
            disableAcceleration();
        }

        if (scoreType == "setHandling") {
            disableHandling();
        }

        if (scoreType == "setCoolFactor") {
            disableCoolFactor();
        }

        if (scoreType == "setImportance") {
            disableImportance();
        }

        if (scoreType == "setFeatures") {
            disableFeatures();
        }

        if (scoreType == "setLuxury") {
            disableLuxury();
        }

        if (scoreType == "setValue") {
            disableValue();
        }

        if (scoreType == "setQuality") {
            disableQuality();
        }

        if (scoreType == "setPracticality") {
            disablePracticality();
        }
    }

    public void enableAllButtons() {
        enableStyling();
        enableAcceleration();
        enableHandling();
        enableCoolFactor();
        enableImportance();
        enableFeatures();
        enableLuxury();
        enableValue();
        enableQuality();
        enablePracticality();
        enableMyCar();
        enableYourCar();
    }

    public void addScore(int scr) {
        if (currentCar == 1) {
            scoreMyCar = scoreMyCar + scr;
        }

        if (currentCar == 2) {
            scoreYourCar = scoreYourCar + scr;
        }

        disableButton();
        displayScore();
    }

    public void addOne(View v) {
        addScore(1);
    }

    public void addTwo(View v) {
        addScore(2);
    }

    public void addThree(View v) {
        addScore(3);
    }

    public void addFour(View v) {
        addScore(4);
    }

    public void addFive(View v) {
        addScore(5);
    }

    public void addSix(View v) {
        addScore(6);
    }

    public void addSeven(View v) {
        addScore(7);
    }

    public void addEight(View v) {
        addScore(8);
    }

    public void addNine(View v) {
        addScore(9);
    }

    public void addTen(View v) {
        addScore(10);
    }

    public void setStyling(View v) {
        scoreType = "setStyling";
    }

    public void setAcceleration(View v) {
        scoreType = "setAcceleration";
    }

    public void setHandling(View v) {
        scoreType = "setHandling";
    }

    public void setCoolFactor(View v) {
        scoreType = "setCoolFactor";
    }

    public void setImportance(View v) {
        scoreType = "setImportance";
    }

    public void setFeatures(View v) {
        scoreType = "setFeatures";
    }

    public void setLuxury(View v) {
        scoreType = "setLuxury";
    }

    public void setValue(View v) {
        scoreType = "setValue";
    }

    public void setQuality(View v) {
        scoreType = "setQuality";
    }

    public void setPracticality(View v) {
        scoreType = "setPracticality";
    }

    public void disableStyling() {
        Button btn = (Button) findViewById(R.id.styling);
        btn.setEnabled(false);
        btn.getBackground().setColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY);
    }

    public void enableStyling() {
        Button btn = (Button) findViewById(R.id.styling);
        btn.setEnabled(true);
        btn.getBackground().setColorFilter(null);
    }

    public void disableAcceleration() {
        Button btn = (Button) findViewById(R.id.acceleration);
        btn.setEnabled(false);
        btn.getBackground().setColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY);
    }

    public void enableAcceleration() {
        Button btn = (Button) findViewById(R.id.acceleration);
        btn.setEnabled(true);
        btn.getBackground().setColorFilter(null);
    }

    public void disableHandling() {
        Button btn = (Button) findViewById(R.id.handling);
        btn.setEnabled(false);
        btn.getBackground().setColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY);
    }

    public void enableHandling() {
        Button btn = (Button) findViewById(R.id.handling);
        btn.setEnabled(true);
        btn.getBackground().setColorFilter(null);
    }

    public void disableCoolFactor() {
        Button btn = (Button) findViewById(R.id.collfactor);
        btn.setEnabled(false);
        btn.getBackground().setColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY);
    }

    public void enableCoolFactor() {
        Button btn = (Button) findViewById(R.id.collfactor);
        btn.setEnabled(true);
        btn.getBackground().setColorFilter(null);
    }

    public void disableImportance() {
        Button btn = (Button) findViewById(R.id.importance);
        btn.setEnabled(false);
        btn.getBackground().setColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY);
    }

    public void enableImportance() {
        Button btn = (Button) findViewById(R.id.importance);
        btn.setEnabled(true);
        btn.getBackground().setColorFilter(null);
    }

    public void disableFeatures() {
        Button btn = (Button) findViewById(R.id.features);
        btn.setEnabled(false);
        btn.getBackground().setColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY);
    }

    public void enableFeatures() {
        Button btn = (Button) findViewById(R.id.features);
        btn.setEnabled(true);
        btn.getBackground().setColorFilter(null);
    }

    public void disableLuxury() {
        Button btn = (Button) findViewById(R.id.luxury);
        btn.setEnabled(false);
        btn.getBackground().setColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY);
    }

    public void enableLuxury() {
        Button btn = (Button) findViewById(R.id.luxury);
        btn.setEnabled(true);
        btn.getBackground().setColorFilter(null);
    }

    public void disableValue() {
        Button btn = (Button) findViewById(R.id.value);
        btn.setEnabled(false);
        btn.getBackground().setColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY);
    }

    public void enableValue() {
        Button btn = (Button) findViewById(R.id.value);
        btn.setEnabled(true);
        btn.getBackground().setColorFilter(null);
    }

    public void disableQuality() {
        Button btn = (Button) findViewById(R.id.quality);
        btn.setEnabled(false);
        btn.getBackground().setColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY);
    }

    public void enableQuality() {
        Button btn = (Button) findViewById(R.id.quality);
        btn.setEnabled(true);
        btn.getBackground().setColorFilter(null);
    }

    public void disablePracticality() {
        Button btn = (Button) findViewById(R.id.practicality);
        btn.setEnabled(false);
        btn.getBackground().setColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY);
    }

    public void enablePracticality() {
        Button btn = (Button) findViewById(R.id.practicality);
        btn.setEnabled(true);
        btn.getBackground().setColorFilter(null);
    }

    public void disableMyCar() {
        Button btn = (Button) findViewById(R.id.mycar);
        btn.setEnabled(false);
        btn.getBackground().setColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY);
    }

    public void enableMyCar() {
        Button btn = (Button) findViewById(R.id.mycar);
        btn.setEnabled(true);
        btn.getBackground().setColorFilter(null);
    }

    public void disableYourCar() {
        Button btn = (Button) findViewById(R.id.yourcar);
        btn.setEnabled(false);
        btn.getBackground().setColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY);
    }

    public void enableYourCar() {
        Button btn = (Button) findViewById(R.id.yourcar);
        btn.setEnabled(true);
        btn.getBackground().setColorFilter(null);
    }
}
