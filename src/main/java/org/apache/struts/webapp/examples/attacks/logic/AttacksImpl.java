package org.apache.struts.webapp.examples.attacks.logic;

import java.util.List;

import org.apache.struts.webapp.examples.attacks.dao.IAccountDao;
import org.apache.struts.webapp.examples.attacks.dao.ICategoryDao;
import org.apache.struts.webapp.examples.attacks.dao.IOrderDao;
import org.apache.struts.webapp.examples.attacks.dao.IProductDao;

public class AttacksImpl implements AttacksExampleFacade {
	private IAccountDao accountDao;
	private ICategoryDao categoryDao;
	private IProductDao productDao;
	private IOrderDao orderDao;

	public void setAccountDao(IAccountDao paramIAccountDao) {
		this.accountDao = paramIAccountDao;
	}

	public void setCategoryDao(ICategoryDao paramICategoryDao) {
		this.categoryDao = paramICategoryDao;
	}

	public void setProductDao(IProductDao paramIProductDao) {
		this.productDao = paramIProductDao;
	}

	public void setOrderDao(IOrderDao paramIOrderDao) {
		this.orderDao = paramIOrderDao;
	}

	public List getUserAccount(String paramString) {
		return this.accountDao.getUserAccount(paramString);
	}

	public List getOrdersByUsername(String paramString) {
		return this.orderDao.getOrdersByUsername(paramString);
	}

	public List getCategoryList() {
		return this.categoryDao.getCategoryList();
	}

	public List getProductListByCategory(String paramString) {
		return this.productDao.getProductListByCategory(paramString);
	}
}