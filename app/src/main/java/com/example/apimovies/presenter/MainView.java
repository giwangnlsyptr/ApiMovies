package com.example.apimovies.presenter;

import com.example.apimovies.model.ResultsItem;

import java.util.List;

public interface MainView {
    void onSuccess(List<ResultsItem> resultsItemList);
    void onError(String errorMessage);
    void onFailure(String failureMessage);
}
