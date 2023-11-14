package tr.com.huseyinaydin.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

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
public class ProductFormToProduct implements Converter<ProductForm, Product> {

    @Override
    public Product convert(ProductForm productForm) {
        Product product = new Product();
        if (productForm.getId() != null  && !StringUtils.isEmpty(productForm.getId())) {
            product.setId(new Long(productForm.getId()));
        }
        product.setDescription(productForm.getDescription());
        product.setPrice(productForm.getPrice());
        product.setImageUrl(productForm.getImageUrl());
        return product;
    }
}