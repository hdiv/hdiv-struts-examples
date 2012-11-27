package org.apache.struts.webapp.examples.attacks.SQLInjection;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class SimpleSQLStringInjectionActionForm extends ActionForm {
	private List userAccounts;

	public void reset(ActionMapping paramActionMapping, HttpServletRequest paramHttpServletRequest) {
		this.userAccounts = null;
	}

	public ActionErrors validate(ActionMapping paramActionMapping, HttpServletRequest paramHttpServletRequest) {
		ActionErrors localActionErrors = new ActionErrors();
		return localActionErrors;
	}

	public List getUserAccounts() {
		return this.userAccounts;
	}

	public void setUserAccount(List paramList) {
		this.userAccounts = paramList;
	}
}