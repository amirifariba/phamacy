package Controller;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "insurance_medicine")
public class InsuranceMedicine implements Serializable {
	@EmbeddedId
	private MedicineInsurancePK insuranceMedicineId;

	@ManyToOne
	@MapsId("InsuranceId")
	@JoinColumn(name = "InsuranceId", insertable = false, updatable = false)
	private Insurance insurance;

	@ManyToOne
	@MapsId("existingMedicineId")
	@JoinColumn(name = "existingMedicineId", insertable = false, updatable = false)
	private ExistingMedicine existingMedicine;

	@Column(name = "insurancePercent")
	private int insurancePercent;

	public MedicineInsurancePK getInsuranceMedicineId() {
		return insuranceMedicineId;
	}

	public void setInsuranceMedicineId(MedicineInsurancePK insuranceMedicineId) {
		this.insuranceMedicineId = insuranceMedicineId;
	}

	public Insurance getInsurance() {
		return insurance;
	}

	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}

	public ExistingMedicine getExistingMedicine() {
		return existingMedicine;
	}

	public void setExistingMedicine(ExistingMedicine existingMedicine) {
		this.existingMedicine = existingMedicine;
	}

	public int getInsurancePercent() {
		return insurancePercent;
	}

	public void setInsurancePercent(int insurancePercent) {
		this.insurancePercent = insurancePercent;
	}

	public InsuranceMedicine(MedicineInsurancePK insuranceMedicineId, Insurance insurance,
			ExistingMedicine existingMedicine, int insurancePercent) {
		this.insuranceMedicineId = insuranceMedicineId;
		this.insurance = insurance;
		this.existingMedicine = existingMedicine;
		this.insurancePercent = insurancePercent;
	}

	InsuranceMedicine() {
	}
}
