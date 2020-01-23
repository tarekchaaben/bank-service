package domain;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Loan
 *
 */
@Entity

public class Loan implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private static final long serialVersionUID = 1L;

	public Loan() {
		super();
	}   
	
	public Loan(String name) {
		super();
		this.name = name;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
   
}
