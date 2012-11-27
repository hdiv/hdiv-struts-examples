package org.apache.struts.webapp.examples.attacks.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.webapp.examples.attacks.bean.Category;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;

public class CategoryDao implements ICategoryDao {
	private Log log = LogFactory.getLog(CategoryDao.class);
	private JdbcTemplate jdbcTemplate;

	public List getCategoryList() {
		String str = "select * from category";
		RowMapper local1 = new RowMapper() {
			public Object mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
				Category localCategory = new Category();
				localCategory.setCategoryId(paramResultSet.getString("catid"));
				localCategory.setName(paramResultSet.getString("name"));
				localCategory.setDescription(paramResultSet.getString("descn"));
				return localCategory;
			}
		};
		return (List) this.jdbcTemplate.query(str, new RowMapperResultSetExtractor(local1));
	}

	public void setJdbcTemplate(JdbcTemplate paramJdbcTemplate) {
		this.jdbcTemplate = paramJdbcTemplate;
	}
}