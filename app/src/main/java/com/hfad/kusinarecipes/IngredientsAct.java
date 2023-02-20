package com.hfad.kusinarecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class IngredientsAct extends AppCompatActivity {
    private View divider;
    private ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingredients);
        scrollView = findViewById(R.id.scroll);
        divider = findViewById(R.id.divider);
    }

    public void addToFavorite(View view) {
        Toast toast = Toast.makeText(this, R.string.favorite_btn, Toast.LENGTH_SHORT);
        toast.show();
    }
    public void shared(View view) {
        Toast toast = Toast.makeText(this, R.string.share_btn, Toast.LENGTH_SHORT);
        toast.show();
    }
    public void scrollToCom(View view) {
        new Handler().post(new Runnable() {
            @Override
            public void run() {
                scrollView.scrollTo(0, divider.getTop());
            }
        });
    }
}