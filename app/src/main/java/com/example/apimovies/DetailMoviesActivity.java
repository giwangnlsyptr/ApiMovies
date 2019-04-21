package com.example.apimovies;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.apimovies.model.ResultsItem;

import java.util.List;

public class DetailMoviesActivity extends AppCompatActivity {
    TextView tvTitle, tvReleaseDate, tvOverview;
    ImageView ivBackdrop, ivPoster;
    private List<ResultsItem> resultsItemList;
    private Context context;
    ActionBar toolbar;

    public DetailMoviesActivity(List<ResultsItem> resultsItemList, Context context) {
        this.resultsItemList = resultsItemList;
        this.context = context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_movies);
        tvTitle = findViewById(R.id.title);
        tvReleaseDate = findViewById(R.id.releasedate);
        tvOverview = findViewById(R.id.overview);
        ivBackdrop = findViewById(R.id.backdrop);
        ivPoster = findViewById(R.id.poster);
        toolbar = getSupportActionBar();

        toolbar.setTitle("");

        //tvTitle.setText(resultsItemList.get(position).getTitle());
        //tvOverview.setText(resultsItemList.get(position).getOverview());
        //tvReleaseDate.setText(resultsItemList.get(position).getReleaseDate());



    }






}
