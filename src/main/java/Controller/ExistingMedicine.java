package Controller;

import javax.persistence.*;

@Entity
@Table(name = "existmedicine")
public class ExistingMedicine {
	@Id
	@GeneratedValue
	@Column(name = "ExistMedicineId")
	private int ExistMedicineId;
	@ManyToOne(cascade = CascadeType.ALL)
	private MedicineInformation medicineInformation;
	@Column(name = "Price")
	private int Price;
	@Column(name = "ExpireDate")
	private int ExpireDate;
	public int getExistMedicineId() {
		return ExistMedicineId;
	}
	public void setExistMedicineId(int existMedicineId) {
		ExistMedicineId = existMedicineId;
	}
	public MedicineInformation getMedicineInformation() {
		return medicineInformation;
	}
	public void setMedicineInformation(MedicineInformation medicineInformation) {
		this.medicineInformation = medicineInformation;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public int getExpireDate() {
		return ExpireDate;
	}
	public void setExpireDate(int expireDate) {
		ExpireDate = expireDate;
	}
	
	
	
	
}

