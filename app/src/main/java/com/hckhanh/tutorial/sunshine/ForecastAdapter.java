package com.hckhanh.tutorial.sunshine;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.Bind;
import butterknife.ButterKnife;
import java.util.List;

/**
 * Created by ohk1hc on 3/30/2016.
 */
public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastPlaceHolder> {
  private List<String> weekForecast;

  ForecastAdapter(List<String> weekForecast) {
    this.weekForecast = weekForecast;
  }

  @Override public ForecastPlaceHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View itemView =
        LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_forcast, parent, false);
    return new ForecastPlaceHolder(itemView);
  }

  @Override public void onBindViewHolder(ForecastPlaceHolder holder, int position) {
    holder.forecastTextView.setText(weekForecast.get(position));
  }

  @Override public int getItemCount() {
    return weekForecast.size();
  }

  class ForecastPlaceHolder extends RecyclerView.ViewHolder {
    @Bind(R.id.list_item_forecast_textview) TextView forecastTextView;

    public ForecastPlaceHolder(View itemView) {
      super(itemView);
      ButterKnife.bind(this, itemView);
    }
  }
}
