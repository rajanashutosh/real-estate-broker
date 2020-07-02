package org.company.marketplace.service;

import org.company.marketplace.model.dto.Builder;

import java.util.List;

public interface BuilderService {
    List<Builder> getBuilders();

    Builder getBuilderById(String id);

    Builder saveBuilder(Builder Builder);

    Builder updateBuilder(String id, Builder Builder);

    Builder deleteBuilder(String id);
}
