package tr.com.huseyinaydin.repositories;

import org.springframework.data.repository.CrudRepository;

import tr.com.huseyinaydin.domain.Product;

/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring Boot Examples
*
**/

public interface ProductRepository extends CrudRepository<Product, Long> {
	
}