package com.example.UberBookingService.dtos;

import com.example.UberProject_EntityService.models.Driver;
import lombok.*;

import java.util.Optional;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateBookingResponseDto {

    private  Long bookingId;
    private  String bookingStatus;
    private Optional<Driver> driver;
}
