package tr.com.huseyinaydin.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import tr.com.huseyinaydin.dao.registery.DAORegistery;
import tr.com.huseyinaydin.pojo.User;

public class UserDetailsServiceImpl implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		System.out.println(username);
		User user = DAORegistery.getUserDAO().getUserByUsername(username);
		if(user == null){
			return null;
		}
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority(user.getRole()));
		
		UserDetails userDetails = new org.springframework.security.core.userdetails.
				User(user.getUsername(), user.getPassword(), true, true, true, true, authorities);	
		return userDetails;
	}
}