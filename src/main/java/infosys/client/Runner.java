package infosys.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import infosys.Configuration.HibernateConfiguration;
import infosys.entity.Student;

public class Runner 
{

	public static void main(String[] args) 
	{
		Student Alok = new Student(2,"Prashant","Male","Delhi");
		SessionFactory sf = HibernateConfiguration.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(Alok);
		tx.commit();
		
		
	}

}
