package org.company.marketplace.service;

import org.company.marketplace.model.dto.BookingInfo;

public interface BookingService {
    BookingInfo getBookings();

    BookingInfo getBookingInfoById(String id);

    BookingInfo saveBookingInfo(BookingInfo BookingInfo);

    BookingInfo updateBookingInfo(String id, BookingInfo BookingInfo);

    BookingInfo deleteBookingInfo(String id);
}
