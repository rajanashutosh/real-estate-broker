package org.company.marketplace.service;

import org.company.marketplace.model.dto.ApartmentInfo;

import java.util.List;

public interface ApartmentService {
    List<ApartmentInfo> getApartmentsByQueryParams(String criteria, String value);

    ApartmentInfo getApartmentInfoById(String id);

    ApartmentInfo saveApartmentInfo(ApartmentInfo ApartmentInfo);

    ApartmentInfo updateApartmentInfo(String id, ApartmentInfo ApartmentInfo);

    ApartmentInfo deleteApartmentInfo(String id);
}
