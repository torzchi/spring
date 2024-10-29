package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdusRepository extends JpaRepository<Produs, Long> {
    // You can define custom query methods here if needed
}
