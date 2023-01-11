package com.hibernate.operation.crud.Users;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.hibernate.operation.crud.UsersDao.Users;
import com.hibernate.operation.crud.UsersUtil.UsersUtility;
public class operation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //Adding User Information To Database
		//Users users = new Users();
		//users.setId(1002);
		//users.setName("Satyam");
		//users.setState("Bangalore");
		//System.out.println(users);
		SessionFactory sessionFactory = UsersUtility.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transact = session.beginTransaction();
		/* to display users
		Query query = session.createQuery("from Users");
	 
		@SuppressWarnings("rawtypes")
		java.util.Iterator trav =query.iterate();
		while(trav.hasNext()) {
			Users u  = (Users)trav.next();
			System.out.println("------------------------------");
			System.out.println("ID : "+u.getId());
			System.out.println("Name : "+u.getName());
			System.out.println("State : "+u.getState());
		} */
		/*update user
		Users user = (Users)session.get(Users.class, 1001);
		user.setState("Kolkata");
		session.save(user);*/
		/*
		Users user = (Users)session.load(Users.class, 1002);
		session.delete(user);
		System.out.println("Data Deleted Successfully..");
		//System.out.println("Data Updated Successfully..");
		//System.out.println("Data Displayed Successfully..");
		//System.out.println("Data Saved Successfully..");*/
		transact.commit();
		session.close();
		sessionFactory.close();
	}

}
