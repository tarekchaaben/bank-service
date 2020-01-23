package domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * Entity implementation class for Entity: CarLoan
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class CarLoan extends Loan implements Serializable {

	private int maxPeriode;
	private Double finPlafond;
	private static final long serialVersionUID = 1L;

	public CarLoan() {
		super();
	}

	public CarLoan(String name, int maxPeriode, Double finPlafond) {
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
