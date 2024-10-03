package com.example.UberBookingService.apis;

import com.example.UberBookingService.dtos.DriverLocationDto;
import com.example.UberBookingService.dtos.NearbyDriversRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface LocationServiceApi {

    @POST("/api/location/nearby/drivers")
    Call<DriverLocationDto[]> getNearbyDrivers(@Body NearbyDriversRequestDto requestDto);
}
