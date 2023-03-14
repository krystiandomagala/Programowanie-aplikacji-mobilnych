package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }

    public void onClickButton(View v){
        ImageButton clickedButton = (ImageButton) v;

        clickedButton.setImageDrawable(getResources().getDrawable(R.drawable.fig2));
        Intent intent = new Intent();
        intent.putExtra("points", 111);
        setResult(Activity.RESULT_OK, intent);
        finish();

    }
}