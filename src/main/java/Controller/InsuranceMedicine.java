package examplephamacy;

import javax.persistence.*;

@Entity
@Table(name="insurance_medicine")
public class InsuranceMedicine {
@EmbeddedId
	private MedicineId id;
@ManyToOne
@JoinColumn(name = "fk_insurance", insertable = false, updatable = false)
	private Insurance insurance;
@ManyToOne
@JoinColumn(name = "fk_medicine", insertable = false, updatable = false)
private ExistingMedicine existingMedicine;
@Column(name="insurancePercent")	
	private String insurancePercent;
public InsuranceMedicine() {
	super();
}

public InsuranceMedicine(int id, Insurance insurance, String insurancePercent) {
	super();
	//this.id = id;
	this.insurance = insurance;
	//this.existingMedicine = existingMedicine;
	this.insurancePercent = insurancePercent;
}

//public int getId() {
//	return id;
//}
//public void setId(int id) {
//	this.id = id;
//}
public Insurance getInsurance() {
	return insurance;
}
public MedicineId getId() {
	return id;
}

public void setId(MedicineId id) {
	this.id = id;
}

public void setInsurance(Insurance insurance) {
	this.insurance = insurance;
}
//public ExistingMedicine getExistingMedicine() {
//	return existingMedicine;
//}
//public void setExistingMedicine(ExistingMedicine existingMedicine) {
//	this.existingMedicine = existingMedicine;
//}
public String getInsurancePercent() {
	return insurancePercent;
}
public void setInsurancePercent(String insurancePercent) {
	this.insurancePercent = insurancePercent;
}

	
	
	

}
