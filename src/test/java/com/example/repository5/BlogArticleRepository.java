package com.example.repository5;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity5.BlogArticle;

public interface BlogArticleRepository extends JpaRepository<BlogArticle, Integer> {
}