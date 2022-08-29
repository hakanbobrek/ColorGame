package com.hak4.color;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Anasayfa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anasayfa);
    }

    public void kolay(View view) {
        Intent intent=new Intent(Anasayfa.this,MainActivity.class);
        startActivity(intent);
    }

    public void orta(View view) {
        Intent intent=new Intent(Anasayfa.this,Orta.class);
        startActivity(intent);
    }

    public void zor(View view) {
        Intent intent=new Intent(Anasayfa.this,Zor.class);
        startActivity(intent);
    }
}