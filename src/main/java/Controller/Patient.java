package Controller;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "patient")
public class Patient {
	
	@Id
	@GeneratedValue
	@Column(name = "PatientId")
	private int PatientId;

	@Column(name = "PatientName")
	private String PatientName;

	@Column(name = "PatientLastName")
	private String PatientLastName;

	@ManyToOne(cascade = CascadeType.ALL)
	private Insurance insurance;

	public int getPatientId() {
		return PatientId;
	}

	public void setPatientId(int patientId) {
		PatientId = patientId;
	}

	public String getPatientName() {
		return PatientName;
	}

	public void setPatientName(String patientName) {
		PatientName = patientName;
	}

	public String getPatientLastName() {
		return PatientLastName;
	}

	public void setPatientLastName(String patientLastName) {
		PatientLastName = patientLastName;
	}

	public Insurance getInsurance() {
		return insurance;
	}

	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}

	public Patient(int patientId, String patientName, String patientLastName, Insurance insurance) {
		super();
		PatientId = patientId;
		PatientName = patientName;
		PatientLastName = patientLastName;
		this.insurance = insurance;
	}

	Patient() {
	}
}
