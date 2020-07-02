package org.company.marketplace.controller;

import lombok.RequiredArgsConstructor;
import org.company.marketplace.model.dto.ApartmentInfo;
import org.company.marketplace.service.ApartmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

/**
 * @author Ashutosh Rajan
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class ApartmentController {

    private final ApartmentService apartmentService;

    @GetMapping("/apartments")
    public ResponseEntity<List<ApartmentInfo>> getApartmentsByQueryParams(@RequestParam(required = false) String criteria,
                                                                          @RequestParam(required = false) String value) {
        List<ApartmentInfo> apartmentInfoList = apartmentService.getApartmentsByQueryParams(criteria, value);
        return ResponseEntity.ok(apartmentInfoList);
    }

    @GetMapping("/apartments/{id}")
    public ResponseEntity<ApartmentInfo> getApartmentInfoById(@PathVariable String id) {
        ApartmentInfo apartmentInfo = apartmentService.getApartmentInfoById(id);
        if (Objects.nonNull(apartmentInfo)) {
            return ResponseEntity.ok(apartmentInfo);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/apartments")
    public ResponseEntity<ApartmentInfo> saveApartmentInfo(@RequestBody ApartmentInfo apartmentInfo) {
        ApartmentInfo savedApartmentInfo = apartmentService.saveApartmentInfo(apartmentInfo);
        if (Objects.nonNull(savedApartmentInfo)) {
            return ResponseEntity.ok(savedApartmentInfo);
        }
        return ResponseEntity.unprocessableEntity().build();
    }

    @PutMapping("/apartments/{id}")
    public ResponseEntity<ApartmentInfo> updateApartmentInfo(@PathVariable String id, @RequestBody ApartmentInfo apartmentInfo) {
        ApartmentInfo updatedApartmentInfo = apartmentService.updateApartmentInfo(id, apartmentInfo);
        if (Objects.nonNull(updatedApartmentInfo)) {
            return ResponseEntity.ok(updatedApartmentInfo);
        }
        return ResponseEntity.unprocessableEntity().build();
    }

    @DeleteMapping("/apartments/{id}")
    public ResponseEntity<Void> deleteApartmentInfo(@PathVariable String id) {
        ApartmentInfo deletedApartmentInfo = apartmentService.deleteApartmentInfo(id);
        if (Objects.nonNull(deletedApartmentInfo)) {
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.unprocessableEntity().build();
    }
}
