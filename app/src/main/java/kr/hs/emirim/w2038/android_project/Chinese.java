package kr.hs.emirim.w2038.android_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Chinese extends AppCompatActivity {
    Button btn1, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10,
            btn11, btn12, btn13, btn14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinese);

        Toolbar toolbar = findViewById(R.id.next_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);//뒤로가기
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setBackgroundColor(Color.rgb(231, 255, 113));
        toolbar.setTitleTextColor(Color.rgb(100, 98, 98));

        btn1 = findViewById(R.id.btn1);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn10 = findViewById(R.id.btn10);
        btn11 = findViewById(R.id.btn11);
        btn12 = findViewById(R.id.btn12);
        btn13 = findViewById(R.id.btn13);
        btn14 = findViewById(R.id.btn14);

        btn1.setOnClickListener(btnListener);
        btn3.setOnClickListener(btnListener);
        btn4.setOnClickListener(btnListener);
        btn5.setOnClickListener(btnListener);
        btn6.setOnClickListener(btnListener);
        btn7.setOnClickListener(btnListener);
        btn8.setOnClickListener(btnListener);
        btn9.setOnClickListener(btnListener);
        btn10.setOnClickListener(btnListener);
        btn11.setOnClickListener(btnListener);
        btn12.setOnClickListener(btnListener);
        btn13.setOnClickListener(btnListener);
        btn14.setOnClickListener(btnListener);
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case android.R.id.home: {
                finish();
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent;
            switch (v.getId()){
                case R.id.btn1:
                    intent = new Intent(Chinese.this, Chinese01.class);
                    startActivity(intent);
                    break;
                case R.id.btn3:
                    intent = new Intent(Chinese.this, Chinese03.class);
                    startActivity(intent);
                    break;
                case R.id.btn4:
                    intent = new Intent(Chinese.this, Chinese04.class);
                    startActivity(intent);
                    break;
                case R.id.btn5:
                    intent = new Intent(Chinese.this, Chinese05.class);
                    startActivity(intent);
                    break;
                case R.id.btn6:
                    intent = new Intent(Chinese.this, Chinese06.class);
                    startActivity(intent);
                    break;
                case R.id.btn7:
                    intent = new Intent(Chinese.this, Chinese07.class);
                    startActivity(intent);
                    break;
                case R.id.btn8:
                    intent = new Intent(Chinese.this, Chinese08.class);
                    startActivity(intent);
                    break;
                case R.id.btn9:
                    intent = new Intent(Chinese.this, Chinese09.class);
                    startActivity(intent);
                    break;
                case R.id.btn10:
                    intent = new Intent(Chinese.this, Chinese10.class);
                    startActivity(intent);
                    break;
                case R.id.btn11:
                    intent = new Intent(Chinese.this, Chinese11.class);
                    startActivity(intent);
                    break;
                case R.id.btn12:
                    intent = new Intent(Chinese.this, Chinese12.class);
                    startActivity(intent);
                    break;
                case R.id.btn13:
                    intent = new Intent(Chinese.this, Chinese13.class);
                    startActivity(intent);
                    break;
                case R.id.btn14:
                    intent = new Intent(Chinese.this, Chinese14.class);
                    startActivity(intent);
                    break;
            }
        }
    };
}