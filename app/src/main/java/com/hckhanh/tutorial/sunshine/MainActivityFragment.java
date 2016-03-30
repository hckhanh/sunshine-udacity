package com.hckhanh.tutorial.sunshine;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.Bind;
import butterknife.ButterKnife;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

  @Bind(R.id.listview_forecast) RecyclerView forecastListView;

  String[] WEEK_FORECAST_DATA = new String[] {
      "Today - Sunny - 88/63", "Tomorrow - Foggy - 70/46", "Weds - Cloudy - 72/63",
      "Thurs - Rainy - 64/51", "Fri - Foggy - 70/46", "Sat - Sunny - 76/68"
  };

  public MainActivityFragment() {
  }

  @Override public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    View rootView = inflater.inflate(R.layout.fragment_main, container, false);
    ButterKnife.bind(this, rootView);

    ArrayList<String> weekForecast = new ArrayList<>(Arrays.asList(WEEK_FORECAST_DATA));
    ForecastAdapter forecastAdapter = new ForecastAdapter(weekForecast);
    forecastListView.setHasFixedSize(true);
    forecastListView.setLayoutManager(new LinearLayoutManager(getActivity()));
    forecastListView.setAdapter(forecastAdapter);

    return rootView;
  }
}
