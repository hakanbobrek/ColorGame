package com.hak4.color;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import android.os.Bundle;

public class Orta extends AppCompatActivity {
    AppCompatButton card_ary[] = new AppCompatButton[20];
    String[] color_ary;
    Drawable original;
    int onpick_index = 0;
    int[] onpick = new int[2];
    int match = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orta);
        card_ary[0] = (AppCompatButton) findViewById(R.id.one);
        card_ary[1] = (AppCompatButton) findViewById(R.id.two);
        card_ary[2] = (AppCompatButton) findViewById(R.id.three);
        card_ary[3] = (AppCompatButton) findViewById(R.id.four);
        card_ary[4] = (AppCompatButton) findViewById(R.id.four1);
        card_ary[5] = (AppCompatButton) findViewById(R.id.five);
        card_ary[6] = (AppCompatButton) findViewById(R.id.six);
        card_ary[7] = (AppCompatButton) findViewById(R.id.seven);
        card_ary[8] = (AppCompatButton) findViewById(R.id.eight);
        card_ary[9] = (AppCompatButton) findViewById(R.id.eight2);
        card_ary[10] = (AppCompatButton) findViewById(R.id.nine);
        card_ary[11] = (AppCompatButton) findViewById(R.id.ten);
        card_ary[12] = (AppCompatButton) findViewById(R.id.eleven);
        card_ary[13] = (AppCompatButton) findViewById(R.id.twelve);
        card_ary[14] = (AppCompatButton) findViewById(R.id.twelve2);
        card_ary[15] = (AppCompatButton) findViewById(R.id.thirteen);
        card_ary[16] = (AppCompatButton) findViewById(R.id.fourteen);
        card_ary[17] = (AppCompatButton) findViewById(R.id.fifteen);
        card_ary[18] = (AppCompatButton) findViewById(R.id.sixteen);
        card_ary[19] = (AppCompatButton) findViewById(R.id.sixteen2);


        original = card_ary[0].getBackground();
        color_ary = new String[]{"D", "D", "R", "R", "M", "M", "G", "G", "Y", "Y", "B", "B", "O", "O", "H", "H", "I", "I", "Z", "Z"};

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

    // select a card, 翻牌
    public void onClick(android.view.View v) {

        // turn button to card index
        switch (v.getId())
        {
            case R.id.one:
                select(0);
                break;
            case R.id.two:
                select(1);
                break;
            case R.id.three:
                select(2);
                break;
            case R.id.four:
                select(3);
                break;
            case R.id.four1:
                select(4);
                break;
            case R.id.five:
                select(5);
                break;
            case R.id.six:
                select(6);
                break;
            case R.id.seven:
                select(7);
                break;
            case R.id.eight:
                select(8);
                break;
            case R.id.eight2:
                select(9);
                break;
            case R.id.nine:
                select(10);
                break;
            case R.id.ten:
                select(11);
                break;
            case R.id.eleven:
                select(12);
                break;
            case R.id.twelve:
                select(13);
                break;
            case R.id.twelve2:
                select(14);
                break;
            case R.id.thirteen:
                select(15);
                break;
            case R.id.fourteen:
                select(16);
                break;
            case R.id.fifteen:
                select(17);
                break;
            case R.id.sixteen:
                select(18);
                break;
            case R.id.sixteen2:
                select(19);
                break;

        }
    }

    public void select(int btn_index) {

        if( match == 9 && onpick_index == 1 ){
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

        // show color by shuffled string array. 按洗好的顏色字串，來顯示顏色。
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

        }
        card_ary[btn_index].setClickable(false);
    }
    public void check(int new_btn_index) {
        if (color_ary[onpick[0]].equals(color_ary[onpick[1]])) {
            card_ary[onpick[0]].setBackgroundColor(Color.rgb(249, 249, 249));
            card_ary[onpick[1]].setBackgroundColor(Color.rgb(249, 249, 249));
            match++;
            if (match == 10)
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