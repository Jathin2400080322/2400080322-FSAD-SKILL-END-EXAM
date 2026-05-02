package com.klef.fsad.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/booking")
public class BookingController {

    @Autowired
    private BookingService service;

    // POST → Add booking
    @PostMapping("/add")
    public Booking add(@RequestBody Booking b) {
        return service.addBooking(b);
    }

    // DELETE → Delete booking
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        service.deleteBooking(id);
        return "Deleted Successfully";
    }
}