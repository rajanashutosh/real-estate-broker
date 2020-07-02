package org.company.marketplace.service.impl;

import lombok.RequiredArgsConstructor;
import org.company.marketplace.model.dto.ApartmentInfo;
import org.company.marketplace.repository.ApartmentRepository;
import org.company.marketplace.service.ApartmentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ApartmentServiceImpl implements ApartmentService {

    private final ApartmentRepository apartmentRepository;

    @Override
    public List<ApartmentInfo> getApartmentsByQueryParams(String criteria, String value) {
        return null;
    }

    @Override
    public ApartmentInfo getApartmentInfoById(String id) {
        return null;
    }

    @Override
    public ApartmentInfo saveApartmentInfo(ApartmentInfo ApartmentInfo) {
        return null;
    }

    @Override
    public ApartmentInfo updateApartmentInfo(String id, ApartmentInfo ApartmentInfo) {
        return null;
    }

    @Override
    public ApartmentInfo deleteApartmentInfo(String id) {
        return null;
    }
}
