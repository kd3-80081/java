package UserPackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
		String sql="insert into users values(default,?,?,?,?,?,?,?)";
	//1-(String)fname, 2-(String)lname, 3-(String)email, 4-(String)password, 5-(date)dob, 6- (Boolean)status, 7-(String)role
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			Date utilDate = parseDate(u.getDob());
			java.sql.Date sqlDate= new java.sql.Date(utilDate.getTime());
			stmt.setString(1, u.getfName());
			stmt.setString(2, u.getlName());
			stmt.setString(3, u.geteMail());
			stmt.setString(4, u.getPasswd());
			stmt.setString(5, u.getDob());
		}
	
	}
}
