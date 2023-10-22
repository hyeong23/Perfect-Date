package kr.hs.emirim.w2038.android_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;
import androidx.appcompat.widget.Toolbar;
import android.widget.Toast;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.content.Context;
import com.pedro.library.AutoPermissions;
import com.pedro.library.AutoPermissionsListener;

public class MainActivity extends AppCompatActivity implements AutoPermissionsListener {
    Button korean, snack, japanese, chinese, western, etc, chicken, pizza, dessert, fastfood, lunchbox, fusion;

    ViewFlipper v_fllipper;
    //LocationManager manager;
    //GPSListener gpsListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        //manager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        //gpsListener = new GPSListener();

        Intent intent = new Intent(this, Splash.class);
        startActivity(intent);
        v_fllipper = findViewById(R.id.image_slide);

        v_fllipper.setFlipInterval(2000);
        v_fllipper.setAutoStart(true);

        v_fllipper.setInAnimation(this,android.R.anim.slide_in_left);
        v_fllipper.setOutAnimation(this,android.R.anim.slide_out_right);

        korean = findViewById(R.id.korean);
        snack = findViewById(R.id.snack);
        japanese = findViewById(R.id.japanese);
        chinese = findViewById(R.id.chinese);
        western = findViewById(R.id.western);
        etc = findViewById(R.id.etc);
        chicken = findViewById(R.id.chicken);
        pizza = findViewById(R.id.pizza);
        dessert = findViewById(R.id.dessert);
        fastfood = findViewById(R.id.fastfood);
        lunchbox = findViewById(R.id.lunchbox);
        fusion = findViewById(R.id.fusion);

        korean.setOnClickListener(btnListener);
        snack.setOnClickListener(btnListener);
        japanese.setOnClickListener(btnListener);
        chinese.setOnClickListener(btnListener);
        western.setOnClickListener(btnListener);
        etc.setOnClickListener(btnListener);
        chicken.setOnClickListener(btnListener);
        pizza.setOnClickListener(btnListener);
        dessert.setOnClickListener(btnListener);
        fastfood.setOnClickListener(btnListener);
        lunchbox.setOnClickListener(btnListener);
        fusion.setOnClickListener(btnListener);

        AutoPermissions.Companion.loadAllPermissions(this, 1);

    }
    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent;
            switch (v.getId()){
                case R.id.korean:
                    intent = new Intent(MainActivity.this, Korean.class);
                    startActivity(intent);
                    break;
                case R.id.snack:
                    intent = new Intent(MainActivity.this, Snack.class);
                    startActivity(intent);
                    break;
                case R.id.japanese:
                    intent = new Intent(MainActivity.this, Japanese.class);
                    startActivity(intent);
                    break;
                case R.id.chinese:
                    intent = new Intent(MainActivity.this, Chinese.class);
                    startActivity(intent);
                    break;
                case R.id.western:
                    intent = new Intent(MainActivity.this, Western.class);
                    startActivity(intent);
                    break;
                case R.id.etc:
                    intent = new Intent(MainActivity.this, Etc.class);
                    startActivity(intent);
                    break;
                case R.id.chicken:
                    intent = new Intent(MainActivity.this, Chicken.class);
                    startActivity(intent);
                    break;
                case R.id.pizza:
                    intent = new Intent(MainActivity.this, Pizza.class);
                    startActivity(intent);
                    break;
                case R.id.dessert:
                    intent = new Intent(MainActivity.this, Dessert.class);
                    startActivity(intent);
                    break;
                case R.id.fastfood:
                    intent = new Intent(MainActivity.this, Fastfood.class);
                    startActivity(intent);
                    break;
                case R.id.lunchbox:
                    intent = new Intent(MainActivity.this, Lunchbox.class);
                    startActivity(intent);
                    break;
                case R.id.fusion:
                    intent = new Intent(MainActivity.this, Fusion.class);
                    startActivity(intent);
                    break;

            }
        }
    };
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:{

                Intent intent = new Intent(getApplicationContext(),Korean.class);
                startActivity(intent);


                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }
    /*
    public void startLocationService() {
        try {
            Location location = null;

            long minTime = 0;        // 0초마다 갱신 - 바로바로갱신
            float minDistance = 0;

            if (manager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
                location = manager.getLastKnownLocation(LocationManager.GPS_PROVIDER);

                if (location != null) {
                    double latitude = location.getLatitude();
                    double longitude = location.getLongitude();
                }
                //위치 요청하기
                manager.requestLocationUpdates(LocationManager.GPS_PROVIDER, minTime, minDistance, gpsListener);
                //manager.removeUpdates(gpsListener);
                Toast.makeText(getApplicationContext(), "내 위치1확인 요청함", Toast.LENGTH_SHORT).show();

            } else if (manager.isProviderEnabled(LocationManager.NETWORK_PROVIDER)) {

                location = manager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
                if (location != null) {
                    double latitude = location.getLatitude();
                    double longitude = location.getLongitude();
                }


                //위치 요청하기
                manager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, minTime, minDistance, gpsListener);
                //manager.removeUpdates(gpsListener);
                Toast.makeText(getApplicationContext(), "내 위치2확인 요청함", Toast.LENGTH_SHORT).show();
            }

        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }

    class GPSListener implements LocationListener {

        // 위치 확인되었을때 자동으로 호출됨 (일정시간 and 일정거리)
        @Override
        public void onLocationChanged(Location location) {
            double latitude = location.getLatitude();
            double longitude = location.getLongitude();
        }

        @Override
        public void onStatusChanged(String provider, int status, Bundle extras) {

        }

        @Override
        public void onProviderEnabled(String provider) {

        }

        @Override
        public void onProviderDisabled(String provider) {

        }
    }
    */
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        AutoPermissions.Companion.parsePermissions(this, requestCode, permissions, this);
        Toast.makeText(this, "requestCode : "+requestCode+"  permissions : "+permissions+"  grantResults :"+grantResults, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDenied(int requestCode, String[] permissions) {
        Toast.makeText(getApplicationContext(),"permissions denied : " + permissions.length, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onGranted(int requestCode, String[] permissions) {
        Toast.makeText(getApplicationContext(),"permissions granted : " + permissions.length, Toast.LENGTH_SHORT).show();
    }
}