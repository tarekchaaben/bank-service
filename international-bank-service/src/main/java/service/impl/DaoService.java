package service.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import domain.Loan;
import domain.LoanInfo;
import service.interfaces.DaoServiceLocal;

/**
 * Session Bean implementation class DaoService
 */
@Stateless
public class DaoService implements DaoServiceLocal {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public DaoService() {
	}

	@Override
	public void addLoanInfo(LoanInfo loanInfo) {
		entityManager.persist(loanInfo);
	}

	@Override
	public void addLoan(Loan loan) {
		entityManager.persist(loan);

	}

}
