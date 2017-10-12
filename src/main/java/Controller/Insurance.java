package examplephamacy;

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
@Table(name="Insurance")
public class Insurance {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name = "Insurance_id")
	private int id;
@Column(name="name")
	private String name;
@OneToMany(targetEntity=InsuranceMedicine.class,mappedBy = "insurance",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
private Set<InsuranceMedicine> insurance = new HashSet<InsuranceMedicine>();
	
	public Insurance() {
		super();
	}

	public Insurance(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<InsuranceMedicine> getInsurance() {
		return insurance;
	}

	public void setInsurance(Set<InsuranceMedicine> insurance) {
		this.insurance = insurance;
	}
 
}
