package Controller;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Insurance")
public class Insurance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "InsuranceId")
	private int insuranceId;

	@Column(name = "InsuranceName")
	private String insuranceName;

	@OneToMany(targetEntity = InsuranceMedicine.class, mappedBy = "insurance", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<InsuranceMedicine> insuranceMedicines = new HashSet<InsuranceMedicine>();

	public int getInsuranceId() {
		return insuranceId;
	}

	public void setInsuranceId(int insuranceId) {
		this.insuranceId = insuranceId;
	}

	public String getInsuranceName() {
		return insuranceName;
	}

	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public Insurance() {
	}

	public Insurance(int id, String name) {
		this.insuranceId = id;
		this.insuranceName = name;
	}

	public Set<InsuranceMedicine> getInsuranceMedicines() {
		return insuranceMedicines;
	}

	public void setInsuranceMedicines(Set<InsuranceMedicine> insuranceMedicines) {
		this.insuranceMedicines.addAll(insuranceMedicines);
	}

	public void copyInsurance(Insurance insurance) {
		this.insuranceId = insurance.insuranceId;
		this.insuranceName = insurance.insuranceName;
		this.setInsuranceMedicines(insurance.insuranceMedicines);

	}

}
