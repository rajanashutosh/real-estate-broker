package org.company.marketplace.repository;

import org.bson.types.ObjectId;
import org.company.marketplace.model.dto.ApartmentInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ApartmentRepository extends MongoRepository<ApartmentInfo, ObjectId> {
    List<ApartmentInfo> findByApartmentAddressLocality(String locality);

    List<ApartmentInfo> findByApartmentAddressPinCode(String pinCode);

}
