package org.company.marketplace.repository;

import org.company.marketplace.model.dto.ProjectInfo;

public interface ProjectRepository {
    ProjectInfo getProjectInfo();

    ProjectInfo getProjectInfoById(String id);

    ProjectInfo saveProjectInfo(ProjectInfo ProjectInfo);

    ProjectInfo updateProjectInfo(String id, ProjectInfo ProjectInfo);

    ProjectInfo deleteProjectInfo(String id);
}
