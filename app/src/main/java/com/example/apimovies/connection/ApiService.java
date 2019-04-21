package com.example.apimovies.connection;

import com.example.apimovies.model.ImagesResponse;
import com.example.apimovies.model.Response;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("3/movie/popular")
    Call<Response> getMovies(@Query("api_key") String api_key,
                              @Query("language") String language,
                              @Query("page") int page,
                              @Query("region") String region);
    @GET("3/configuration")
    Call<ImagesResponse> getImages(@Query("api_key") String api_key);
}

