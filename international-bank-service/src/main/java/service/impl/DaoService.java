package service.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import domain.CarLoan;
import domain.Loan;
import domain.LoanInfo;
import domain.LoanResult;
import domain.Study;
import domain.User;
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

	@SuppressWarnings("unchecked")
	@Override
	public List<Loan> findAllLoans() {
		return entityManager.createQuery("select l from Loan l").getResultList();
	}

	@Override
	public void addLoanResult(LoanResult loanResult) {
		entityManager.persist(loanResult);

	}

	@Override
	public LoanResult calculateLoanResult(Loan loan, LoanInfo loanInfo) {
		LoanResult loanResult = new LoanResult();
		if (loan instanceof CarLoan) {
			loanResult.setFraisEtudes(10D);
			loanResult.setRemboursementMensuel(loanInfo.getRevenuMensuel() - 100D);
			loanResult.setCapaciteMensuelledeRemboursement(loanInfo.getPrixAcquisition() / 12);
			loanResult.setFinancementSollicite(loanInfo.getPrixAcquisition());
		} else if (loan instanceof Study) {
			loanResult.setFraisEtudes(10D);
			loanResult.setRemboursementMensuel(loanInfo.getRevenuMensuel() - 100D);
			loanResult.setCapaciteMensuelledeRemboursement(loanInfo.getPrixAcquisition() / 12);
			loanResult.setFinancementSollicite(loanInfo.getPrixAcquisition());
		}

		return loanResult;
	}

	@Override
	public User login(String login, String password) {
		User user = null;
		try {
			user = (User) entityManager.createQuery("select u from User u where u.login=:param1 and u.password=:param2")
					.setParameter("param1", login).setParameter("param2", password).getSingleResult();
		} catch (Exception e) {
		}

		return user;
	}

	@Override
	public void addUser(User user) {
		entityManager.persist(user);

	}

}
