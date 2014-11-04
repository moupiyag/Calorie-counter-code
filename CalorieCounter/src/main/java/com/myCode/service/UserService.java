package com.myCode.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.myCode.entity.Users;

@Service
public class UserService implements UserDetailsService{

	
	private MongoTemplate mongoTemplate;
	private MongoOperations mongoOps;

	public MongoTemplate getMongoTemplate() {
		return mongoTemplate;
	}

	@Autowired
	public void setMongoTemplate(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
		this.mongoOps = (MongoOperations)mongoTemplate;
	}

	public void newUser(Users user) {
		System.out.println(user.getFirstName());
		System.out.println(user.getLastName());

		if (mongoOps == null)
			System.out.println("mongoOp is null");
		else 
		{
			mongoOps.insert(user);
		}
	}
	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
	{
		Users user = getUserDetails(username);
		System.out.println(username);
		User userdetail = new User(user.getUsername(),user.getPassword(),true,true,true,true,getAuthorities(user.getRole()));
		return userdetail;
	}
	
	private Users getUserDetails(String username)
	{
		Users user = mongoOps.findOne(new Query(Criteria.where("username").is(username)),Users.class );
		System.out.println(user);
		return user;
	}
	
	private List<GrantedAuthority> getAuthorities(Integer role)
	{
		List<GrantedAuthority> authList = new ArrayList<GrantedAuthority>();
		if(role.intValue()==1){
			authList.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
			authList.add(new SimpleGrantedAuthority("ROLE_USER"));
		}
		else if(role.intValue()==2)
			authList.add(new SimpleGrantedAuthority("ROLE_USER"));
		
		return authList;
	}
	
}
