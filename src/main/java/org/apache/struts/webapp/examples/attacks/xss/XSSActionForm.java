package org.apache.struts.webapp.examples.attacks.xss;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class XSSActionForm extends ActionForm {
	private String message = null;

	public void reset(ActionMapping paramActionMapping, HttpServletRequest paramHttpServletRequest) {
		this.message = null;
	}

	public ActionErrors validate(ActionMapping paramActionMapping, HttpServletRequest paramHttpServletRequest) {
		ActionErrors localActionErrors = new ActionErrors();
		return localActionErrors;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String paramString) {
		this.message = paramString;
	}
}