package com.hfad.kusinarecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class IngredientsAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingredients);
    }

    public void addToFavorite(View view) {
        Toast toast = Toast.makeText(this, R.string.favorite_btn, Toast.LENGTH_SHORT);
        toast.show();
    }
    public void shared(View view) {
        Toast toast = Toast.makeText(this, R.string.share_btn, Toast.LENGTH_SHORT);
        toast.show();
    }
}