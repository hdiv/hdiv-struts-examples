package org.apache.struts.webapp.examples.attacks.SQLInjection;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.webapp.examples.attacks.BaseAction;

public class ProcessSQLNumericInjectionAction extends BaseAction {
	public ActionForward execute(ActionMapping paramActionMapping, ActionForm paramActionForm,
			HttpServletRequest paramHttpServletRequest, HttpServletResponse paramHttpServletResponse) throws Exception {

		SimpleSQLNumericInjectionActionForm localSimpleSQLNumericInjectionActionForm = (SimpleSQLNumericInjectionActionForm) paramActionForm;
		List localList = getAttacksExampleFacade().getProductListByCategory(
				localSimpleSQLNumericInjectionActionForm.getCategory());
		localSimpleSQLNumericInjectionActionForm.setProducts(localList);
		return paramActionMapping.findForward("success");
	}
}