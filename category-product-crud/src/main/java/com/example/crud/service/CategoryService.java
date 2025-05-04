package com.example.crud.service;

import com.example.crud.dto.CategoryDTO;
import org.springframework.data.domain.Page;

public interface CategoryService {
    Page<CategoryDTO> getAll(int page, int size);
    CategoryDTO create(CategoryDTO dto);
    CategoryDTO getById(Long id);
    CategoryDTO update(Long id, CategoryDTO dto);
    void delete(Long id);
}
