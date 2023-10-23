package Election;
import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CandidateDAO implements AutoCloseable {

	private Connection con;

	public CandidateDAO() throws SQLException {
		con = dbUtil.getConnection();
	}

	@Override
	public void close() {
		try {
			if (con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// add new candidate

	public int save(Candidate c) throws SQLException {
		String sql = "insert into candidates values(default,?,?,? )";
		int count=0;
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, c.getName());
			stmt.setString(2, c.getParty());
			stmt.setInt(3, c.getVotes());

			 count = stmt.executeUpdate();
			
			}catch (Exception e) {
			e.printStackTrace();
		}return count;
	}
	// modify name and party for the id.
	public int update(Candidate c) {
		String sql = "UPDATE candidates SET name = ?, party=? where id=?";
		int count =0;
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			stmt.setString(1, c.getName());
			stmt.setString(2, c.getParty());
			stmt.setInt(3, c.getId());
			
			count = stmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		} return count;
	} 
	
	public List<PartyVotes> getPartyWiseVote() throws SQLException{
		List<PartyVotes> list=new ArrayList<PartyVotes>();
		String sql = "select party, sum(votes) from candidates group by party";
		try(PreparedStatement stmt = con.prepareCall(sql)){
			try(ResultSet rs = stmt.executeQuery()){
				while(rs.next()) {
				PartyVotes c=new PartyVotes();
				c.setParty(rs.getString("party"));
				c.setVotes(rs.getInt("sum(votes)"));
				list.add(c);
//				System.out.printf("%s,%d\n",c.getParty(),c.getVotes());

				}
			}

		}
		return list;
	}

}