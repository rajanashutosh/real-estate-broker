package org.company.marketplace.service.impl;

import lombok.RequiredArgsConstructor;
import org.company.marketplace.model.dto.ProjectInfo;
import org.company.marketplace.repository.ProjectRepository;
import org.company.marketplace.service.ProjectService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjectServiceImpl implements ProjectService {
    private final ProjectRepository projectRepository;

    @Override
    public List<ProjectInfo> getProjectInfo() {
        return null;
    }

    @Override
    public ProjectInfo getProjectInfoById(String id) {
        return null;
    }

    @Override
    public ProjectInfo saveProjectInfo(ProjectInfo ProjectInfo) {
        return null;
    }

    @Override
    public ProjectInfo updateProjectInfo(String id, ProjectInfo ProjectInfo) {
        return null;
    }

    @Override
    public ProjectInfo deleteProjectInfo(String id) {
        return null;
    }
}
