package com.myCode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.myCode.entity.Users;

//import com.myCode.dao.MongoCollectionDao;
//import com.myCode.model.ResultPage;

@Service
public class UserService {

	// @Autowired
	// private MongoCollectionDao mongoDao;
	//
	//
	// public String findEntityById(String id) {
	// return mongoDao.findById(id);
	// }
	//
	// public ResultPage<String> findEntitysByFilter(String q, String orders,
	// int pageNumber, int pageSize) {
	// return mongoDao.findByFilter(q, orders, pageNumber, pageSize);
	// }

	// ApplicationContext context =
	// new ClassPathXmlApplicationContext("/WEB-INF/calorie-servlet.xml");
	// //change xml path as you need.
	// MongoTemplate mongoTemplate=context.getBean(MongoTemplate.class);
	private MongoTemplate mongoTemplate;
	private MongoOperations mongoOps;

	public MongoTemplate getMongoTemplate() {
		return mongoTemplate;
	}

	@Autowired
	public void setMongoTemplate(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
		this.mongoOps = mongoTemplate;
	}

	public void newUser() {
		Users user = new Users("Kamelia", "Ghosh");
		System.out.println(user.getFirstName());
		System.out.println(user.getLastName());

		if (mongoOps == null)
			System.out.println("mongoOp is null");
		else 
		{
			mongoOps.insert(user);
		}

	}

}
