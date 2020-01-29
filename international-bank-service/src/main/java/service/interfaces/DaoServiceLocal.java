package service.interfaces;

import java.util.List;

import javax.ejb.Local;

import domain.Loan;
import domain.LoanInfo;
import domain.LoanResult;
import domain.User;

@Local
public interface DaoServiceLocal {
	void addLoanInfo(LoanInfo loanInfo);

	void addLoan(Loan loan);

	List<Loan> findAllLoans();

	void addLoanResult(LoanResult loanResult);

	LoanResult calculateLoanResult(Loan loan, LoanInfo loanInfo);

	User login(String login, String password);

	void addUser(User user);

}
