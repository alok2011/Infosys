package infosys.Configuration;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;





public class HibernateConfiguration 
{
	public static SessionFactory getSessionFactory()
	{
		Properties ps = new Properties();
		
		ps.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
		ps.put(Environment.URL, "jdbc:mysql://localhost:3306/ducat");
		ps.put("hibernate.connection.username", "root")	;
		ps.put(Environment.PASS, "Alok@2001");
		ps.put(Environment.SHOW_SQL, "true");
		ps.put(Environment.HBM2DDL_AUTO, "create");
		ps.put(Environment.FORMAT_SQL, "true");
		
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().applySettings(ps).build();
		MetadataSources meta = new MetadataSources(ssr);
		meta.addAnnotatedClassName("infosys.entity.Student");
		SessionFactory sf = meta.buildMetadata().buildSessionFactory();
		return sf;
		
		
		
	}
	
}
