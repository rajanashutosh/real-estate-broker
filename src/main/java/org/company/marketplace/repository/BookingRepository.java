package org.company.marketplace.repository;

import org.bson.types.ObjectId;
import org.company.marketplace.model.dto.BookingInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookingRepository extends MongoRepository<BookingInfo, ObjectId> {
}
