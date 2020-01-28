package domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(LoanInfo.class)
public abstract class LoanInfo_ {

	public static volatile SingularAttribute<LoanInfo, Double> apportPropre;
	public static volatile SingularAttribute<LoanInfo, Double> revenuMensuel;
	public static volatile SingularAttribute<LoanInfo, Double> prixAcquisition;
	public static volatile SingularAttribute<LoanInfo, Integer> duree;
	public static volatile SingularAttribute<LoanInfo, Long> id;
	public static volatile SingularAttribute<LoanInfo, Double> mensualiteAutre;

}

