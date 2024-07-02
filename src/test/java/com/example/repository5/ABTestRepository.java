package com.example.repository5;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity5.ABTest;

public interface ABTestRepository extends JpaRepository<ABTest, String> {
}