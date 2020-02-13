package com.mukesh.weatherapp.view.home;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.karan.churi.PermissionManager.PermissionManager;
import com.mukesh.weatherapp.R;
import com.mukesh.weatherapp.datamodel.Timeframe;
import com.mukesh.weatherapp.utils.IconProvider;

import java.util.List;

import uk.co.samuelwall.materialtaptargetprompt.MaterialTapTargetPrompt;

public class HomeActivity extends AppCompatActivity {

    private ImageView errorImage;
    private TextView textWeatherType, city, tv_celsius, tv_humidityPercent, tv_windPercent, tv_cloudlinesPercent, tv_pressurePercent;
    // private HomeAdapter homeAdapter;
    private HomeAdapter homeAdapter;
    FloatingActionButton fabAddCity;
    private HomeViewModel viewModel;

    PermissionManager permission;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        permission = new PermissionManager() {
        };
        permission.checkAndRequestPermissions(this);
        initView();

        initializeViewHolder();

        showFabPrompt();
    }

    private ImageView imageWeatherType;

    private void initView() {
        imageWeatherType = findViewById(R.id.iv_imageWeatherType);
        textWeatherType = findViewById(R.id.tv_textWeatherType);
        city = findViewById(R.id.tv_city);
        tv_celsius = findViewById(R.id.tv_celsius);
        tv_humidityPercent = findViewById(R.id.tv_humidityPercent);
        tv_windPercent = findViewById(R.id.tv_windPercent);
        tv_cloudlinesPercent = findViewById(R.id.tv_cloudlinesPercent);
        tv_pressurePercent = findViewById(R.id.tv_pressurePercent);
        errorImage = findViewById(R.id.errorImage);
        RecyclerView recyclerView = findViewById(R.id.rv_weaterDetail);
        recyclerView.setHasFixedSize(true);
        homeAdapter = new HomeAdapter(this);
        recyclerView.setAdapter(homeAdapter);
        fabAddCity = findViewById(R.id.fabAddCity);

        fabAddCity.setOnClickListener(view -> {
            Intent intent = new Intent(HomeActivity.this, MapsActivity.class);
            startActivityForResult(intent, MapsActivity.PICK_LOCATION_REQUEST);// Activity is started with requestCode 2
        });

        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                if (dy > 0) {
                    // Scroll Down
                    if (fabAddCity.isShown()) {
                        fabAddCity.hide();
                    }
                } else if (dy < 0) {
                    // Scroll Up
                    if (!fabAddCity.isShown()) {
                        fabAddCity.show();
                    }
                }
            }
        });
    }

    private void updateHeaderData(Timeframe timeframe) {

        if (timeframe != null) {

            // imageWeatherType
            textWeatherType.setText(timeframe.getWxDesc());

            tv_celsius.setText(("" + timeframe.getTempC() + (char) 0x00B0));

            tv_humidityPercent.setText(("" + timeframe.getHumidPct()));
            tv_windPercent.setText(("" + timeframe.getWindgstKmh() + "Kmh"));
            tv_cloudlinesPercent.setText(("" + timeframe.getCloudtotalPct()));
            tv_pressurePercent.setText(("" + timeframe.getPrecipIn()));

            Glide.with(this).load(IconProvider.getImageIcon(timeframe.getWxDesc())).into(imageWeatherType);
        }
    }

    private void initializeViewHolder() {
        viewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        viewModel.getCurrentWeather().observe(this, weathers -> {

            if (weathers == null || weathers.getDays() == null || weathers.getDays().size() == 0) {
                errorImage.setVisibility(View.VISIBLE);
                return;
            } else errorImage.setVisibility(View.GONE);
            homeAdapter.setData(weathers);

            List<Timeframe> timeframe = weathers.getDays().get(weathers.getDays().size() - 1).getTimeframes();
            updateHeaderData(timeframe.get(timeframe.size() - 1));

        });
        viewModel.getErrorMessageListener().observe(this, s -> {
            errorImage.setVisibility(View.VISIBLE);
            Toast.makeText(HomeActivity.this, s, Toast.LENGTH_LONG).show();
        });

        viewModel.searchWeather(12.9716, 77.5946);
        city.setText(("Bengaluru"));
    }

    private MaterialTapTargetPrompt mFabPrompt;
    private static final String TAG = "HomeActivity";

    public void showFabPrompt() {

        if (mFabPrompt != null) {
            return;
        }
        mFabPrompt = new MaterialTapTargetPrompt.Builder(HomeActivity.this)
                .setTarget(findViewById(R.id.fabAddCity))
                .setFocalPadding(R.dimen.dp40)
                .setPrimaryText(getString(R.string.select_your_city))
                .setSecondaryText(getString(R.string.des))
                .setBackButtonDismissEnabled(true)
                .setAnimationInterpolator(new FastOutSlowInInterpolator())
                .setPromptStateChangeListener((prompt, state) -> {
                    if (state == MaterialTapTargetPrompt.STATE_FOCAL_PRESSED || state == MaterialTapTargetPrompt.STATE_DISMISSING) {
                        mFabPrompt = null;
                        //Do something such as storing a value so that this prompt is never shown again
                    }
                })
                .create();
        if (mFabPrompt != null)
            mFabPrompt.show();
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // Check which request we're responding to
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == MapsActivity.PICK_LOCATION_REQUEST) {
            // Make sure the request was successful
            if (resultCode == RESULT_OK) {
                double lat = data.getDoubleExtra("lat", 12.9716);
                double longi = data.getDoubleExtra("longi", 77.5946);
                String cityName = data.getStringExtra("cityName");
                Log.d(TAG, "onActivityResult: "+cityName);
                if (cityName == null || cityName.equals("")) {
                    cityName = "Bengaluru";
                }

                Log.d(TAG, "onActivityResult: "+cityName);
                city.setText(cityName);
                viewModel.searchWeather(lat, longi);
                // The user picked a contact.
                // The Intent's data Uri identifies which contact was selected.

                // Do something with the contact here (bigger example below)
            }
        }
    }
}
