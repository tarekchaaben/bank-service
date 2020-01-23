package domain;

import domain.Loan;
import java.io.Serializable;
import java.lang.Double;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Study
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Study extends Loan implements Serializable {

	
	private int maxPeriode;
	private Double finPlafond;
	private static final long serialVersionUID = 1L;

	public Study() {
		super();
	}  
	
	public Study(String name, int maxPeriode, Double finPlafond) {
		super(name);
		this.maxPeriode = maxPeriode;
		this.finPlafond = finPlafond;
	}

	public int getMaxPeriode() {
		return this.maxPeriode;
	}

	public void setMaxPeriode(int maxPeriode) {
		this.maxPeriode = maxPeriode;
	}   
	public Double getFinPlafond() {
		return this.finPlafond;
	}

	public void setFinPlafond(Double finPlafond) {
		this.finPlafond = finPlafond;
	}
   
}
