package Controller;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.*;

@Embeddable
public class MedicineInsurancePK implements Serializable {
	@Column(name = "existingMedicineId")
	private int existingMedicineId;

	@Column(name = "InsuranceId")
	private int InsuranceId;

	MedicineInsurancePK() {
	}
}
