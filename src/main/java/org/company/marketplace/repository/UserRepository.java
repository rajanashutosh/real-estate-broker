package org.company.marketplace.repository;

import org.bson.types.ObjectId;
import org.company.marketplace.model.dto.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {

}
