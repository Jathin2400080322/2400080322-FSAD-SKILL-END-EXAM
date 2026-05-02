package com.klef.fsad.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    @Autowired
    private BookingRepository repo;

    // ADD booking
    public Booking addBooking(Booking b) {
        return repo.save(b);
    }

    // DELETE booking
    public void deleteBooking(int id) {
        repo.deleteById(id);
    }
}