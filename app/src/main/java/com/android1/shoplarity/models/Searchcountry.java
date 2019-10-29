package com.android1.shoplarity.models;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SearchView;

import com.android1.shoplarity.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Searchcountry extends AppCompatActivity {
    @BindView(R.id.city)
    EditText city;
    @BindView(R.id.search_bar)
    Button search;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchcountry);

        ButterKnife.bind(this);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

    }
}
//    Intent intent = new Intent(Searchcountry.this, carsActivity.class);
//    Intent intent2 = new Intent(Searchcountry.this, ShoesActivity.class);
//    Intent intent3 = new Intent(Searchcountry.this, mobilephoneactivity.class);
//    Intent intent4 = new Intent(Searchcountry.this, AntiquityActivity.class);
//    Intent intent5 = new Intent(Searchcountry.this, furnitureActivity.class);
//    String location = city.getText().toString();
//                intent.putExtra("location", location);
//                        intent2.putExtra("location", location);
//                        intent3.putExtra("location", location);
//                        intent4.putExtra("location", location);
//                        intent5.putExtra("location", location);
//                        startActivity(intent);
//                        startActivity(intent2);
//                        startActivity(intent3);
//                        startActivity(intent4);
//                        startActivity(intent5);