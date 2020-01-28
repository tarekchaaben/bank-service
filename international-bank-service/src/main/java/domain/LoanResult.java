package domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LoanResult implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3824658509946420863L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Double remboursementMensuel;
	private Double FinancementSollicite;
	private Double fraisEtudes;
	private Double capaciteMensuelledeRemboursement;

	public LoanResult() {
	}

	public LoanResult(Double remboursementMensuel, Double financementSollicite, Double fraisEtudes,
			Double capaciteMensuelledeRemboursement) {
		super();
		this.remboursementMensuel = remboursementMensuel;
		FinancementSollicite = financementSollicite;
		this.fraisEtudes = fraisEtudes;
		this.capaciteMensuelledeRemboursement = capaciteMensuelledeRemboursement;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getRemboursementMensuel() {
		return remboursementMensuel;
	}

	public void setRemboursementMensuel(Double remboursementMensuel) {
		this.remboursementMensuel = remboursementMensuel;
	}

	public Double getFinancementSollicite() {
		return FinancementSollicite;
	}

	public void setFinancementSollicite(Double financementSollicite) {
		FinancementSollicite = financementSollicite;
	}

	public Double getFraisEtudes() {
		return fraisEtudes;
	}

	public void setFraisEtudes(Double fraisEtudes) {
		this.fraisEtudes = fraisEtudes;
	}

	public Double getCapaciteMensuelledeRemboursement() {
		return capaciteMensuelledeRemboursement;
	}

	public void setCapaciteMensuelledeRemboursement(Double capaciteMensuelledeRemboursement) {
		this.capaciteMensuelledeRemboursement = capaciteMensuelledeRemboursement;
	}

}
