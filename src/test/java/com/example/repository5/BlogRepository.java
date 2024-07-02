package com.example.repository5;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity5.Blog;

public interface BlogRepository extends JpaRepository<Blog, Integer> {
}