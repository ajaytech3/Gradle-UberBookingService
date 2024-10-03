package com.example.UberBookingService.dtos;

import com.example.UberProject_EntityService.models.BookingStatus;
import lombok.*;

import java.util.Optional;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateBookingRequestDto {
    private Optional<Long> driverId;
    private String status;
}
