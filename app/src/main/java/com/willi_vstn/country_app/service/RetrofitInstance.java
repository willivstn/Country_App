package com.willi_vstn.country_app.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {

    private static Retrofit retrofit = null;
    private static String BASE_URL = "https://api.printful.com/";

    //Singleton Pattern Used to Create an instance of Retrofit
    public static GetCountryDataService getService(){


        //instance is not created before
        if(retrofit == null){
            retrofit = new Retrofit
                    .Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }



        //if instance is already created
        return retrofit.create(GetCountryDataService.class);
    }
}
