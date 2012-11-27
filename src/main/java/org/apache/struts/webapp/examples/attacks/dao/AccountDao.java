package org.apache.struts.webapp.examples.attacks.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.webapp.examples.attacks.bean.Account;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;

public class AccountDao implements IAccountDao {
	private Log log = LogFactory.getLog(AccountDao.class);
	private JdbcTemplate jdbcTemplate;

	public List getUserAccount(String paramString) {
		String str = "select * from account where userid='" + paramString + "'";
		if (this.log.isInfoEnabled())
			this.log.info("sql:" + str);
		RowMapper local1 = new RowMapper() {
			public Object mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
				Account localAccount = new Account();
				localAccount.setUserId(paramResultSet.getString("userid"));
				localAccount.setFirstName(paramResultSet.getString("firstname"));
				localAccount.setLastName(paramResultSet.getString("lastname"));
				localAccount.setEmail(paramResultSet.getString("email"));
				localAccount.setAddress1(paramResultSet.getString("addr1"));
				localAccount.setAddress2(paramResultSet.getString("addr2"));
				localAccount.setStatus(paramResultSet.getString("status"));
				localAccount.setCity(paramResultSet.getString("city"));
				localAccount.setState(paramResultSet.getString("state"));
				localAccount.setZip(paramResultSet.getString("zip"));
				localAccount.setCountry(paramResultSet.getString("country"));
				localAccount.setPhone(paramResultSet.getString("phone"));
				return localAccount;
			}
		};
		return (List) this.jdbcTemplate.query(str, new RowMapperResultSetExtractor(local1));
	}

	public void setJdbcTemplate(JdbcTemplate paramJdbcTemplate) {
		this.jdbcTemplate = paramJdbcTemplate;
	}
}