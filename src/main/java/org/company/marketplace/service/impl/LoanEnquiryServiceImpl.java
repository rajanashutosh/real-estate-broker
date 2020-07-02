package org.company.marketplace.service.impl;

import lombok.RequiredArgsConstructor;
import org.company.marketplace.model.dto.LoanEnquiry;
import org.company.marketplace.repository.LoanEnquiryRepository;
import org.company.marketplace.service.LoanEnquiryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LoanEnquiryServiceImpl implements LoanEnquiryService {
    private final LoanEnquiryRepository loanEnquiryRepository;

    @Override
    public List<LoanEnquiry> getLoanEnquiries() {
        return null;
    }

    @Override
    public LoanEnquiry getLoanEnquiryById(String id) {
        return null;
    }

    @Override
    public LoanEnquiry saveLoanEnquiry(LoanEnquiry LoanEnquiry) {
        return null;
    }

    @Override
    public LoanEnquiry updateLoanEnquiry(String id, LoanEnquiry LoanEnquiry) {
        return null;
    }

    @Override
    public LoanEnquiry deleteLoanEnquiry(String id) {
        return null;
    }
}
