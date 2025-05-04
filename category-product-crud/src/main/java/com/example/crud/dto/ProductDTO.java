package com.example.crud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    public ProductDTO(Object id2, Object name2, Object price2, Object id3) {
		// TODO Auto-generated constructor stub
	}
	private Long id;
    private String name;
    private double price;
    private Long categoryId;
	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getPrice() {
		// TODO Auto-generated method stub
		return null;
	}
	public Long getCategoryId() {
		// TODO Auto-generated method stub
		return null;
	}
}
