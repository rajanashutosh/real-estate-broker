package org.company.marketplace.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import org.bson.types.ObjectId;
import org.company.marketplace.util.ObjectIdSerializer;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApartmentInfo {
    @JsonSerialize(using = ObjectIdSerializer.class)
    private ObjectId apartmentId;
    @JsonSerialize(using = ObjectIdSerializer.class)
    private ObjectId projectId;
    private String builderName;
    private String projectName;
    private String apartmentBlockNo;
    private String apartmentNo;
    private Address apartmentAddress;
}
