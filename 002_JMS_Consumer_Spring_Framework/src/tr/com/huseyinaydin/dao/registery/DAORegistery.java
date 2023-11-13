package tr.com.huseyinaydin.dao.registery;

import tr.com.huseyinaydin.dao.implementation.ProductsDAOImpl;
import tr.com.huseyinaydin.dao.implementation.UserDAOImpl;
import tr.com.huseyinaydin.dao.service.ProductsDAO;
import tr.com.huseyinaydin.dao.service.UserDAO;

public class DAORegistery {

	public static ProductsDAO productsDAO;
	public static UserDAO userDAO;
	
	static{
		userDAO = new UserDAOImpl();
		productsDAO = new ProductsDAOImpl();
	}

	public static ProductsDAO getProductsDAO() {
		return productsDAO;
	}

	public static void setProductsDAO(ProductsDAO productsDAO) {
		DAORegistery.productsDAO = productsDAO;
	}

	public static UserDAO getUserDAO() {
		return userDAO;
	}

	public static void setUserDAO(UserDAO userDAO) {
		DAORegistery.userDAO = userDAO;
	}
	
}
