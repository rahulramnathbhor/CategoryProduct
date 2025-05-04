package com.example.crud.service.impl;

import com.example.crud.dto.CategoryDTO;
import com.example.crud.entity.Category;
import com.example.crud.exception.ResourceNotFoundException;
import com.example.crud.repository.CategoryRepository;
import com.example.crud.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository = null;
    @Override
    public Page<CategoryDTO> getAll(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return categoryRepository.findAll(pageable).map(this::convertToDto);
    }

    private CategoryDTO convertToDto(Category category) {
        return new CategoryDTO();
    }

    @Override
    public CategoryDTO create(CategoryDTO dto) {
        Category category = new Category();
        category.setName(dto.getName());
        return convertToDto(categoryRepository.save(category));
    }

    @Override
    public CategoryDTO getById(Long id) {
        Category category = categoryRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Category not found"));
        return convertToDto(category);
    }

    @Override
    public CategoryDTO update(Long id, CategoryDTO dto) {
        Category category = categoryRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Category not found"));
        category.setName(dto.getName());
        return convertToDto(categoryRepository.save(category));
    }

    @Override
    public void delete(Long id) {
        categoryRepository.deleteById(id);
    }
}
