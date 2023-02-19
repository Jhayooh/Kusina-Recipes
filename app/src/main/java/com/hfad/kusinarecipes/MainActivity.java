package com.hfad.kusinarecipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public CardView dish1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dish1 = (CardView) findViewById(R.id.dish_1);

        dish1.setOnClickListener(this);
    }

    public void onClickIngredients(View view) {
        Intent intent = new Intent(this, IngredientsAct.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()){
            case R.id.dish_1:
                i = new Intent(this,IngredientsAct.class);
                startActivity(i);
                break;
        }

    }
}