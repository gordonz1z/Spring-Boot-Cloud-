package com.bookfun.demoproviderbooking.controller;

import com.bookfun.demoproviderbooking.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {

    @Autowired
    BookingService bookingService;

    @GetMapping("/booking")
    public String getBooking(){
        return bookingService.getBooking();
    }
}
