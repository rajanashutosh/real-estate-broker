package org.company.marketplace.controller;

import lombok.RequiredArgsConstructor;
import org.company.marketplace.model.dto.BookingInfo;
import org.company.marketplace.service.BookingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Ashutosh Rajan
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class BookingController {

    private final BookingService bookingService;

    @GetMapping("/bookings")
    public ResponseEntity<BookingInfo> getBookings() {
        return null;
    }

    @GetMapping("/bookings/{id}")
    public ResponseEntity<BookingInfo> getBookingInfoById(@PathVariable String id) {
        return null;
    }

    @PostMapping("/bookings")
    public ResponseEntity<BookingInfo> saveBookingInfo(@RequestBody BookingInfo BookingInfo) {
        return null;
    }

    @PutMapping("/bookings/{id}")
    public ResponseEntity<BookingInfo> updateBookingInfo(@PathVariable String id, @RequestBody BookingInfo BookingInfo) {
        return null;
    }

    @DeleteMapping("/bookings/{id}")
    public ResponseEntity<BookingInfo> deleteBookingInfo(@PathVariable String id) {
        return null;
    }
}
