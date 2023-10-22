package kr.hs.emirim.w2038.android_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Dessert extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn7, btn8, btn10,
            btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20,
            btn21, btn22, btn23, btn24, btn25, btn26, btn28, btn29, btn30;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert);

        Toolbar toolbar = findViewById(R.id.next_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);//뒤로가기
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setBackgroundColor(Color.rgb(231, 255, 113));
        toolbar.setTitleTextColor(Color.rgb(100, 98, 98));

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn10 = findViewById(R.id.btn10);
        btn11 = findViewById(R.id.btn11);
        btn12 = findViewById(R.id.btn12);
        btn13 = findViewById(R.id.btn13);
        btn14 = findViewById(R.id.btn14);
        btn15 = findViewById(R.id.btn15);
        btn16 = findViewById(R.id.btn16);
        btn17 = findViewById(R.id.btn17);
        btn18 = findViewById(R.id.btn18);
        btn19 = findViewById(R.id.btn19);
        btn20 = findViewById(R.id.btn20);
        btn21 = findViewById(R.id.btn21);
        btn22 = findViewById(R.id.btn22);
        btn23 = findViewById(R.id.btn23);
        btn24 = findViewById(R.id.btn24);
        btn25 = findViewById(R.id.btn25);
        btn26 = findViewById(R.id.btn26);
        btn28 = findViewById(R.id.btn28);
        btn29 = findViewById(R.id.btn29);
        btn30 = findViewById(R.id.btn30);

        btn1.setOnClickListener(btnListener);
        btn2.setOnClickListener(btnListener);
        btn3.setOnClickListener(btnListener);
        btn4.setOnClickListener(btnListener);
        btn5.setOnClickListener(btnListener);
        btn7.setOnClickListener(btnListener);
        btn8.setOnClickListener(btnListener);
        btn10.setOnClickListener(btnListener);
        btn11.setOnClickListener(btnListener);
        btn12.setOnClickListener(btnListener);
        btn13.setOnClickListener(btnListener);
        btn14.setOnClickListener(btnListener);
        btn15.setOnClickListener(btnListener);
        btn16.setOnClickListener(btnListener);
        btn17.setOnClickListener(btnListener);
        btn18.setOnClickListener(btnListener);
        btn19.setOnClickListener(btnListener);
        btn20.setOnClickListener(btnListener);
        btn21.setOnClickListener(btnListener);
        btn22.setOnClickListener(btnListener);
        btn23.setOnClickListener(btnListener);
        btn24.setOnClickListener(btnListener);
        btn25.setOnClickListener(btnListener);
        btn26.setOnClickListener(btnListener);
        btn28.setOnClickListener(btnListener);
        btn29.setOnClickListener(btnListener);
        btn30.setOnClickListener(btnListener);
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
                    intent = new Intent(Dessert.this, Dessert01.class);
                    startActivity(intent);
                    break;
                case R.id.btn2:
                    intent = new Intent(Dessert.this, Dessert02.class);
                    startActivity(intent);
                    break;
                case R.id.btn3:
                    intent = new Intent(Dessert.this, Dessert03.class);
                    startActivity(intent);
                    break;
                case R.id.btn4:
                    intent = new Intent(Dessert.this, Dessert04.class);
                    startActivity(intent);
                    break;
                case R.id.btn5:
                    intent = new Intent(Dessert.this, Dessert05.class);
                    startActivity(intent);
                    break;
                case R.id.btn7:
                    intent = new Intent(Dessert.this, Dessert07.class);
                    startActivity(intent);
                    break;
                case R.id.btn8:
                    intent = new Intent(Dessert.this, Dessert08.class);
                    startActivity(intent);
                    break;
                case R.id.btn10:
                    intent = new Intent(Dessert.this, Dessert10.class);
                    startActivity(intent);
                    break;
                case R.id.btn11:
                    intent = new Intent(Dessert.this, Dessert11.class);
                    startActivity(intent);
                    break;
                case R.id.btn12:
                    intent = new Intent(Dessert.this, Dessert12.class);
                    startActivity(intent);
                    break;
                case R.id.btn13:
                    intent = new Intent(Dessert.this, Dessert13.class);
                    startActivity(intent);
                    break;
                case R.id.btn14:
                    intent = new Intent(Dessert.this, Dessert14.class);
                    startActivity(intent);
                    break;
                case R.id.btn15:
                    intent = new Intent(Dessert.this, Dessert15.class);
                    startActivity(intent);
                    break;
                case R.id.btn16:
                    intent = new Intent(Dessert.this, Dessert16.class);
                    startActivity(intent);
                    break;
                case R.id.btn17:
                    intent = new Intent(Dessert.this, Dessert17.class);
                    startActivity(intent);
                    break;
                case R.id.btn18:
                    intent = new Intent(Dessert.this, Dessert18.class);
                    startActivity(intent);
                    break;
                case R.id.btn19:
                    intent = new Intent(Dessert.this, Dessert19.class);
                    startActivity(intent);
                    break;
                case R.id.btn20:
                    intent = new Intent(Dessert.this, Dessert20.class);
                    startActivity(intent);
                    break;
                case R.id.btn21:
                    intent = new Intent(Dessert.this, Dessert21.class);
                    startActivity(intent);
                    break;
                case R.id.btn22:
                    intent = new Intent(Dessert.this, Dessert22.class);
                    startActivity(intent);
                    break;
                case R.id.btn23:
                    intent = new Intent(Dessert.this, Dessert23.class);
                    startActivity(intent);
                    break;
                case R.id.btn24:
                    intent = new Intent(Dessert.this, Dessert24.class);
                    startActivity(intent);
                    break;
                case R.id.btn25:
                    intent = new Intent(Dessert.this, Dessert25.class);
                    startActivity(intent);
                    break;
                case R.id.btn26:
                    intent = new Intent(Dessert.this, Dessert26.class);
                    startActivity(intent);
                    break;
                case R.id.btn28:
                    intent = new Intent(Dessert.this, Dessert28.class);
                    startActivity(intent);
                    break;
                case R.id.btn29:
                    intent = new Intent(Dessert.this, Dessert29.class);
                    startActivity(intent);
                    break;
                case R.id.btn30:
                    intent = new Intent(Dessert.this, Dessert30.class);
                    startActivity(intent);
                    break;
            }
        }
    };
}