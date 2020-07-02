package org.company.marketplace.service.impl;

import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.company.marketplace.model.dto.Builder;
import org.company.marketplace.repository.BuilderRepository;
import org.company.marketplace.service.BuilderService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class BuilderServiceImpl implements BuilderService {
    private final BuilderRepository builderRepository;

    @Override
    public List<Builder> getBuilders() {
        return builderRepository.findAll();
    }

    @Override
    public Builder getBuilderById(String id) {
        return builderRepository.findById(new ObjectId(id)).orElse(null);
    }

    @Override
    public Builder saveBuilder(Builder builder) {
        return builderRepository.save(builder);
    }

    @Override
    public Builder updateBuilder(String id, Builder builder) { // To Map content seperately
        if (Objects.nonNull(builderRepository.findById(new ObjectId(id)).orElse(null)))
            return builderRepository.save(builder);
        return null;
    }

    @Override
    public Builder deleteBuilder(String id) {
        Builder builder = builderRepository.findById(new ObjectId(id)).orElse(null);
        if (Objects.nonNull(builder))
            builderRepository.deleteById(new ObjectId(id));
        return builder;
    }
}
