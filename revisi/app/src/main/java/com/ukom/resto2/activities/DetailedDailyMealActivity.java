package com.ukom.resto2.activities;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ukom.resto2.R;
import com.ukom.resto2.adapters.DetailedDailyAdapter;
import com.ukom.resto2.models.DetailedDailyModel;

import java.util.ArrayList;
import java.util.List;

public class DetailedDailyMealActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<DetailedDailyModel> detailedDailyModelsList;
    DetailedDailyAdapter dailyAdapter;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_daily_meal);

        String type = getIntent().getStringExtra("type");

        recyclerView = findViewById(R.id.detailed_rec);
        imageView = findViewById(R.id.detailed_img);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        detailedDailyModelsList = new ArrayList<>();
        dailyAdapter = new DetailedDailyAdapter(detailedDailyModelsList);
        recyclerView.setAdapter(dailyAdapter);

        if (type != null && type.equalsIgnoreCase("breakfast")){

            detailedDailyModelsList.add(new DetailedDailyModel(R.drawable.fav1,"Breakfast","description","4.5","40k","10am to 9pm"));
            detailedDailyModelsList.add(new DetailedDailyModel(R.drawable.fav2,"Breakfast","description","4.5","40k","10am to 9pm"));
            detailedDailyModelsList.add(new DetailedDailyModel(R.drawable.fav3,"Breakfast","description","4.5","40k","10am to 9pm"));
            dailyAdapter.notifyDataSetChanged();
        }

        if (type != null && type.equalsIgnoreCase("sweets")){

            imageView.setImageResource(R.drawable.sweets);
            detailedDailyModelsList.add(new DetailedDailyModel(R.drawable.s1,"Breakfast","description","4.5","40k","10am to 9pm"));
            detailedDailyModelsList.add(new DetailedDailyModel(R.drawable.s2,"Breakfast","description","4.5","40k","10am to 9pm"));
            detailedDailyModelsList.add(new DetailedDailyModel(R.drawable.s3,"Breakfast","description","4.5","40k","10am to 9pm"));
            dailyAdapter.notifyDataSetChanged();
        }
    }
}
