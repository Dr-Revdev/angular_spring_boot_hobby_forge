package com.hobbyforge.backend.category;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public List<Category> findAllActiveCategories() {
        return categoryRepository.findByActiveTrueOrderByNameAsc();
    }
}
