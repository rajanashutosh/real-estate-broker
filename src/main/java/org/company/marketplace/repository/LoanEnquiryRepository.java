package org.company.marketplace.repository;

import org.bson.types.ObjectId;
import org.company.marketplace.model.dto.LoanEnquiry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LoanEnquiryRepository extends MongoRepository<LoanEnquiry, ObjectId> {

}
