package infosys.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import infosys.Configuration.HibernateConfiguration;
import infosys.entity.Address;
import infosys.entity.Employee;

public class Runner 
{

	public static void main(String[] args) 
	{
//		Student Alok = new Student(3,"Ramakant","Male","Delhi");
//		System.out.println("HQL");
		
		
		SessionFactory sf = HibernateConfiguration.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		
		Employee e = new Employee();
		e.setFirstname("Ram");
		e.setLastname("Kumar");
		
		Address add = new Address("LodhiMarg","Delhi");
		e.setAddress(add);
		add.setEmployee(e);
	//	add.setId(4);
		
		session.persist(e);
//		session.persist(add);
		
		
		tx.commit();
		
		
	}

}
