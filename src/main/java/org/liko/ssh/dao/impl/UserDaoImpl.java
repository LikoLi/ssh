package org.liko.ssh.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.liko.ssh.dao.UserDao;
import org.liko.ssh.entity.User;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class UserDaoImpl implements UserDao {
	
	private HibernateTemplate hibernateTemplate;
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void add() {
//		User user = new User();
//		user.setUsername("liko");
//		user.setAddress("保利-天悦");
//		hibernateTemplate.save(user);
		
		//get方法, 根据id查询
//		User user = hibernateTemplate.get(User.class, 1);
//		System.out.println(user);
		
		//find方法查询所有记录
		/*
		 * 第一个参数是hql语句
		 * 第二个参数是value
		 */
//		List<User> list = (List<User>) hibernateTemplate.find("from User");
//		System.out.println(list);
		
		//find方法条件查询
		List<User> list = (List<User>) hibernateTemplate.find("from User u where u.username = ?", "liko");
		System.out.println(list);
		
		/*
		 * DetachedCriteria 分页
		 */
		
	}
	
}
