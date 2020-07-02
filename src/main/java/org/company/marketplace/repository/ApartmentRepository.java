package org.company.marketplace.repository;

import org.bson.types.ObjectId;
import org.company.marketplace.model.dto.ApartmentInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ApartmentRepository extends MongoRepository<ApartmentInfo, ObjectId> {

}
