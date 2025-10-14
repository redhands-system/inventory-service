package com.redhands.inventory_service.controller;

import com.redhands.inventory_service.entity.Part;
import com.redhands.inventory_service.service.PartService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/parts")
@RequiredArgsConstructor
public class PartController {

    private final PartService partService;

    @GetMapping
    public List<Part> getAllParts() {
        return partService.getAllParts();
    }

    @PutMapping("/{id}/decrease")
    public Part decreaseStock(@PathVariable Long id, @RequestParam int quantity) {
        return partService.decreaseStock(id, quantity);
    }
}