package org.company.marketplace.controller;

import lombok.RequiredArgsConstructor;
import org.company.marketplace.model.dto.Builder;
import org.company.marketplace.service.BuilderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Ashutosh Rajan
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class BuilderController {

    private final BuilderService builderService;

    @GetMapping("/builders")
    public ResponseEntity<Builder> getBuilders() {
        return null;
    }

    @GetMapping("/builders/{id}")
    public ResponseEntity<Builder> getBuilderById(@PathVariable String id) {
        return null;
    }

    @PostMapping("/builders")
    public ResponseEntity<Builder> saveBuilder(@RequestBody Builder Builder) {
        return null;
    }

    @PutMapping("/builders/{id}")
    public ResponseEntity<Builder> updateBuilder(@PathVariable String id, @RequestBody Builder Builder) {
        return null;
    }

    @DeleteMapping("/builders/{id}")
    public ResponseEntity<Builder> deleteBuilder(@PathVariable String id) {
        return null;
    }
}
