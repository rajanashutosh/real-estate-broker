package org.company.marketplace.service.impl;

import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.bson.types.ObjectId;
import org.company.marketplace.model.dto.ApartmentInfo;
import org.company.marketplace.repository.ApartmentRepository;
import org.company.marketplace.service.ApartmentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class ApartmentServiceImpl implements ApartmentService {

    private final ApartmentRepository apartmentRepository;

    @Override
    public List<ApartmentInfo> getApartmentsByQueryParams(String criteria, String value) {
        if (StringUtils.isNotBlank(criteria) && StringUtils.isNotBlank(value)) {
            switch (criteria.toLowerCase()) {
                case "pincode":
                    return apartmentRepository.findByApartmentAddressPinCode(value);
                case "locality":
                    return apartmentRepository.findByApartmentAddressLocality(value);
            }
        }
        return apartmentRepository.findAll();
    }

    @Override
    public ApartmentInfo getApartmentInfoById(String id) {
        return apartmentRepository.findById(new ObjectId(id)).orElse(null);
    }

    @Override
    public ApartmentInfo saveApartmentInfo(ApartmentInfo apartmentInfo) {
        return apartmentRepository.save(apartmentInfo);
    }

    @Override
    public ApartmentInfo updateApartmentInfo(String id, ApartmentInfo apartmentInfo) {
        return apartmentRepository.save(apartmentInfo);
    }

    @Override
    public ApartmentInfo deleteApartmentInfo(String id) {
        ApartmentInfo apartmentInfo = apartmentRepository.findById(new ObjectId(id)).orElse(null);
        if (Objects.nonNull(apartmentInfo))
            apartmentRepository.deleteById(new ObjectId(id));
        return apartmentInfo;
    }
}
