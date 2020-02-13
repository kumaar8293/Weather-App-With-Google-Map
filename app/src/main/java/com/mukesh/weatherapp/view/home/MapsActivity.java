package com.mukesh.weatherapp.view.home;

import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.mukesh.weatherapp.R;

import java.io.IOException;
import java.util.List;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener {

    private GoogleMap mMap;
    static final int PICK_LOCATION_REQUEST = 101; // The request code.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        findViewById(R.id.submit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getDataFromMarkerClick();

            }
        });
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(12.9716, 77.5946);
        mMap.addMarker(new MarkerOptions().position(sydney)
                .title("Marker in Bengaluru").draggable(true));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
/*
        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(12.9716, 77.5946);
        mMap.addMarker(new MarkerOptions().position(sydney)
                .title("Marker in Bengaluru").draggable(true));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));*/
        // Set a listener for marker click.
/*
        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(12.9716, 77.5946);
        mMap.addMarker(new MarkerOptions().position(sydney)
                .title("Marker in Bengaluru").draggable(true));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

        mMap.setOnMarkerClickListener(this);*/

        mMap.setOnMarkerClickListener(this);
        // mMap.setOnCameraIdleListener(onCameraIdleListener);
    }


    @Override
    public boolean onMarkerClick(Marker marker) {

       // getDataFromMarkerClick();
        return true;
    }
    private void getDataFromMarkerClick() {
        LatLng latLng = mMap.getCameraPosition().target;
        Geocoder geocoder = new Geocoder(MapsActivity.this);
        try {
            List<Address> addressList = geocoder.getFromLocation(latLng.latitude, latLng.longitude, 1);
            if (addressList != null && addressList.size() > 0) {
                String locality = addressList.get(0).getAddressLine(0);
                String country = addressList.get(0).getCountryName();
                if (!locality.isEmpty() && !country.isEmpty()) {
                    sendBackToHomeActivity(latLng.latitude, latLng.longitude, locality);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static final String TAG = "MapsActivity";
    private void sendBackToHomeActivity(double lat, double longi, String cityName) {

        Log.d(TAG, "sendBackToHomeActivity: "+lat+" "+ longi+"  "+cityName);
        Intent intent = new Intent();
        intent.putExtra("lat", lat);
        intent.putExtra("longi", longi);
        intent.putExtra("cityName", cityName);
        setResult(RESULT_OK, intent);
        finish();//finishing activity
    }


}
