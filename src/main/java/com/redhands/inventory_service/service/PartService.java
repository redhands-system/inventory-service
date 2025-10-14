package com.redhands.inventory_service.service;

import com.redhands.inventory_service.entity.Part;
import com.redhands.inventory_service.repository.PartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PartService {

    private final PartRepository partRepository;

    public List<Part> getAllParts() {
        return partRepository.findAll();
    }

    @Transactional
    public Part decreaseStock(Long partId, int quantity) {
        Part part = partRepository.findById(partId)
                .orElseThrow(() -> new RuntimeException("Part not found: " + partId));

        if (part.getCount() < quantity) {
            throw new RuntimeException("재고 부족: " + part.getName());
        }

        part.setCount(part.getCount() - quantity);
        return partRepository.save(part);
    }
}