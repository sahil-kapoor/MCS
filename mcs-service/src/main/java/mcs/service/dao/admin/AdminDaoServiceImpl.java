package mcs.service.dao.admin;

import java.sql.Types;

import mcs.rest.dao.pojo.User;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author sahil.kapoor
 *
 */
public class AdminDaoServiceImpl implements AdminDaoService {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Transactional
	public int insertUser(String username, int id) {
		String inserQuery = "insert into test (id, name) values (?, ?) ";
		Object[] params = new Object[] { id, username };
		int[] types = new int[] { Types.INTEGER, Types.VARCHAR };
		return jdbcTemplate.update(inserQuery, params, types);
	}

	public User getUserByUserId(String userId) {
		String sql = "Select name,user_id,designation,role,company,location,email,phone_no from users where user_id=?";
		User user = jdbcTemplate.queryForObject(sql, new Object[] { userId },
				new userRowMpper());
		return user;
	}
}
