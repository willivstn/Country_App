package com.willi_vstn.country_app.service;

import com.willi_vstn.country_app.model.Result;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetCountryDataService {

    //Retrofit Interface

    @GET("countries")
    Call<Result> getResult();
}
