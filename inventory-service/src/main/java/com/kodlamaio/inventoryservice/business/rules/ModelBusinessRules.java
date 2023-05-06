package com.kodlamaio.inventoryservice.business.rules;

import com.kodlamaio.inventoryservice.repository.ModelRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class ModelBusinessRules {
    private final ModelRepository repository;

    public void checkIfBrandExists(UUID id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("MODEL_NOT_EXISTS");
        }
    }
}
