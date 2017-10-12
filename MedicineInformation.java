package Controller;

import javax.persistence.*;

@Entity
@Table(name = "medicineinformation")
public class MedicineInformation {
	@Id
	@GeneratedValue
	@Column(name = "MedicineInformationId")
	int medicineInformationId;
	@Column(name = "MedicineName")
	String medicineName;
	@Column(name = "Exist")
	boolean exist;

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

	public MedicineInformation(int medicineInformationId, String medicineName, boolean exist) {
		super();
		this.medicineInformationId = medicineInformationId;
		this.medicineName = medicineName;
		this.exist = exist;
	}

	public MedicineInformation() {
	}
}
