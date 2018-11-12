package a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GroupDao extends AbstractDao {

	private static final String LOAD_ALL_QUERY = "SELECT * FROM user_group;";
	private static final String LOAD_BY_ID_QUERY = "SELECT * FROM user_group WHERE id=?;";
	private static final String CREATE_QUERY = "INSERT INTO user_group(name) VALUES(?);";
	private static final String UPDATE_QUERY = "UPDATE user_group SET name=? WHERE id=?;";
	private static final String DELETE_QUERY = "DELETE FROM user_group WHERE id=?;";

	@Override
	protected PreparedStatement saveNewStatement(Connection con, Model group) throws SQLException {
		String[] generatedColumns = { "id" };
		PreparedStatement ps = con.prepareStatement(CREATE_QUERY, generatedColumns);
		ps.setString(1, ((Group) group).getName());
		return ps;

	}

	@Override
	protected PreparedStatement updateExistingStatement(Connection con, Model group) throws SQLException {
		PreparedStatement ps = con.prepareStatement(UPDATE_QUERY);
		ps.setString(1, ((Group) group).getName());
		ps.setLong(2, group.getId());
		return ps;
	}

	@Override
	protected PreparedStatement deleteStatement(Connection con, Model group) throws SQLException {
		PreparedStatement ps = con.prepareStatement(DELETE_QUERY);
		ps.setLong(1, group.getId());
		return ps;

	}

	@Override
	protected Model newFromResultSet(ResultSet rs) throws SQLException {
		return new Group(rs.getLong("id"), rs.getString("name"));
	}

	@Override
	protected String getLoadAllQuery() {
		return LOAD_ALL_QUERY;
	}

	@Override
	protected String getLoadByIdQuery() {
		return LOAD_BY_ID_QUERY;
	}
}
