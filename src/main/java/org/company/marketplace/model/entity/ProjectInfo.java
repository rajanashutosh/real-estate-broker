package org.company.marketplace.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import org.bson.types.ObjectId;
import org.company.marketplace.util.ObjectIdSerializer;

import java.util.Map;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProjectInfo {
    @JsonSerialize(using = ObjectIdSerializer.class)
    private ObjectId projectId;
    private String projectName;
    @JsonSerialize(using = ObjectIdSerializer.class)
    private ObjectId builderId;
    private String projectType;
    private String projectApprovalNo;
    private Map<String, String> apartmentPlanCount;
}
