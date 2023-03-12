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

    public ImageView ShareRecipe;
    private View divider;
    private ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingredients);
        scrollView = findViewById(R.id.scroll);
        divider = findViewById(R.id.divider);
        ShareRecipe = findViewById(R.id.shareBtn);

        ShareRecipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                String body = "Download this app";
                intent.putExtra(Intent.EXTRA_TEXT, body);
                startActivity(Intent.createChooser(intent,"Share using:"));
            }
        });
    }

    public void addToFavorite(View view) {
        Toast toast = Toast.makeText(this, R.string.favorite_btn, Toast.LENGTH_SHORT);
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