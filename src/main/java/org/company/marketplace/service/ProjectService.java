package org.company.marketplace.service;

import org.company.marketplace.model.dto.ProjectInfo;

public interface ProjectService {
    ProjectInfo getProjectInfo();

    ProjectInfo getProjectInfoById(String id);

    ProjectInfo saveProjectInfo(ProjectInfo ProjectInfo);

    ProjectInfo updateProjectInfo(String id, ProjectInfo ProjectInfo);

    ProjectInfo deleteProjectInfo(String id);
}
