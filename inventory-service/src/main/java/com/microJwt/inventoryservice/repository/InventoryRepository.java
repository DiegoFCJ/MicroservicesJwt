package com.microJwt.inventoryservice.repository;

import com.microJwt.inventoryservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    Optional<Inventory> findBySkuCode(String skuCode);
    Optional<Inventory> findBySkuCodeIn(List<String> skuCode);
}

