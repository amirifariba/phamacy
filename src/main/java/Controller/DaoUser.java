package examplephamacy;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DaoUser {
//____________________reporting  existing Medicine____________________
   
	public List<ExistingMedicine> reportMedicine(){
		EntityExistingMedicine med = new EntityExistingMedicine();
		 Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();
		List<ExistingMedicine> medicines = med.readMedicine(session);
		 tx.commit();
		  //session.close();
		System.out.println(medicines.size());
		System.out.println(medicines.get(0).getName());
		 for(ExistingMedicine medicine :  medicines){
				System.out.println("idMedicine: "+medicine.getId()+", Medicine Name: "+medicine.getName()+", price: "+medicine.getMedicine());
				  }
		 session.close();
		 return medicines;
		
	}
//______________________add Medicines_____________________________
	public void addMedicine(ExistingMedicine medicine){
		EntityExistingMedicine med = new EntityExistingMedicine();
		med.addMedicine(medicine);
	}
//_______________________________check user________________________
	
	
	
	
	
	
	
	
	
//_____________________________is_ manager______________
	public boolean is_manager(String username,String password){
		boolean flage = false;
		//User user = new User();
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		String hql = "FROM User";
		  Query query = session.createQuery(hql);
		  System.out.println("succ");
		  List<User> results = query.list();
		  tx.commit();
		  for(User user:results){
			  if(user.getPassword().equals(password) && user.getUsername().equals(username)){
				  if(user.getUserId()==1){
					  flage = true;
				  }
				 
			  }
			  
		  }
		  session.close();
return flage;		
	}
//______________________________________total cost of insurance____________________
	   
	
//______________________________________add insurance precentage_____________________________
	 public void InsertInsurancePrecent( ExistingMedicine drug,Insurance insurance,int precentage){
		 EntityInsuranceMedicine ins_med = new EntityInsuranceMedicine();
		 ins_med.addPrecentage(drug, insurance, precentage);
	 }
//__________________________________ add insurance___________________________
	 
	  public void InsertInsurance(Insurance insurance){
		  EntityInsurance entityInsurance = new EntityInsurance();
		  entityInsurance.addInsurance(insurance);
		  
	  }
//______________________________	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
