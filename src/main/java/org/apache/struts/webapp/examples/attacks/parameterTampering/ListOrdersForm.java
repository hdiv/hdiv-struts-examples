package org.apache.struts.webapp.examples.attacks.parameterTampering;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class ListOrdersForm extends ActionForm {
	private List orderList;
	private String username;

	public void reset(ActionMapping paramActionMapping, HttpServletRequest paramHttpServletRequest) {
		this.username = null;
		this.orderList = null;
	}

	public ActionErrors validate(ActionMapping paramActionMapping, HttpServletRequest paramHttpServletRequest) {
		ActionErrors localActionErrors = new ActionErrors();
		return localActionErrors;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String paramString) {
		this.username = paramString;
	}

	public List getOrderList() {
		return this.orderList;
	}

	public void setOrderList(List paramList) {
		this.orderList = paramList;
	}
}