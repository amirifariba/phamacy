package examplephamacy;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.*;

@Embeddable
public class MedicineId implements Serializable{
	private UUID id;
	protected MedicineId(){}
	protected MedicineId(UUID id) {
		super();
		this.id = id;
	}
	public UUID getId() {
	    return id;
	  }
	

}
