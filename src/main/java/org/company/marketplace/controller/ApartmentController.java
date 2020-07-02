package org.company.marketplace.controller;

import lombok.RequiredArgsConstructor;
import org.company.marketplace.model.dto.ApartmentInfo;
import org.company.marketplace.service.ApartmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Ashutosh Rajan
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class ApartmentController {

    private final ApartmentService apartmentService;

    @GetMapping("/apartments")
    public ResponseEntity<ApartmentInfo> getApartmentsByQueryParams(@RequestParam(required = false) String criteria,
                                                                    @RequestParam(required = false) String value) {
        return null;
    }

    @GetMapping("/apartments/{id}")
    public ResponseEntity<ApartmentInfo> getApartmentInfoById(@PathVariable String id) {
        return null;
    }

    @PostMapping("/apartments")
    public ResponseEntity<ApartmentInfo> saveApartmentInfo(@RequestBody ApartmentInfo ApartmentInfo) {
        return null;
    }

    @PutMapping("/apartments/{id}")
    public ResponseEntity<ApartmentInfo> updateApartmentInfo(@PathVariable String id, @RequestBody ApartmentInfo ApartmentInfo) {
        return null;
    }

    @DeleteMapping("/apartments/{id}")
    public ResponseEntity<ApartmentInfo> deleteApartmentInfo(@PathVariable String id) {
        return null;
    }
}
