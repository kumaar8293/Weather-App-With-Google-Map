package com.mukesh.weatherapp.view.home;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.mukesh.weatherapp.R;
import com.mukesh.weatherapp.datamodel.Day;
import com.mukesh.weatherapp.datamodel.Weather;
import com.mukesh.weatherapp.utils.IconProvider;

import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.WeaterViewHolder> {
    private static final String TAG = "HomeAdapter";

    private Context context;
    private List<Day> weatherList;

    HomeAdapter(Context context) {
        this.context = context;

    }

    void setData(Weather weather) {
        this.weatherList = weather.getDays();
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public WeaterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(context).inflate(R.layout.item_weather, parent, false);
        return new WeaterViewHolder(rootView);
    }
    @SuppressLint("DefaultLocale")
    @Override
    public void onBindViewHolder(@NonNull WeaterViewHolder holder, int position) {

        Day day = weatherList.get(position);
        holder.tvDay.setText(day.getDate());
        holder.tvWeatherType.setText(day.getTimeframes().get(day.getTimeframes().size() - 1).getWxDesc());

        String max = String.format("%.1f", day.getTempMaxC());
        String min = String.format("%.1f", day.getTempMaxC());
        holder.tvDaysCelcius.setText(("" + max +"/"+ min+ (char) 0x00B0));
        Glide.with(context).load(IconProvider.getImageIcon(holder.tvWeatherType.getText().toString().trim())).into(holder.ivWeatherType);

    }

    @Override
    public int getItemCount() {
        if (weatherList == null)
            return 0;
        return weatherList.size();
    }

    class WeaterViewHolder extends RecyclerView.ViewHolder {
        ImageView ivWeatherType;
        TextView tvWeatherType, tvDay, tvDaysCelcius;

        WeaterViewHolder(@NonNull View itemView) {
            super(itemView);

            initialiseUIElements();
        }

        private void initialiseUIElements() {
            tvDay = itemView.findViewById(R.id.tv_day);
            tvDaysCelcius = itemView.findViewById(R.id.tv_daysCelcius);
            tvWeatherType = itemView.findViewById(R.id.tv_weatherType);
            ivWeatherType = itemView.findViewById(R.id.iv_weatherType);
        }
    }
}
