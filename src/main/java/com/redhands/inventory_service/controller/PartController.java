package com.redhands.inventory_service.controller;

import com.redhands.inventory_service.entity.Part;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/parts")
public class PartController {

    @GetMapping
    public List<Part> getAllParts() {
        List<Part> dummyParts = new ArrayList<>();
        
        dummyParts.add(new Part(1L, "Engine", 10));
        dummyParts.add(new Part(2L, "Tire", 50));

        return dummyParts;
    }
}