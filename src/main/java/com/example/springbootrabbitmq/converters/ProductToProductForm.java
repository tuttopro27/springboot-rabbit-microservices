package com.example.springbootrabbitmq.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.example.springbootrabbitmq.commands.ProductForm;
import com.example.springbootrabbitmq.domain.Product;

@Component
public class ProductToProductForm implements Converter <Product, ProductForm>{
	 @Override
	    public ProductForm convert(Product product) {
	        ProductForm productForm = new ProductForm();
	        productForm.setId(product.getId());
	        productForm.setDescription(product.getDescription());
	        productForm.setPrice(product.getPrice());
	        productForm.setImageUrl(product.getImageUrl());
	        return productForm;
	    }
}
