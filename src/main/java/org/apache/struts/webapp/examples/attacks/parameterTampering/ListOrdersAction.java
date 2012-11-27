package org.apache.struts.webapp.examples.attacks.parameterTampering;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.webapp.examples.attacks.BaseAction;

public class ListOrdersAction extends BaseAction {
	public ActionForward execute(ActionMapping paramActionMapping, ActionForm paramActionForm,
			HttpServletRequest paramHttpServletRequest, HttpServletResponse paramHttpServletResponse) throws Exception {

		ListOrdersForm localListOrdersForm = (ListOrdersForm) paramActionForm;
		List localList = getAttacksExampleFacade().getOrdersByUsername(localListOrdersForm.getUsername());
		localListOrdersForm.setOrderList(localList);
		return paramActionMapping.findForward("success");
	}
}