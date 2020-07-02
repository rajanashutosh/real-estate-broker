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
public class User {
    @JsonSerialize(using = ObjectIdSerializer.class)
    private ObjectId userId;
    private String userName;
    private String firstName;
    private String lastName;
    private String phoneNo;
    private Address userAddress;
    private String email;
}
