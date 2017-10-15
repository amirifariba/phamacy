package examplephamacy;

import java.util.List;

import org.hibernate.*;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class EntityExistingMedicine {
//_________________add Medicine_____________
	public void addMedicine(ExistingMedicine m){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		ExistingMedicine medicine = new ExistingMedicine();
		medicine.setId(m.getId());
		medicine.setName(m.getName());
		medicine.setPrice(m.getPrice());
		System.out.println(medicine.getName());
		session.save(medicine);
		  System.out.println("Inserted Successfully");
		  tx.commit();
		  session.close();
	}
//_____________________read medicine___________________-
 public List<ExistingMedicine> readMedicine(Session session){

	System.out.println("succ12");
	String hql = "FROM ExistingMedicine";
	  Query query = session.createQuery(hql);
	  System.out.println("succ");
	  List results = query.list();
	  System.out.println(results.get(0));
	 
	  return results;
	 
	 
	  
 }

		
 }

