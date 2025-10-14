package com.redhands.inventory_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;  // Lombok으로 getter/setter/toString 자동
import lombok.NoArgsConstructor;

@Entity  // JPA 엔티티 (나중 DB 저장용)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Part {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;      // 부품 ID
    private String name;  // 부품 이름
    private int count;    // 재고 수량
}