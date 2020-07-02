package org.company.marketplace.controller;

import lombok.RequiredArgsConstructor;
import org.company.marketplace.model.dto.ProjectInfo;
import org.company.marketplace.service.ProjectService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Ashutosh Rajan
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class ProjectController {

    private final ProjectService projectService;

    @GetMapping("/projects")
    public ResponseEntity<ProjectInfo> getProjectInfo() {
        return null;
    }

    @GetMapping("/projects/{id}")
    public ResponseEntity<ProjectInfo> getProjectInfoById(@PathVariable String id) {
        return null;
    }

    @PostMapping("/projects")
    public ResponseEntity<ProjectInfo> saveProjectInfo(@RequestBody ProjectInfo ProjectInfo) {
        return null;
    }

    @PutMapping("/projects/{id}")
    public ResponseEntity<ProjectInfo> updateProjectInfo(@PathVariable String id, @RequestBody ProjectInfo ProjectInfo) {
        return null;
    }

    @DeleteMapping("/projects/{id}")
    public ResponseEntity<ProjectInfo> deleteProjectInfo(@PathVariable String id) {
        return null;
    }
}
