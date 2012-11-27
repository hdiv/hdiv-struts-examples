package org.apache.struts.webapp.examples.attacks.SQLInjection;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class SimpleSQLNumericInjectionActionForm extends ActionForm {
	private List products;
	private String category;

	public void reset(ActionMapping paramActionMapping, HttpServletRequest paramHttpServletRequest) {
		this.products = null;
		this.products = null;
	}

	public ActionErrors validate(ActionMapping paramActionMapping, HttpServletRequest paramHttpServletRequest) {
		ActionErrors localActionErrors = new ActionErrors();
		return localActionErrors;
	}

	public List getProducts() {
		return this.products;
	}

	public void setProducts(List paramList) {
		this.products = paramList;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String paramString) {
		this.category = paramString;
	}
}