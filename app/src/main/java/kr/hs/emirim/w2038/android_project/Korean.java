package kr.hs.emirim.w2038.android_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Korean extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10,
            btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20,
            btn21, btn22, btn23, btn24, btn25, btn26, btn27, btn28, btn29, btn30,
            btn31, btn32, btn33, btn34, btn35, btn36, btn37, btn38, btn39, btn40,
            btn41, btn42, btn43, btn44, btn45, btn46, btn47, btn48, btn49, btn50,
            btn51, btn52, btn53, btn54, btn55, btn56, btn57, btn58, btn59, btn60,
            btn61, btn62, btn65, btn66, btn67, btn68, btn69, btn70,
            btn71, btn72, btn73, btn74, btn75, btn76, btn77, btn78, btn79, btn80,
            btn81, btn82, btn83, btn85;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_korean);

        //툴바 생성
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
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
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
        btn27 = findViewById(R.id.btn27);
        btn28 = findViewById(R.id.btn28);
        btn29 = findViewById(R.id.btn29);
        btn30 = findViewById(R.id.btn30);
        btn31 = findViewById(R.id.btn31);
        btn32 = findViewById(R.id.btn32);
        btn33 = findViewById(R.id.btn33);
        btn34 = findViewById(R.id.btn34);
        btn35 = findViewById(R.id.btn35);
        btn36 = findViewById(R.id.btn36);
        btn37 = findViewById(R.id.btn37);
        btn38 = findViewById(R.id.btn38);
        btn39 = findViewById(R.id.btn39);
        btn40 = findViewById(R.id.btn40);
        btn41 = findViewById(R.id.btn41);
        btn42 = findViewById(R.id.btn42);
        btn43 = findViewById(R.id.btn43);
        btn44 = findViewById(R.id.btn44);
        btn45 = findViewById(R.id.btn45);
        btn46 = findViewById(R.id.btn46);
        btn47 = findViewById(R.id.btn47);
        btn48 = findViewById(R.id.btn48);
        btn49 = findViewById(R.id.btn49);
        btn50 = findViewById(R.id.btn50);
        btn51 = findViewById(R.id.btn51);
        btn52 = findViewById(R.id.btn52);
        btn53 = findViewById(R.id.btn53);
        btn54 = findViewById(R.id.btn54);
        btn55 = findViewById(R.id.btn55);
        btn56 = findViewById(R.id.btn56);
        btn57 = findViewById(R.id.btn57);
        btn58 = findViewById(R.id.btn58);
        btn59 = findViewById(R.id.btn59);
        btn60 = findViewById(R.id.btn60);
        btn61 = findViewById(R.id.btn61);
        btn62 = findViewById(R.id.btn62);
        btn65 = findViewById(R.id.btn65);
        btn66 = findViewById(R.id.btn66);
        btn67 = findViewById(R.id.btn67);
        btn68 = findViewById(R.id.btn68);
        btn69 = findViewById(R.id.btn69);
        btn70 = findViewById(R.id.btn70);
        btn71 = findViewById(R.id.btn71);
        btn72 = findViewById(R.id.btn72);
        btn73 = findViewById(R.id.btn73);
        btn74 = findViewById(R.id.btn74);
        btn75 = findViewById(R.id.btn75);
        btn76 = findViewById(R.id.btn76);
        btn77 = findViewById(R.id.btn77);
        btn78 = findViewById(R.id.btn78);
        btn79 = findViewById(R.id.btn79);
        btn80 = findViewById(R.id.btn80);
        btn81 = findViewById(R.id.btn81);
        btn82 = findViewById(R.id.btn82);
        btn83 = findViewById(R.id.btn83);
        btn85 = findViewById(R.id.btn85);


        btn1.setOnClickListener(btnListener);
        btn2.setOnClickListener(btnListener);
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
        btn27.setOnClickListener(btnListener);
        btn28.setOnClickListener(btnListener);
        btn29.setOnClickListener(btnListener);
        btn30.setOnClickListener(btnListener);
        btn31.setOnClickListener(btnListener);
        btn32.setOnClickListener(btnListener);
        btn33.setOnClickListener(btnListener);
        btn34.setOnClickListener(btnListener);
        btn35.setOnClickListener(btnListener);
        btn36.setOnClickListener(btnListener);
        btn37.setOnClickListener(btnListener);
        btn38.setOnClickListener(btnListener);
        btn39.setOnClickListener(btnListener);
        btn40.setOnClickListener(btnListener);
        btn41.setOnClickListener(btnListener);
        btn42.setOnClickListener(btnListener);
        btn43.setOnClickListener(btnListener);
        btn44.setOnClickListener(btnListener);
        btn45.setOnClickListener(btnListener);
        btn46.setOnClickListener(btnListener);
        btn47.setOnClickListener(btnListener);
        btn48.setOnClickListener(btnListener);
        btn49.setOnClickListener(btnListener);
        btn50.setOnClickListener(btnListener);
        btn51.setOnClickListener(btnListener);
        btn52.setOnClickListener(btnListener);
        btn53.setOnClickListener(btnListener);
        btn54.setOnClickListener(btnListener);
        btn55.setOnClickListener(btnListener);
        btn56.setOnClickListener(btnListener);
        btn57.setOnClickListener(btnListener);
        btn58.setOnClickListener(btnListener);
        btn59.setOnClickListener(btnListener);
        btn60.setOnClickListener(btnListener);
        btn61.setOnClickListener(btnListener);
        btn62.setOnClickListener(btnListener);
        btn65.setOnClickListener(btnListener);
        btn66.setOnClickListener(btnListener);
        btn67.setOnClickListener(btnListener);
        btn68.setOnClickListener(btnListener);
        btn69.setOnClickListener(btnListener);
        btn70.setOnClickListener(btnListener);
        btn71.setOnClickListener(btnListener);
        btn72.setOnClickListener(btnListener);
        btn73.setOnClickListener(btnListener);
        btn74.setOnClickListener(btnListener);
        btn75.setOnClickListener(btnListener);
        btn76.setOnClickListener(btnListener);
        btn77.setOnClickListener(btnListener);
        btn78.setOnClickListener(btnListener);
        btn79.setOnClickListener(btnListener);
        btn80.setOnClickListener(btnListener);
        btn81.setOnClickListener(btnListener);
        btn82.setOnClickListener(btnListener);
        btn83.setOnClickListener(btnListener);
        btn85.setOnClickListener(btnListener);

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
                    intent = new Intent(Korean.this, Korean01.class);
                    startActivity(intent);
                    break;
                case R.id.btn2:
                    intent = new Intent(Korean.this, Korean02.class);
                    startActivity(intent);
                    break;
                case R.id.btn3:
                    intent = new Intent(Korean.this, Korean03.class);
                    startActivity(intent);
                    break;
                case R.id.btn4:
                    intent = new Intent(Korean.this, Korean04.class);
                    startActivity(intent);
                    break;
                case R.id.btn5:
                    intent = new Intent(Korean.this, Korean05.class);
                    startActivity(intent);
                    break;
                case R.id.btn6:
                    intent = new Intent(Korean.this, Korean06.class);
                    startActivity(intent);
                    break;
                case R.id.btn7:
                    intent = new Intent(Korean.this, Korean07.class);
                    startActivity(intent);
                    break;
                case R.id.btn8:
                    intent = new Intent(Korean.this, Korean08.class);
                    startActivity(intent);
                    break;
                case R.id.btn9:
                    intent = new Intent(Korean.this, Korean09.class);
                    startActivity(intent);
                    break;
                case R.id.btn10:
                    intent = new Intent(Korean.this, Korean10.class);
                    startActivity(intent);
                    break;
                case R.id.btn11:
                    intent = new Intent(Korean.this, Korean11.class);
                    startActivity(intent);
                    break;
                case R.id.btn12:
                    intent = new Intent(Korean.this, Korean12.class);
                    startActivity(intent);
                    break;
                case R.id.btn13:
                    intent = new Intent(Korean.this, Korean13.class);
                    startActivity(intent);
                    break;
                case R.id.btn14:
                    intent = new Intent(Korean.this, Korean14.class);
                    startActivity(intent);
                    break;
                case R.id.btn15:
                    intent = new Intent(Korean.this, Korean15.class);
                    startActivity(intent);
                    break;
                case R.id.btn16:
                    intent = new Intent(Korean.this, Korean16.class);
                    startActivity(intent);
                    break;
                case R.id.btn17:
                    intent = new Intent(Korean.this, Korean17.class);
                    startActivity(intent);
                    break;
                case R.id.btn18:
                    intent = new Intent(Korean.this, Korean18.class);
                    startActivity(intent);
                    break;
                case R.id.btn19:
                    intent = new Intent(Korean.this, Korean19.class);
                    startActivity(intent);
                    break;
                case R.id.btn20:
                    intent = new Intent(Korean.this, Korean20.class);
                    startActivity(intent);
                    break;
                case R.id.btn21:
                    intent = new Intent(Korean.this, Korean21.class);
                    startActivity(intent);
                    break;
                case R.id.btn22:
                    intent = new Intent(Korean.this, Korean22.class);
                    startActivity(intent);
                    break;
                case R.id.btn23:
                    intent = new Intent(Korean.this, Korean23.class);
                    startActivity(intent);
                    break;
                case R.id.btn24:
                    intent = new Intent(Korean.this, Korean24.class);
                    startActivity(intent);
                    break;
                case R.id.btn25:
                    intent = new Intent(Korean.this, Korean25.class);
                    startActivity(intent);
                    break;
                case R.id.btn26:
                    intent = new Intent(Korean.this, Korean26.class);
                    startActivity(intent);
                    break;
                case R.id.btn27:
                    intent = new Intent(Korean.this, Korean27.class);
                    startActivity(intent);
                    break;
                case R.id.btn28:
                    intent = new Intent(Korean.this, Korean28.class);
                    startActivity(intent);
                    break;
                case R.id.btn29:
                    intent = new Intent(Korean.this, Korean29.class);
                    startActivity(intent);
                    break;
                case R.id.btn30:
                    intent = new Intent(Korean.this, Korean30.class);
                    startActivity(intent);
                    break;
                case R.id.btn31:
                    intent = new Intent(Korean.this, Korean31.class);
                    startActivity(intent);
                    break;
                case R.id.btn32:
                    intent = new Intent(Korean.this, Korean32.class);
                    startActivity(intent);
                    break;
                case R.id.btn33:
                    intent = new Intent(Korean.this, Korean33.class);
                    startActivity(intent);
                    break;
                case R.id.btn34:
                    intent = new Intent(Korean.this, Korean34.class);
                    startActivity(intent);
                    break;
                case R.id.btn35:
                    intent = new Intent(Korean.this, Korean35.class);
                    startActivity(intent);
                    break;
                case R.id.btn36:
                    intent = new Intent(Korean.this, Korean36.class);
                    startActivity(intent);
                    break;
                case R.id.btn37:
                    intent = new Intent(Korean.this, Korean37.class);
                    startActivity(intent);
                    break;
                case R.id.btn38:
                    intent = new Intent(Korean.this, Korean38.class);
                    startActivity(intent);
                    break;
                case R.id.btn39:
                    intent = new Intent(Korean.this, Korean39.class);
                    startActivity(intent);
                    break;
                case R.id.btn40:
                    intent = new Intent(Korean.this, Korean40.class);
                    startActivity(intent);
                    break;
                case R.id.btn41:
                    intent = new Intent(Korean.this, Korean41.class);
                    startActivity(intent);
                    break;
                case R.id.btn42:
                    intent = new Intent(Korean.this, Korean42.class);
                    startActivity(intent);
                    break;
                case R.id.btn43:
                    intent = new Intent(Korean.this, Korean43.class);
                    startActivity(intent);
                    break;
                case R.id.btn44:
                    intent = new Intent(Korean.this, Korean44.class);
                    startActivity(intent);
                    break;
                case R.id.btn45:
                    intent = new Intent(Korean.this, Korean45.class);
                    startActivity(intent);
                    break;
                case R.id.btn46:
                    intent = new Intent(Korean.this, Korean46.class);
                    startActivity(intent);
                    break;
                case R.id.btn47:
                    intent = new Intent(Korean.this, Korean47.class);
                    startActivity(intent);
                    break;
                case R.id.btn48:
                    intent = new Intent(Korean.this, Korean48.class);
                    startActivity(intent);
                    break;
                case R.id.btn49:
                    intent = new Intent(Korean.this, Korean49.class);
                    startActivity(intent);
                    break;
                case R.id.btn50:
                    intent = new Intent(Korean.this, Korean50.class);
                    startActivity(intent);
                    break;
                case R.id.btn51:
                    intent = new Intent(Korean.this, Korean51.class);
                    startActivity(intent);
                    break;
                case R.id.btn52:
                    intent = new Intent(Korean.this, Korean52.class);
                    startActivity(intent);
                    break;
                case R.id.btn53:
                    intent = new Intent(Korean.this, Korean53.class);
                    startActivity(intent);
                    break;
                case R.id.btn54:
                    intent = new Intent(Korean.this, Korean54.class);
                    startActivity(intent);
                    break;
                case R.id.btn55:
                    intent = new Intent(Korean.this, Korean55.class);
                    startActivity(intent);
                    break;
                case R.id.btn56:
                    intent = new Intent(Korean.this, Korean56.class);
                    startActivity(intent);
                    break;
                case R.id.btn57:
                    intent = new Intent(Korean.this, Korean57.class);
                    startActivity(intent);
                    break;
                case R.id.btn58:
                    intent = new Intent(Korean.this, Korean58.class);
                    startActivity(intent);
                    break;
                case R.id.btn59:
                    intent = new Intent(Korean.this, Korean59.class);
                    startActivity(intent);
                    break;
                case R.id.btn60:
                    intent = new Intent(Korean.this, Korean60.class);
                    startActivity(intent);
                    break;
                case R.id.btn61:
                    intent = new Intent(Korean.this, Korean61.class);
                    startActivity(intent);
                    break;
                case R.id.btn62:
                    intent = new Intent(Korean.this, Korean62.class);
                    startActivity(intent);
                    break;
                case R.id.btn65:
                    intent = new Intent(Korean.this, Korean65.class);
                    startActivity(intent);
                    break;
                case R.id.btn66:
                    intent = new Intent(Korean.this, Korean66.class);
                    startActivity(intent);
                    break;
                case R.id.btn67:
                    intent = new Intent(Korean.this, Korean67.class);
                    startActivity(intent);
                    break;
                case R.id.btn68:
                    intent = new Intent(Korean.this, Korean68.class);
                    startActivity(intent);
                    break;
                case R.id.btn69:
                    intent = new Intent(Korean.this, Korean69.class);
                    startActivity(intent);
                    break;
                case R.id.btn70:
                    intent = new Intent(Korean.this, Korean70.class);
                    startActivity(intent);
                    break;
                case R.id.btn71:
                    intent = new Intent(Korean.this, Korean71.class);
                    startActivity(intent);
                    break;
                case R.id.btn72:
                    intent = new Intent(Korean.this, Korean72.class);
                    startActivity(intent);
                    break;
                case R.id.btn73:
                    intent = new Intent(Korean.this, Korean73.class);
                    startActivity(intent);
                    break;
                case R.id.btn74:
                    intent = new Intent(Korean.this, Korean74.class);
                    startActivity(intent);
                    break;
                case R.id.btn75:
                    intent = new Intent(Korean.this, Korean75.class);
                    startActivity(intent);
                    break;
                case R.id.btn76:
                    intent = new Intent(Korean.this, Korean76.class);
                    startActivity(intent);
                    break;
                case R.id.btn77:
                    intent = new Intent(Korean.this, Korean77.class);
                    startActivity(intent);
                    break;
                case R.id.btn78:
                    intent = new Intent(Korean.this, Korean78.class);
                    startActivity(intent);
                    break;
                case R.id.btn79:
                    intent = new Intent(Korean.this, Korean79.class);
                    startActivity(intent);
                    break;
                case R.id.btn80:
                    intent = new Intent(Korean.this, Korean80.class);
                    startActivity(intent);
                    break;
                case R.id.btn81:
                    intent = new Intent(Korean.this, Korean81.class);
                    startActivity(intent);
                    break;
                case R.id.btn82:
                    intent = new Intent(Korean.this, Korean82.class);
                    startActivity(intent);
                    break;
                case R.id.btn83:
                    intent = new Intent(Korean.this, Korean83.class);
                    startActivity(intent);
                    break;
                case R.id.btn85:
                    intent = new Intent(Korean.this, Korean85.class);
                    startActivity(intent);
                    break;
            }
        }
    };

}