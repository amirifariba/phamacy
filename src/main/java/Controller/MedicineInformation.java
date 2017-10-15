package Controller;

import javax.persistence.*;

@Entity
@Table(name = "medicineinformation")
public class MedicineInformation {
	@Id
	@GeneratedValue
	@Column(name = "MedicineInformationId")
	private int medicineInformationId;
	@Column(name = "MedicineName")
	private String medicineName;
	@Column(name = "Exist" )
	private boolean exist;

	public int getMedicineInformationId() {
		return medicineInformationId;
	}

	public void setMedicineInformationId(int medicineInformationId) {
		this.medicineInformationId = medicineInformationId;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public boolean isExist() {
		return exist;
	}

	public void setExist(boolean exist) {
		this.exist = exist;
	}

	public void copyMedicineInformation(MedicineInformation mdcn) {
		this.medicineInformationId = mdcn.medicineInformationId;
		this.medicineName = mdcn.medicineName;
		this.exist = mdcn.exist;
	}

	public MedicineInformation(String medicineName, boolean exist) {
		this.medicineName = medicineName;
		this.exist = exist;
	}

	public MedicineInformation() {
	}

}
