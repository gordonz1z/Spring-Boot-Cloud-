package com.bookfun.demoproviderbooking.service;

import org.springframework.stereotype.Service;

@Service
public class BookingService {
    public String getBooking(){
        return "Booking A service from 7pm to 8pm";
    }
}
