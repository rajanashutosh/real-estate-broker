package org.company.marketplace.service.impl;

import lombok.RequiredArgsConstructor;
import org.company.marketplace.model.dto.BookingInfo;
import org.company.marketplace.repository.BookingRepository;
import org.company.marketplace.service.BookingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookingServiceImpl implements BookingService {
    private final BookingRepository bookingRepository;

    @Override
    public List<BookingInfo> getBookings() {
        return null;
    }

    @Override
    public BookingInfo getBookingInfoById(String id) {
        return null;
    }

    @Override
    public BookingInfo saveBookingInfo(BookingInfo BookingInfo) {
        return null;
    }

    @Override
    public BookingInfo updateBookingInfo(String id, BookingInfo BookingInfo) {
        return null;
    }

    @Override
    public BookingInfo deleteBookingInfo(String id) {
        return null;
    }
}
