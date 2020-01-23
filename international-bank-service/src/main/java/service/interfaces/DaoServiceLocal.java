package service.interfaces;

import javax.ejb.Local;

import domain.Loan;
import domain.LoanInfo;

@Local
public interface DaoServiceLocal {
	void addLoanInfo(LoanInfo loanInfo);

	void addLoan(Loan loan);

}
