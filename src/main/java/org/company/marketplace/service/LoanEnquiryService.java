package org.company.marketplace.service;

import org.company.marketplace.model.dto.LoanEnquiry;

public interface LoanEnquiryService {
    LoanEnquiry getLoanEnquiries();

    LoanEnquiry getLoanEnquiryById(String id);

    LoanEnquiry saveLoanEnquiry(LoanEnquiry LoanEnquiry);

    LoanEnquiry updateLoanEnquiry(String id, LoanEnquiry LoanEnquiry);

    LoanEnquiry deleteLoanEnquiry(String id);
}
