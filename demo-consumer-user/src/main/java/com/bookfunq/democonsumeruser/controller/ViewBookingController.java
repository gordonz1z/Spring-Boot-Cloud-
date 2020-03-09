package com.bookfunq.democonsumeruser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ViewBookingController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/viewBooking")
    public String viewBooking(String name){
        String s=restTemplate.getForObject("http://PROVIDER-BOOKING/booking", String.class);
        return name+" Order Information: "+s;
    }
}
