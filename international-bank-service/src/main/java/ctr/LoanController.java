package ctr;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import domain.Loan;
import domain.LoanInfo;
import domain.LoanResult;
import service.interfaces.DaoServiceLocal;

@ManagedBean
@SessionScoped
public class LoanController {
	private LoanInfo loanInfo = new LoanInfo();
	private Loan loan = new Loan();
	private Loan loanSelected = new Loan();
	private List<Loan> loans = new ArrayList<>();
	private boolean showForm = false;
	private LoanResult loanResult = new LoanResult();
	@EJB
	private DaoServiceLocal daoServiceLocal;

	public void doShowForm() {
		showForm = true;
	}

	public String doReturn() {
		showForm = false;
		loanInfo = new LoanInfo();
		return "/pages/loanPage?faces-redirect=true";
	}

	public String doGoToResultPage() {
		loanResult = daoServiceLocal.calculateLoanResult(loanSelected, loanInfo);
		return "/pages/resultPage?faces-redirect=true";
	}

	public Loan getLoan() {
		return loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}

	public List<Loan> getLoans() {
		loans = daoServiceLocal.findAllLoans();
		return loans;
	}

	public void setLoans(List<Loan> loans) {
		this.loans = loans;
	}

	public Loan getLoanSelected() {
		return loanSelected;
	}

	public void setLoanSelected(Loan loanSelected) {
		this.loanSelected = loanSelected;
	}

	public boolean isShowForm() {
		return showForm;
	}

	public void setShowForm(boolean showForm) {
		this.showForm = showForm;
	}

	public LoanInfo getLoanInfo() {
		return loanInfo;
	}

	public void setLoanInfo(LoanInfo loanInfo) {
		this.loanInfo = loanInfo;
	}

	public LoanResult getLoanResult() {
		return loanResult;
	}

	public void setLoanResult(LoanResult loanResult) {
		this.loanResult = loanResult;
	}

}
