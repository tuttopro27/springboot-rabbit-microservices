package com.example.springbootrabbitmq.servicesjpa;
import java.util.List;

import com.example.springbootrabbitmq.commands.ProductForm;
import com.example.springbootrabbitmq.domain.Product;

public interface ProductService {
	 List<Product> listAll();

	    Product getById(Long id);

	    Product saveOrUpdate(Product product);

	    void delete(Long id);

	    Product saveOrUpdateProductForm(ProductForm productForm);

	    void sendProductMessage(String id);
}
