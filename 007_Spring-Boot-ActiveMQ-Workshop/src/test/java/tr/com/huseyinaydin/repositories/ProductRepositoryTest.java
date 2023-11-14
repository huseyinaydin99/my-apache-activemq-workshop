package tr.com.huseyinaydin.repositories;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import tr.com.huseyinaydin.domain.Product;
import tr.com.huseyinaydin.repositories.ProductRepository;

import java.math.BigDecimal;

/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring Boot Examples
*
**/

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ProductRepositoryTest {

    private static final BigDecimal BIG_DECIMAL_100 = BigDecimal.valueOf(100.00);
    private static final String PRODUCT_DESCRIPTION = "Güzel bir üründür.";
    private static final String IMAGE_URL = "http://resimlisite.net/xxx.jpg";

    @Autowired
    private ProductRepository productRepository;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testPersistence() {
        //given
        Product product = new Product();
        product.setDescription(PRODUCT_DESCRIPTION);
        product.setImageUrl(IMAGE_URL);
        product.setPrice(BIG_DECIMAL_100);

        //when
        productRepository.save(product);

        //then
        Assert.assertNotNull(product.getId());
        Product newProduct = productRepository.findById(product.getId()).orElse(null);
        Assert.assertEquals((Long) 1L, newProduct.getId());
        Assert.assertEquals(PRODUCT_DESCRIPTION, newProduct.getDescription());
        Assert.assertEquals(BIG_DECIMAL_100.compareTo(newProduct.getPrice()), 0);
        Assert.assertEquals(IMAGE_URL, newProduct.getImageUrl());
    }
}