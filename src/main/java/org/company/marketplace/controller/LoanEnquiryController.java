package org.company.marketplace.controller;

import lombok.RequiredArgsConstructor;
import org.company.marketplace.model.dto.LoanEnquiry;
import org.company.marketplace.service.LoanEnquiryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Ashutosh Rajan
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class LoanEnquiryController {

    private final LoanEnquiryService loanEnquiryService;

    @GetMapping("/loan-enquiries")
    public ResponseEntity<LoanEnquiry> getLoanEnquiries() {
        return null;
    }

    @GetMapping("/loan-enquiries/{id}")
    public ResponseEntity<LoanEnquiry> getLoanEnquiryById(@PathVariable String id) {
        return null;
    }

    @PostMapping("/loan-enquiries")
    public ResponseEntity<LoanEnquiry> saveLoanEnquiry(@RequestBody LoanEnquiry LoanEnquiry) {
        return null;
    }

    @PutMapping("/loan-enquiries/{id}")
    public ResponseEntity<LoanEnquiry> updateLoanEnquiry(@PathVariable String id, @RequestBody LoanEnquiry LoanEnquiry) {
        return null;
    }

    @DeleteMapping("/loan-enquiries/{id}")
    public ResponseEntity<LoanEnquiry> deleteLoanEnquiry(@PathVariable String id) {
        return null;
    }
}
