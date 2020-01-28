package domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(LoanResult.class)
public abstract class LoanResult_ {

	public static volatile SingularAttribute<LoanResult, Double> FinancementSollicite;
	public static volatile SingularAttribute<LoanResult, Double> remboursementMensuel;
	public static volatile SingularAttribute<LoanResult, Double> fraisEtudes;
	public static volatile SingularAttribute<LoanResult, Long> id;
	public static volatile SingularAttribute<LoanResult, Double> capaciteMensuelledeRemboursement;

}

