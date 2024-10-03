package com.example.UberBookingService.services;

import com.example.UberBookingService.dtos.CreateBookingDto;
import com.example.UberBookingService.dtos.CreateBookingResponseDto;
import com.example.UberProject_EntityService.models.Booking;
import org.springframework.stereotype.Service;


public interface BookingService {

    public CreateBookingResponseDto createBooking(CreateBookingDto createBookingDto);
}
