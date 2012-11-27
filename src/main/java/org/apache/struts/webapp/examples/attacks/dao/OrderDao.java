package org.apache.struts.webapp.examples.attacks.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.webapp.examples.attacks.bean.Order;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;

public class OrderDao implements IOrderDao {
	private Log log = LogFactory.getLog(AccountDao.class);
	private JdbcTemplate jdbcTemplate;

	public List getOrdersByUsername(String paramString)  {
		String str = "select * from orders where userid='" + paramString + "'";
		if (this.log.isInfoEnabled())
			this.log.info("sql:" + str);
		RowMapper local1 = new RowMapper() {
			public Object mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
				Order localOrder = new Order();
				localOrder.setOrderId(paramResultSet.getInt("orderid"));
				localOrder.setUsername(paramResultSet.getString("userId"));
				localOrder.setOrderDate(paramResultSet.getDate("orderdate"));
				localOrder.setShipAddress1(paramResultSet.getString("shipaddr1"));
				localOrder.setShipAddress2(paramResultSet.getString("shipaddr2"));
				localOrder.setShipCity(paramResultSet.getString("shipcity"));
				localOrder.setShipState(paramResultSet.getString("shipstate"));
				localOrder.setShipZip(paramResultSet.getString("shipzip"));
				localOrder.setShipCountry(paramResultSet.getString("shipcountry"));
				localOrder.setCreditCard(paramResultSet.getString("creditcard"));
				localOrder.setExpiryDate(paramResultSet.getString("exprdate"));
				localOrder.setCardType(paramResultSet.getString("cardtype"));
				return localOrder;
			}
		};
		return (List) this.jdbcTemplate.query(str, new RowMapperResultSetExtractor(local1));
	}

	public void setJdbcTemplate(JdbcTemplate paramJdbcTemplate) {
		this.jdbcTemplate = paramJdbcTemplate;
	}
}