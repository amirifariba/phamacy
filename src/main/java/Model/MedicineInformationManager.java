package Model;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Controller.MedicineInformation;

public class MedicineInformationManager {
	SessionFactory factory = ConfiguratinManagement.getSessionFactory();

	public void deleteStudent(MedicineInformation mdcninf) {

		// creating transaction object
		Transaction tx = null;
		try (Session session = factory.openSession();) {
			tx = session.beginTransaction();
			session.delete(mdcninf);
			tx.commit();
			System.out.println("delete was successful");
		} catch (HibernateException e) {
			tx.rollback();
		}
	}

	public void addMedicineInformation(MedicineInformation mdcninf) {

		Transaction t = null;
		// creating transaction object
		try (Session session = factory.openSession();) {
			t = session.beginTransaction();
			session.save(mdcninf);// persisting the object
			t.commit();// transaction is commited
			System.out.println("successfully saved");
		} catch (HibernateException e) {
			t.rollback();
		}

	}

	public void updateMedicineInformation(MedicineInformation mdcninf) {

		Transaction tx = null;
		try (Session session = factory.openSession();) {
			tx = session.beginTransaction();
			MedicineInformation medicineInformation = new MedicineInformation();
			medicineInformation = session.get(MedicineInformation.class, mdcninf.getMedicineInformationId());
			medicineInformation.copyMedicineInformation(mdcninf);
			session.update(medicineInformation);
			tx.commit();
			System.out.println("update was successful");
		} catch (HibernateException e) {
			tx.rollback();
		}

	}

}
