package examplephamacy;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "existmedicine")
public class ExistingMedicine {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name = "medicine_id")
	private int id;
@Column(name = "name")
	private String name;
@Column(name="price")
	private double price;
@OneToMany(targetEntity=InsuranceMedicine.class,mappedBy = "existingMedicine",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<InsuranceMedicine> medicine = new HashSet<InsuranceMedicine>();
public ExistingMedicine() {
	super();
}
public ExistingMedicine(int id, String name, double price) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
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
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public Set<InsuranceMedicine> getMedicine() {
	return medicine;
}
public void setMedicine(Set<InsuranceMedicine> medicine) {
	this.medicine = medicine;
}



}

