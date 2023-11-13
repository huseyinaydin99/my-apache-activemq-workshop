package tr.com.huseyinaydin.dao.service;

import java.util.List;

import tr.com.huseyinaydin.pojo.Products;

public interface ProductsDAO {
	
	public List<Products> getAllProducts();
	public Products getProductById(Integer id);
}
