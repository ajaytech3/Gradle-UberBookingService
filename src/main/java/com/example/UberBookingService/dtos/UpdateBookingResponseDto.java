package com.example.UberBookingService.dtos;

import com.example.UberProject_EntityService.models.BookingStatus;
import com.example.UberProject_EntityService.models.Driver;
import lombok.*;

import java.util.Optional;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateBookingResponseDto {

    private Long bookingId;
    private BookingStatus status;
    private Optional<Driver> driver;
}
