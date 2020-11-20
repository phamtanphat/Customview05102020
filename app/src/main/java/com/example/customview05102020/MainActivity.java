package com.example.customview05102020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EdittextImage mEditTextImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditTextImage  = findViewById(R.id.editTextImage);

        mEditTextImage.setOnClickTitle(new OnEditTextClickListener() {
            @Override
            public void onCliCkTitle(View v) {
                Toast.makeText(MainActivity.this, "Title Click", Toast.LENGTH_SHORT).show();
            }
        });
    }
}