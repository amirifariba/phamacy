package Controller;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Transcript")
public class Transcript {

	@Id
	@GeneratedValue
	@Column(name = "transcriptId")
	private int patientId;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	private ExistingMedicine existingMedicine;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Patient patient;
	
	@Column(name = "count")
	private int count;
	
	@Column(name = "price")
	private int price;
	
	@Column(name = "date")
	private String date;
	
}
