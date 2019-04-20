package com.example.apimovies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.apimovies.model.ResultsItem;
import com.example.apimovies.presenter.MainPresenter;
import com.example.apimovies.presenter.MainView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView {
    private RecyclerView recyclerView;
    private MoviesAdapter moviesAdapter;
    private MainPresenter mainPresenter;
    private String API_KEY = "d3d53dc7c6c5979947428171320d1a93";
    private String language = "en-US";
    private int page = 1;
    private String region = "indonesia";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);
        mainPresenter = new MainPresenter(this,this);
        mainPresenter.loadMovies(API_KEY, language, page, region);

    }
    @Override
    public void onSuccess(List<ResultsItem> resultsItemList){
        moviesAdapter = new MoviesAdapter(getApplicationContext(),resultsItemList);
        recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));
        recyclerView.setAdapter(moviesAdapter);
        moviesAdapter.notifyDataSetChanged();

    }
    @Override
    public void onError(String errorMessage) {
        Toast.makeText(this, errorMessage, Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onFailure(String failureMessage) {
        Toast.makeText(this, failureMessage, Toast.LENGTH_SHORT).show();
    }
}
