package org.apache.struts.webapp.examples.attacks.logic;

import java.util.List;

public interface AttacksExampleFacade {
	List getUserAccount(String paramString);

	List getOrdersByUsername(String paramString);

	List getCategoryList();

	List getProductListByCategory(String paramString);
}