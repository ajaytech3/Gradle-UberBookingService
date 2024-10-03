package com.example.UberBookingService.controllers;

import com.example.UberBookingService.dtos.CreateBookingDto;
import com.example.UberBookingService.dtos.CreateBookingResponseDto;
import com.example.UberBookingService.dtos.UpdateBookingRequestDto;
import com.example.UberBookingService.dtos.UpdateBookingResponseDto;
import com.example.UberBookingService.services.BookingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/booking")
public class BookingController {

    private final BookingService bookingService;

    public BookingController(BookingService bookingService){
        this.bookingService=bookingService;
    }

    @PostMapping
    public ResponseEntity<CreateBookingResponseDto> createBooking(@RequestBody CreateBookingDto createBookingDto){
        return new ResponseEntity<>(bookingService.createBooking(createBookingDto), HttpStatus.CREATED);
    }


    @PatchMapping("/{bookingId}")
    public ResponseEntity<UpdateBookingResponseDto> updateBooking(@RequestBody UpdateBookingRequestDto requestDto,@PathVariable Long bookingId){
        return new ResponseEntity<>(bookingService.updateBooking(requestDto,bookingId), HttpStatus.OK);
    }
}
