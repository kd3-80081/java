package UserPackage;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;
public class UserDAO  implements AutoCloseable{
	private Connection con;
	
	public UserDAO() throws SQLException{
		con=DBUtil.getConnection();
	}
	
	
//insert into users values(default,'Rama','Kher','rama@gmail.com','ram#123','1999-1-1',0,'admin')
//select * from users where id=?
//update users set email= ?, password = ? where id=?
//delete from users where id=?
	@Override
	public void close() throws Exception {
		try {
			if(con!=null)
				con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	static Date parseDate(String str) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			Date date = sdf.parse(str);
			return date;
			
		}catch(ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
//add a user

	public int addUser(User u) throws SQLException{
		String sql="insert into users values(default,?,?,?,?,?,true,?)";
	//1-(String)fname, 2-(String)lname, 3-(String)email, 4-(String)password, 5-(date)dob, 7-(String)role
		int count=0;
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			Date utilDate = parseDate(u.getDob());
			java.sql.Date sqlDate= new java.sql.Date(utilDate.getTime());
			stmt.setString(1, u.getfName());
			stmt.setString(2, u.getlName());
			stmt.setString(3, u.geteMail());
			stmt.setString(4, u.getPasswd());
			stmt.setDate(5, sqlDate);
			stmt.setString(6, u.getRole());
			count = stmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
			
		}return count;
	
	}
	
	public int updateUser(User u) throws SQLException{
		String sql = "UPDATE users set first_name = ? where id = ?";
		int count =0;
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			stmt.setString(1, u.getfName());
			stmt.setInt(2,  u.getId());
			count = stmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return count;
		
	}
	
	public int deleteUser(User u) throws SQLException {
		int count=0;
		String sql= "delete from users where id = ?";
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			stmt.setInt(1, u.getId());
			count = stmt.executeUpdate();
			}catch(Exception e){
				e.printStackTrace();
			}
				
		return count;
	}
	
	public List<User> printUser(User u) throws SQLException{
		int count =0;
		List<User> list = new ArrayList<>();
		String sql= "select * from users";
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			try(ResultSet rs = stmt.executeQuery()){
				while(rs.next()) {
					int id = rs.getInt("id");
					String fname = rs.getString("first_name");
					String lname = rs.getString("last_name");
					String email = rs.getString("email");
					java.sql.Date sDate= rs.getDate("dob");
					SimpleDateFormat sdf= new SimpleDateFormat("dd_MM_yyyy");
					String bdate = sdf.format(sDate);
					boolean status = rs.getBoolean("status");
					String role = rs.getString("role");
					u= new User(id, fname, lname, email, bdate, status,role);
					System.out.println(u);
					list.add(u);
					
				}
			}
		}
		return list;
	
	}
}
