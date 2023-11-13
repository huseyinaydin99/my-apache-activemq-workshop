package tr.com.huseyinaydin.dao.implementation;

import java.util.List;

import org.hibernate.Session;

import tr.com.huseyinaydin.dao.service.ProductsDAO;
import tr.com.huseyinaydin.pojo.Products;

public class ProductsDAOImpl implements ProductsDAO{

	public List<Products> getAllProducts(){
		
		Session session = HibernateConnection.doHibernateConnection().openSession();
		
		List<Products> allProducts = session.createQuery("From Products").list();
		session.close();
		
		return allProducts;
	}
	
	public Products getProductById(Integer id){
		
		Session session = HibernateConnection.doHibernateConnection().openSession();
		
		List<Products> products = session.createQuery("From Products where id = "+id).list();
		session.close();
		if(products != null && products.size() == 1){
			return products.get(0);
		}else{
			return null;
		}
	}
}
