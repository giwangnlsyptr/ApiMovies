package com.example.apimovies;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailMoviesActivity extends AppCompatActivity {
    TextView tvTitle, tvReleaseDate, tvOverview;
    ImageView ivBackdrop, ivPoster;
    ActionBar toolbar;
    private static final String BASE_URL = "http://image.tmdb.org/t/p/original";

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



        String title = getIntent().getStringExtra("title");
        String releasedate = getIntent().getStringExtra("releasedate");
        String poster = getIntent().getStringExtra("poster");
        String backdrop = getIntent().getStringExtra("backdrop");
        String overview = getIntent().getStringExtra("overview");
        toolbar.setTitle(title);

        tvTitle.setText(title);
        tvReleaseDate.setText(releasedate);
        tvOverview.setText(overview);
        Picasso.get().load(BASE_URL+poster).placeholder(R.mipmap.ic_launcher).error(R.mipmap.ic_launcher).into(ivPoster);
        Picasso.get().load(BASE_URL+backdrop).placeholder(R.mipmap.ic_launcher).error(R.mipmap.ic_launcher).into(ivBackdrop);
    }






}
