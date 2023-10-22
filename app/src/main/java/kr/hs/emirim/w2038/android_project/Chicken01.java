package kr.hs.emirim.w2038.android_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.net.Uri;
import android.widget.TextView;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import android.widget.Toast;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.content.Context;

public class Chicken01 extends AppCompatActivity implements OnMapReadyCallback{

    private GoogleMap mMap;
    LocationManager manager;
    GPSListener gpsListener;
    Location location = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chicken01);

        manager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        gpsListener = new GPSListener();
        //Toast toast = Toast.makeText(context, text, duration);
        TextView call = findViewById(R.id.call);

        call.setOnClickListener(tvListener);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        Toolbar toolbar = findViewById(R.id.next_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);//뒤로가기
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setBackgroundColor(Color.rgb(231, 255, 113));
        toolbar.setTitleTextColor(Color.rgb(100, 98, 98));
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


    @Override
    public void onMapReady(final GoogleMap googleMap) {
        mMap = googleMap;
        //LatLng locations = new LatLng(0, 0);;
        //manager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        //gpsListener = new GPSListener();
        /*
        try {
            Location location = null;

            long minTime = 0;        // 0초마다 갱신 - 바로바로갱신
            float minDistance = 0;

            if (manager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
                location = manager.getLastKnownLocation(LocationManager.GPS_PROVIDER);

                if (location != null) {
                    double latitude = location.getLatitude();
                    double longitude = location.getLongitude();
                    locations = new LatLng(latitude, longitude);
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
                    locations = new LatLng(latitude, longitude);
                }


                //위치 요청하기
                manager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, minTime, minDistance, gpsListener);
                //manager.removeUpdates(gpsListener);
                Toast.makeText(getApplicationContext(), "내 위치2확인 요청함", Toast.LENGTH_SHORT).show();
            }

        } catch (SecurityException e) {
            e.printStackTrace();
        }
        */
        Toast.makeText(Chicken01.this, "시작됨", Toast.LENGTH_SHORT).show();
        startLocationService();
        //LatLng location;
        //startLocationService(location);
    }


    View.OnClickListener tvListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Uri uri = Uri.parse("tel:028759960");
            Intent intent = new Intent(Intent.ACTION_DIAL, uri);
            startActivity(intent);
        }
    };

    // 정보창 클릭 리스너
    GoogleMap.OnInfoWindowClickListener infoWindowClickListener = new GoogleMap.OnInfoWindowClickListener() {
        @Override
        public void onInfoWindowClick(Marker marker) {
            String markerId = marker.getId();
            //String td = getApplicationContext();
            //String tid = (string)(gens);
            LatLng location = marker.getPosition();
            Toast.makeText(getApplicationContext(), "정보창 클릭 Marker ID : "
                    + markerId + " ", Toast.LENGTH_SHORT).show();
            Uri gmmIntentUri = Uri.parse ("geo:" + location.latitude + "," + location.longitude + "?q=" + Uri.encode("술"));
            Intent mapIntent = new Intent (Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage ("com.google.android.apps.maps");
            startActivity (mapIntent);
        }
    };

    // 마커 클릭 리스너
    GoogleMap.OnMarkerClickListener markerClickListener = new GoogleMap.OnMarkerClickListener() {
        @Override
        public boolean onMarkerClick(Marker marker) {
            String markerId = marker.getId();
            //String gens2 = getApplicationContext();
            // 선택한 타겟의 위치
            LatLng location = marker.getPosition();
            Toast.makeText(Chicken01.this, "마커 클릭 Marker ID : "
                            + markerId + " " + "(" + location.latitude + " " + location.longitude + ")",
                    Toast.LENGTH_SHORT).show();
            return false;
        }
    };
    public void startLocationService() {
        //LatLng locations;
        Toast.makeText(Chicken01.this, "시작됨2", Toast.LENGTH_SHORT).show();
        try {
            //Location location = null;
            //LatLng locations;
            long minTime = 0;        // 0초마다 갱신 - 바로바로갱신
            float minDistance = 0;

            if (manager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
                location = manager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
                Toast.makeText(Chicken01.this, "시작됨3" + location, Toast.LENGTH_SHORT).show();
                if (location != null) {
                    double latitude = location.getLatitude();
                    double longitude = location.getLongitude();
                    //locations = new LatLng(latitude, longitude);
                    showCurrentLocation(latitude, longitude);
                    Toast.makeText(Chicken01.this, "시작됨4", Toast.LENGTH_SHORT).show();
                }
                //위치 요청하기
                manager.requestLocationUpdates(LocationManager.GPS_PROVIDER, minTime, minDistance, gpsListener);
                //manager.removeUpdates(gpsListener);
                Toast.makeText(getApplicationContext(), "내 위치1확인 요청함 " + location, Toast.LENGTH_SHORT).show();

            } else if (manager.isProviderEnabled(LocationManager.NETWORK_PROVIDER)) {

                location = manager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
                if (location != null) {
                    double latitude = location.getLatitude();
                    double longitude = location.getLongitude();
                    //locations = new LatLng(latitude, longitude);
                    showCurrentLocation(latitude, longitude);
                }


                //위치 요청하기
                manager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, minTime, minDistance, gpsListener);
                //manager.removeUpdates(gpsListener);
                Toast.makeText(getApplicationContext(), "내 위치2확인 요청함" + location, Toast.LENGTH_SHORT).show();
            }

        } catch (SecurityException e) {
            e.printStackTrace();
        }
        //return locations;
    }

    class GPSListener implements LocationListener {

        // 위치 확인되었을때 자동으로 호출됨 (일정시간 and 일정거리)
        @Override
        public void onLocationChanged(Location location) {
            double latitude = location.getLatitude();
            double longitude = location.getLongitude();
            Toast.makeText(Chicken01.this, "시작됨5", Toast.LENGTH_SHORT).show();
            showCurrentLocation(latitude, longitude);
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
    private void showCurrentLocation(double latitude, double longitude) {
        Toast.makeText(Chicken01.this, "시작됨6", Toast.LENGTH_SHORT).show();
        LatLng locations = new LatLng(latitude, longitude);
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(locations);
        markerOptions.title("60계치킨 서울대학동점");
        markerOptions.snippet("치킨,닭강정");
        mMap.addMarker(markerOptions);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(locations, 17));
        mMap.setOnInfoWindowClickListener(infoWindowClickListener);
        mMap.setOnMarkerClickListener(markerClickListener);
    }
}