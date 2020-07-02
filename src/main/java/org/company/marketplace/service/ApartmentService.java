package org.company.marketplace.service;

import org.company.marketplace.model.dto.ApartmentInfo;

import java.util.List;

public interface ApartmentService {
    List<ApartmentInfo> getApartmentsByQueryParams(String criteria, String value);

    ApartmentInfo getApartmentInfoById(String id);

    ApartmentInfo saveApartmentInfo(ApartmentInfo apartmentInfo);

    ApartmentInfo updateApartmentInfo(String id, ApartmentInfo apartmentInfo);

    ApartmentInfo deleteApartmentInfo(String id);
}
