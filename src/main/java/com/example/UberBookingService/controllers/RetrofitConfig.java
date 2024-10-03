package com.example.UberBookingService.controllers;

import com.example.UberBookingService.apis.LocationServiceApi;
import com.netflix.discovery.EurekaClient;
import okhttp3.OkHttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class RetrofitConfig {

//    @Bean
//    public Retrofit retrofit(){
//        return new Retrofit.Builder()
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//    }

    @Autowired
    private EurekaClient eurekaClient;

    private String getServiceUrl(String serviceName){
        return eurekaClient.getNextServerFromEureka(serviceName,false).getHomePageUrl();
    }

    @Bean
    public LocationServiceApi locationServiceApi(){
        return new Retrofit.Builder()
                .baseUrl(getServiceUrl("UBERPROJECT-LOCATIONSERVICE"))
                .addConverterFactory(GsonConverterFactory.create())
                .client(new OkHttpClient.Builder().build())
                .build()
                .create(LocationServiceApi.class);
    }
}
