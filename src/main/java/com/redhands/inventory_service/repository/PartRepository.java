package com.redhands.inventory_service.repository;

import com.redhands.inventory_service.entity.Part;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartRepository extends JpaRepository<Part, Long> {
}