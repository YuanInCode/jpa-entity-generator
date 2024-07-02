package com.example.repository5;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity5.BlogArticleTag;

public interface BlogArticleTagRepository extends JpaRepository<BlogArticleTag, Integer> {
}