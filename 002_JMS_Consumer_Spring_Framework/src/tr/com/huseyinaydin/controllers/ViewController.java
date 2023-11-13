package tr.com.huseyinaydin.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tr.com.huseyinaydin.dao.registery.DAORegistery;
import tr.com.huseyinaydin.pojo.Products;

@Controller
public class ViewController {

	@RequestMapping(value="/Products", method=RequestMethod.GET)
	public String products(HttpServletRequest request, HttpServletResponse response,
			ModelMap map){
		List<Products> products = null;
		try{
			products = DAORegistery.getProductsDAO().getAllProducts();
			map.put("products", products);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "page-products";
	}
	
	@RequestMapping(value="/ViewProduct", method=RequestMethod.GET)
	public String viewProduct(HttpServletRequest request, HttpServletResponse response,
			ModelMap map){
		String productIdStr = request.getParameter("productId");
		try{
			Integer productId = Integer.parseInt(productIdStr);
			Products product = DAORegistery.getProductsDAO().getProductById(productId);
			map.put("product", product);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "page-view-product";
	}	
}
