package utilities;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import domain.CarLoan;
import domain.LoanInfo;
import domain.Study;
import domain.User;
import service.interfaces.DaoServiceLocal;

/**
 * Session Bean implementation class DbInitialisator
 */
@Singleton
@Startup
public class DbInitialisator {
	@EJB
	private DaoServiceLocal daoServiceLocal;

	/**
	 * Default constructor.
	 */
	public DbInitialisator() {
		// TODO Auto-generated constructor stub
	}

	@PostConstruct
	public void init() {
		LoanInfo loanInfo = new LoanInfo(10000D, 100D, 10D, 10, 20D);
		LoanInfo loanInfo2 = new LoanInfo(10000D, 100D, 10D, 10, 20D);
		
		Study study=new Study("9raity", 3, 20000D);
		Study study2=new Study("jamaity", 5, 50000D);
		Study study3=new Study("mosta9bli", 10, 200000D);
		
		CarLoan carLoan=new CarLoan("chaabia", 5, 40000D);
		CarLoan carLoan2=new CarLoan("luxe", 10, 80000D);
		
		User user=new User("mohamed", "m", "m");
		User user2=new User("Samia", "s", "s");
		User user3=new User("Ali", "a", "a");
		
		daoServiceLocal.addLoan(study);
		daoServiceLocal.addLoan(study2);
		daoServiceLocal.addLoan(study3);
		
		daoServiceLocal.addLoan(carLoan);
		daoServiceLocal.addLoan(carLoan2);

		daoServiceLocal.addLoanInfo(loanInfo);
		daoServiceLocal.addLoanInfo(loanInfo2);
		
		daoServiceLocal.addUser(user);
		daoServiceLocal.addUser(user2);
		daoServiceLocal.addUser(user3);

	}

}
