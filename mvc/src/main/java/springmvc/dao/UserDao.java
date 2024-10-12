package springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import springmvc.model.User;

public class UserDao {
	@Autowired
	private HibernateTemplate ht;
	public int saveUser(User user) {
		int id = (Integer)this.ht.save(user);
		return id;
	}
}
