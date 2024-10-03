package com.example.UberBookingService.dtos;

import com.example.UberProject_EntityService.models.ExactLocation;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateBookingDto {

    private Long passengerId;

    private ExactLocation startLocation;

    private ExactLocation endLocation;
}
