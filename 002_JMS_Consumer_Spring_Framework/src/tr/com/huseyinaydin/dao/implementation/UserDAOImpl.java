package tr.com.huseyinaydin.dao.implementation;

import java.util.List;

import org.hibernate.Session;

import tr.com.huseyinaydin.dao.service.UserDAO;
import tr.com.huseyinaydin.pojo.User;

public class UserDAOImpl implements UserDAO {
	
	public User getUserByUsername(String username){
		try{
			Session session = HibernateConnection.doHibernateConnection().openSession();
			List<User> users = session.createQuery("From User where username = :username")
								.setParameter("username", username).list();
			session.close();
			if(users != null && users.size() == 1){
				return users.get(0);
			}else{
				return null;
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
}
