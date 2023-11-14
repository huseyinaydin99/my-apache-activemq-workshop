package tr.com.huseyinaydin.services;

import java.util.List;

import tr.com.huseyinaydin.commands.ProductForm;
import tr.com.huseyinaydin.domain.Product;

/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring Boot Examples
*
**/

public interface ProductService {

    List<Product> listAll();

    Product getById(Long id);

    Product saveOrUpdate(Product product);

    void delete(Long id);

    Product saveOrUpdateProductForm(ProductForm productForm);

    void sendMessage(String id);
}