package com.hak4.color;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Zor extends AppCompatActivity {
    AppCompatButton card_ary[] = new AppCompatButton[30];
    String[] color_ary;
    Drawable original;
    int onpick_index = 0;
    int[] onpick = new int[2];
    int match = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zor);
        card_ary[0] = (AppCompatButton) findViewById(R.id.bir);
        card_ary[1] = (AppCompatButton) findViewById(R.id.iki);
        card_ary[2] = (AppCompatButton) findViewById(R.id.uc);
        card_ary[3] = (AppCompatButton) findViewById(R.id.dort);
        card_ary[4] = (AppCompatButton) findViewById(R.id.bes);
        card_ary[5] = (AppCompatButton) findViewById(R.id.alti);
        card_ary[6] = (AppCompatButton) findViewById(R.id.yedi);
        card_ary[7] = (AppCompatButton) findViewById(R.id.sekiz);
        card_ary[8] = (AppCompatButton) findViewById(R.id.dokuz);
        card_ary[9] = (AppCompatButton) findViewById(R.id.on);
        card_ary[10] = (AppCompatButton) findViewById(R.id.onbir);
        card_ary[11] = (AppCompatButton) findViewById(R.id.oniki);
        card_ary[12] = (AppCompatButton) findViewById(R.id.onuc);
        card_ary[13] = (AppCompatButton) findViewById(R.id.ondort);
        card_ary[14] = (AppCompatButton) findViewById(R.id.onbes);
        card_ary[15] = (AppCompatButton) findViewById(R.id.onalti);
        card_ary[16] = (AppCompatButton) findViewById(R.id.onyedi);
        card_ary[17] = (AppCompatButton) findViewById(R.id.onsekiz);
        card_ary[18] = (AppCompatButton) findViewById(R.id.ondokuz);
        card_ary[19] = (AppCompatButton) findViewById(R.id.yirmi);
        card_ary[20] = (AppCompatButton) findViewById(R.id.yirmibir);
        card_ary[21] = (AppCompatButton) findViewById(R.id.yirmiiki);
        card_ary[22] = (AppCompatButton) findViewById(R.id.yirmiuc);
        card_ary[23] = (AppCompatButton) findViewById(R.id.yirmidort);
        card_ary[24] = (AppCompatButton) findViewById(R.id.yirmibes);
        card_ary[25] = (AppCompatButton) findViewById(R.id.yirmialti);
        card_ary[26] = (AppCompatButton) findViewById(R.id.yirmiyedi);
        card_ary[27] = (AppCompatButton) findViewById(R.id.yirmisekiz);
        card_ary[28] = (AppCompatButton) findViewById(R.id.yirmidokuz);
        card_ary[29] = (AppCompatButton) findViewById(R.id.otuz);


        original = card_ary[0].getBackground();
        color_ary = new String[]{"D", "D", "R", "R", "M", "M", "G", "G", "Y", "Y", "B", "B", "O", "O", "H", "H", "I", "I", "Z", "Z", "T", "T", "E", "E", "F", "F", "A", "A", "J", "J"};

        shuffle_color_ary();
    }
    public void shuffle_color_ary()
    {
        List<String> strList = Arrays.asList(color_ary);
        Collections.shuffle(strList);
        color_ary = strList.toArray(new String[strList.size()]);
    }


    public void shuffle(android.view.View v) {

        shuffle_color_ary();


        for (Button a : card_ary) {
            a.setBackground(original);
            a.setClickable(true);
        }

        onpick_index = 0;
        match = 0;

    }


    public void onClick(android.view.View v) {


        switch (v.getId())
        {
            case R.id.bir:
                select(0);
                break;
            case R.id.iki:
                select(1);
                break;
            case R.id.uc:
                select(2);
                break;
            case R.id.dort:
                select(3);
                break;
            case R.id.bes:
                select(4);
                break;
            case R.id.alti:
                select(5);
                break;
            case R.id.yedi:
                select(6);
                break;
            case R.id.sekiz:
                select(7);
                break;
            case R.id.dokuz:
                select(8);
                break;
            case R.id.on:
                select(9);
                break;
            case R.id.onbir:
                select(10);
                break;
            case R.id.oniki:
                select(11);
                break;
            case R.id.onuc:
                select(12);
                break;
            case R.id.ondort:
                select(13);
                break;
            case R.id.onbes:
                select(14);
                break;
            case R.id.onalti:
                select(15);
                break;
            case R.id.onyedi:
                select(16);
                break;
            case R.id.onsekiz:
                select(17);
                break;
            case R.id.ondokuz:
                select(18);
                break;
            case R.id.yirmi:
                select(19);
                break;
            case R.id.yirmibir:
                select(20);
                break;
            case R.id.yirmiiki:
                select(21);
                break;
            case R.id.yirmiuc:
                select(22);
                break;
            case R.id.yirmidort:
                select(23);
                break;
            case R.id.yirmibes:
                select(24);
                break;
            case R.id.yirmialti:
                select(25);
                break;
            case R.id.yirmiyedi:
                select(26);
                break;
            case R.id.yirmisekiz:
                select(27);
                break;
            case R.id.yirmidokuz:
                select(28);
                break;
            case R.id.otuz:
                select(29);
                break;




        }
    }


    public void select(int btn_index) {


        if( match == 14 && onpick_index == 1 ){
            onpick[onpick_index] = btn_index;
            show(btn_index);
            check(btn_index);
        }

        else if(onpick_index < 2){
            onpick[onpick_index] = btn_index;
            show(btn_index);
            onpick_index++;
        }

        else if(onpick_index == 2)
            check(btn_index);

    }


    public void show(int btn_index) {


        switch (color_ary[btn_index]) {
            case "R":
                card_ary[btn_index].setBackgroundColor(Color.rgb(252, 45, 55));
                break;
            case "G":
                card_ary[btn_index].setBackgroundColor(Color.rgb(45, 252, 63));
                break;
            case "B":
                card_ary[btn_index].setBackgroundColor(Color.rgb(45, 224, 252));
                break;
            case "O":
                card_ary[btn_index].setBackgroundColor(Color.rgb(252, 204, 45));
                break;
            case "H":
                card_ary[btn_index].setBackgroundColor(Color.rgb(228, 20, 255));
                break;
            case "Y":
                card_ary[btn_index].setBackgroundColor(Color.rgb(238, 255, 212));
                break;
            case "M":
                card_ary[btn_index].setBackgroundColor(Color.rgb(161, 195, 255));
                break;
            case "D":
                card_ary[btn_index].setBackgroundColor(Color.rgb(107, 87, 0));
                break;
            case "I":
                card_ary[btn_index].setBackgroundColor(Color.rgb(103, 63, 125));
                break;
            case "Z":
                card_ary[btn_index].setBackgroundColor(Color.rgb(226, 135, 67));
                break;
            case "T":
                card_ary[btn_index].setBackgroundColor(Color.rgb(140, 26, 62));
                break;
            case "E":
                card_ary[btn_index].setBackgroundColor(Color.rgb(125, 187, 138));
                break;
            case "F":
                card_ary[btn_index].setBackgroundColor(Color.rgb(175, 125, 187));
                break;
            case "A":
                card_ary[btn_index].setBackgroundColor(Color.rgb(100, 90, 90));
                break;
            case "J":
                card_ary[btn_index].setBackgroundColor(Color.rgb(230, 230, 145));
                break;

        }

        card_ary[btn_index].setClickable(false);

    }


    public void check(int new_btn_index) {


        if (color_ary[onpick[0]].equals(color_ary[onpick[1]])) {


            card_ary[onpick[0]].setBackgroundColor(Color.rgb(249, 249, 249));
            card_ary[onpick[1]].setBackgroundColor(Color.rgb(249, 249, 249));
            match++;


            if (match ==15)
                Toast.makeText(this,"Tüm kutular doğru şekilde eşleşti. Başla ile tekrar oynayabilirsiniz!!!", Toast.LENGTH_LONG).show();


            else
            {

                onpick_index = 0;
                select(new_btn_index);
            }
        }
        else {
            hideTheFirst();
            onpick[0] = onpick[1];
            onpick_index = 1;
            select(new_btn_index);
        }

    }
    public void hideTheFirst() {

        card_ary[onpick[0]].setBackground(original);
        card_ary[onpick[0]].setClickable(true);

    }
}