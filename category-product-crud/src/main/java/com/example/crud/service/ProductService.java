package com.example.crud.service;

import com.example.crud.dto.ProductDTO;
import org.springframework.data.domain.Page;

public interface ProductService {
    Page<ProductDTO> getAll(int page, int size);
    ProductDTO create(ProductDTO dto);
    ProductDTO getById(Long id);
    ProductDTO update(Long id, ProductDTO dto);
    void delete(Long id);
}
