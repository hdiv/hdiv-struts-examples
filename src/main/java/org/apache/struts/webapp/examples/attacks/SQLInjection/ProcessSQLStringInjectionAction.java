package org.apache.struts.webapp.examples.attacks.SQLInjection;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.webapp.examples.attacks.BaseAction;

public class ProcessSQLStringInjectionAction extends BaseAction {
	public ActionForward execute(ActionMapping paramActionMapping, ActionForm paramActionForm,
			HttpServletRequest paramHttpServletRequest, HttpServletResponse paramHttpServletResponse) throws Exception {

		SimpleSQLStringInjectionActionForm localSimpleSQLStringInjectionActionForm = (SimpleSQLStringInjectionActionForm) paramActionForm;
		String str = paramHttpServletRequest.getParameter("account");
		try {
			List localList = getAttacksExampleFacade().getUserAccount(str);
			localSimpleSQLStringInjectionActionForm.setUserAccount(localList);
		} catch (Exception localSQLException) {
			paramHttpServletRequest.setAttribute("sqlMessage", localSQLException.getMessage());
		}
		return paramActionMapping.findForward("success");
	}
}