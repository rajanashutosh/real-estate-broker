package org.company.marketplace.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import org.bson.types.ObjectId;
import org.company.marketplace.util.ObjectIdSerializer;

import java.time.LocalDate;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoanEnquiry {
    @JsonSerialize(using = ObjectIdSerializer.class)
    private ObjectId enquiryId;
    @JsonSerialize(using = ObjectIdSerializer.class)
    private ObjectId bookingId;
    @JsonSerialize(using = ObjectIdSerializer.class)
    private ObjectId userId;
    private boolean isContacted;
    private LocalDate enquiryDate;
    private String loanProvider;
}
