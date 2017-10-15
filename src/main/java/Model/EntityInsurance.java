package examplephamacy;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class EntityInsurance {
	 
//________________________add Insurance___________________--
	public void addInsurance(Insurance ins){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Insurance insurance = new Insurance();
		insurance.setId(2);
		insurance.setName(ins.getName());
		session.save(insurance);
		tx.commit();
		session.close();
		
		
	}

}
