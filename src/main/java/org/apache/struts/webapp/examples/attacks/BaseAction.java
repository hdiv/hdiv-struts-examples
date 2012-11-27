package org.apache.struts.webapp.examples.attacks;

import javax.servlet.ServletContext;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionServlet;
import org.apache.struts.webapp.examples.attacks.logic.AttacksExampleFacade;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public abstract class BaseAction extends Action {
	private AttacksExampleFacade attacksExampleFacade;

	public void setServlet(ActionServlet paramActionServlet) {
		super.setServlet(paramActionServlet);
		if (paramActionServlet == null)
			return;
		ServletContext localServletContext = paramActionServlet.getServletContext();
		WebApplicationContext localWebApplicationContext = WebApplicationContextUtils
				.getRequiredWebApplicationContext(localServletContext);
		this.attacksExampleFacade = ((AttacksExampleFacade) localWebApplicationContext.getBean("attacksExample"));
	}

	protected AttacksExampleFacade getAttacksExampleFacade() {
		return this.attacksExampleFacade;
	}
}