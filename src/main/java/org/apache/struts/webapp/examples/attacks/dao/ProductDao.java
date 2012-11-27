package org.apache.struts.webapp.examples.attacks.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.webapp.examples.attacks.bean.Product;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;

public class ProductDao implements IProductDao {
	private Log log = LogFactory.getLog(ProductDao.class);
	private JdbcTemplate jdbcTemplate;

	public List getProductListByCategory(String paramString) {
		String str = "select * from product where category='" + paramString + "'";
		if (this.log.isInfoEnabled())
			this.log.info("sql:" + str);
		RowMapper local1 = new RowMapper() {
			public Object mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
				Product localProduct = new Product();
				localProduct.setProductId(paramResultSet.getString("productId"));
				localProduct.setName(paramResultSet.getString("name"));
				localProduct.setDescription(paramResultSet.getString("descn"));
				localProduct.setCategoryId(paramResultSet.getString("category"));
				return localProduct;
			}
		};
		return (List) this.jdbcTemplate.query(str, new RowMapperResultSetExtractor(local1));
	}

	public void setJdbcTemplate(JdbcTemplate paramJdbcTemplate) {
		this.jdbcTemplate = paramJdbcTemplate;
	}
}