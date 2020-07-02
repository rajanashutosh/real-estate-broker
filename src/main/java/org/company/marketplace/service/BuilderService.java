package org.company.marketplace.service;

import org.company.marketplace.model.dto.Builder;

public interface BuilderService {
    Builder getBuilders();

    Builder getBuilderById(String id);

    Builder saveBuilder(Builder Builder);

    Builder updateBuilder(String id, Builder Builder);

    Builder deleteBuilder(String id);
}
