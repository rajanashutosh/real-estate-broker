package org.company.marketplace.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import org.bson.types.ObjectId;
import org.company.marketplace.util.ObjectIdSerializer;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserEnquiry {
    @JsonSerialize(using = ObjectIdSerializer.class)
    private ObjectId enquiryId;
    private String userName;
    private String userEmail;
    private String userContact;
    private boolean isContacted;
    private LocalDate enquiryDate;
    private LocalDateTime contactStartDate;
    private LocalDateTime contactEndDate;
}
