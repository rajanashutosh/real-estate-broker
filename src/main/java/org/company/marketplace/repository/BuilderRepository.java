package org.company.marketplace.repository;

import org.bson.types.ObjectId;
import org.company.marketplace.model.dto.Builder;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BuilderRepository extends MongoRepository<Builder, ObjectId> {
}
