package com.example.signlanguage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //xml화면 보임
        setContentView(R.layout.activity_main);

<<<<<<< HEAD
        Button bt_learning = (Button)findViewById(R.id.Learning);
        bt_learning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Intent intent = new Intent(getApplicationContext(), // 현재 화면의 제어권자
=======
        Button b = (Button)findViewById(R.id.Learning);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
>>>>>>> 6ce524b3c2500aa88cd62069804333e159a41d7e
                        learning.class); // 다음 넘어갈 클래스 지정
                startActivity(intent); // 다음 화면으로 넘어간다
            }
        });

<<<<<<< HEAD
        Button bt_trans= (Button)findViewById(R.id.Translation);
        bt_trans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Intent intent = new Intent(getApplicationContext(), HsvSetting.class);
                startActivity(intent);
            }
        });
=======
>>>>>>> 6ce524b3c2500aa88cd62069804333e159a41d7e
    }

}
