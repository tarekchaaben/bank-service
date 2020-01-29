package ctr;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import domain.User;
import service.interfaces.DaoServiceLocal;

@ManagedBean
@SessionScoped
public class Identity {
	@EJB
	private DaoServiceLocal daoServiceLocal;
	private User user = new User();
	private boolean isLogged = false;

	public String logout() {
		isLogged = false;
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		return "/login?faces-redirect=true";
	}
	public String doLogin() {
		String navigateTo = "";
		User userLoggedIn = daoServiceLocal.login(user.getLogin(), user.getPassword());
		if (userLoggedIn != null) {
			isLogged = true;
			user = userLoggedIn;
			navigateTo = "/pages/loanPage?faces-redirect=true";
		} else {
			System.err.println("not");
		}
		return navigateTo;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
	public boolean isLogged() {
		return isLogged;
	}

	public void setLogged(boolean isLogged) {
		this.isLogged = isLogged;
	}
}
