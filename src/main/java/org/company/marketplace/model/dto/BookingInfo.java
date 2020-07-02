package org.company.marketplace.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import org.bson.types.ObjectId;
import org.company.marketplace.util.ObjectIdSerializer;

import java.time.LocalDateTime;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BookingInfo {
    @JsonSerialize(using = ObjectIdSerializer.class)
    private ObjectId bookingId;
    @JsonSerialize(using = ObjectIdSerializer.class)
    private ObjectId userId;
    @JsonSerialize(using = ObjectIdSerializer.class)
    private ObjectId apartmentId;
    private double bookingAmt;
    private LocalDateTime bookingDate;
    private boolean isLoanRequired;
}
