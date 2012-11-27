package org.apache.struts.webapp.examples.attacks.dao;

import java.sql.SQLException;
import java.util.List;

public interface IProductDao {
	List getProductListByCategory(String paramString) ;
}