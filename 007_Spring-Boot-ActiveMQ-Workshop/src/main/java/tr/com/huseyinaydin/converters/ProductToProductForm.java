package tr.com.huseyinaydin.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import tr.com.huseyinaydin.commands.ProductForm;
import tr.com.huseyinaydin.domain.Product;

/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring Boot Examples
*
**/

@Component
public class ProductToProductForm implements Converter<Product, ProductForm> {
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