package examplephamacy;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class EntityInsuranceMedicine {
	 
//___________________add Insurance percentage___________________
	 public void addPrecentage(ExistingMedicine medicine,Insurance insurance,int precentage){
		 Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();
			
			InsuranceMedicine  precent = new InsuranceMedicine(medicine,insurance,precentage);
			session.save(precent);
			tx.commit();
			session.close();
			
	 }
//_______________________update______________________________
	 public void update(int id,ExistingMedicine medicine,Insurance insurance,int precentage){
		 Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();
			String hql = "UPDATE InsuranceMedicine set fk_insurance = :fk_insurance , set fk_medicine=:fk_medicine " + 
		             "WHERE id = :id";
		Query query = session.createQuery(hql);
		query.setParameter("fk_insurance", insurance.getId());
		query.setParameter("fk_medicine", medicine.getId());
		query.setParameter("id", id);
		int result = query.executeUpdate();
		System.out.println("Rows affected: " + result);
		tx.commit();
		session.close();
	 }
//__________________________________delete Insurance percentage___________________
	  public void delete(int id){
		  Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();
			String hql = "DELETE FROM InsuranceMedicine "  + 
		             "WHERE id = :id";
		Query query = session.createQuery(hql);
		query.setParameter("id", id);
		int result = query.executeUpdate();
		System.out.println("Rows affected: " + result);
		tx.commit();
		session.close();
	  }
//_________________________show insurane percentage___________________________
	   public List<InsuranceMedicine> show(Session session){
		   String hql = "FROM Employee E";
		   Query query = session.createQuery(hql);
		   List results = query.list();
		   return results;
	   }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

}
