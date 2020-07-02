package org.company.marketplace.controller;

import lombok.RequiredArgsConstructor;
import org.company.marketplace.model.dto.BookingInfo;
import org.company.marketplace.service.BookingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

/**
 * @author Ashutosh Rajan
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class BookingController {

    private final BookingService bookingService;

    @GetMapping("/bookings")
    public ResponseEntity<List<BookingInfo>> getBookings() {
        List<BookingInfo> bookingInfos = bookingService.getBookings();
        return ResponseEntity.ok(bookingInfos);
    }

    @GetMapping("/bookings/{id}")
    public ResponseEntity<BookingInfo> getBookingInfoById(@PathVariable String id) {
        BookingInfo bookingInfo = bookingService.getBookingInfoById(id);
        if (Objects.nonNull(bookingInfo))
            return ResponseEntity.ok(bookingInfo);
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/bookings")
    public ResponseEntity<BookingInfo> saveBookingInfo(@RequestBody BookingInfo inBookingInfo) {
        BookingInfo bookingInfo = bookingService.saveBookingInfo(inBookingInfo);
        if (Objects.nonNull(bookingInfo))
            return ResponseEntity.ok(bookingInfo);
        return ResponseEntity.unprocessableEntity().build();

    }

    @PutMapping("/bookings/{id}")
    public ResponseEntity<BookingInfo> updateBookingInfo(@PathVariable String id, @RequestBody BookingInfo inBookingInfo) {
        BookingInfo bookingInfo = bookingService.updateBookingInfo(id, inBookingInfo);
        if (Objects.nonNull(bookingInfo))
            return ResponseEntity.ok(bookingInfo);
        return ResponseEntity.unprocessableEntity().build();
    }

    @DeleteMapping("/bookings/{id}")
    public ResponseEntity<BookingInfo> deleteBookingInfo(@PathVariable String id) {
        BookingInfo bookingInfo = bookingService.deleteBookingInfo(id);
        if (Objects.nonNull(bookingInfo))
            return ResponseEntity.ok(bookingInfo);
        return ResponseEntity.unprocessableEntity().build();
    }
}
