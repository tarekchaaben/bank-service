package domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: LoanInfo
 *
 */
@Entity

public class LoanInfo implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Double prixAcquisition;
	private Double apportPropre;
	private Double revenuMensuel;
	private int duree;
	private Double mensualiteAutre;
	private static final long serialVersionUID = 1L;

	public LoanInfo() {
		super();
	}

	public LoanInfo(Double prixAcquisition, Double apportPropre, Double revenuMensuel, int duree,
			Double mensualiteAutre) {
		super();
		this.prixAcquisition = prixAcquisition;
		this.apportPropre = apportPropre;
		this.revenuMensuel = revenuMensuel;
		this.duree = duree;
		this.mensualiteAutre = mensualiteAutre;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getPrixAcquisition() {
		return this.prixAcquisition;
	}

	public void setPrixAcquisition(Double prixAcquisition) {
		this.prixAcquisition = prixAcquisition;
	}

	public Double getApportPropre() {
		return this.apportPropre;
	}

	public void setApportPropre(Double apportPropre) {
		this.apportPropre = apportPropre;
	}

	public Double getRevenuMensuel() {
		return this.revenuMensuel;
	}

	public void setRevenuMensuel(Double revenuMensuel) {
		this.revenuMensuel = revenuMensuel;
	}

	public int getDuree() {
		return this.duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public Double getMensualiteAutre() {
		return this.mensualiteAutre;
	}

	public void setMensualiteAutre(Double mensualiteAutre) {
		this.mensualiteAutre = mensualiteAutre;
	}

}
