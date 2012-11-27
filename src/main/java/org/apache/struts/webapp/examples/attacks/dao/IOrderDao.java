package org.apache.struts.webapp.examples.attacks.dao;

import java.util.List;

public interface IOrderDao {
	List getOrdersByUsername(String paramString);
}