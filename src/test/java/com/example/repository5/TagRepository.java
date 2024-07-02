package com.example.repository5;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity5.Tag;

public interface TagRepository extends JpaRepository<Tag, Integer> {
}