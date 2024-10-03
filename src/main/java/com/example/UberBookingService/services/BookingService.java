package com.example.UberBookingService.services;

import com.example.UberBookingService.dtos.CreateBookingDto;
import com.example.UberBookingService.dtos.CreateBookingResponseDto;
import com.example.UberBookingService.dtos.UpdateBookingRequestDto;
import com.example.UberBookingService.dtos.UpdateBookingResponseDto;
import com.example.UberProject_EntityService.models.Booking;
import org.springframework.stereotype.Service;


public interface BookingService {

    public CreateBookingResponseDto createBooking(CreateBookingDto createBookingDto);

   public UpdateBookingResponseDto updateBooking(UpdateBookingRequestDto bookingRequestDto, Long bookingId);
}
