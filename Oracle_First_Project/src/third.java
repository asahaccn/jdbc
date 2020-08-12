
import java.sql.*;

public class third {
	
	// This code is modified or improved in Fourth.java .

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		 String url = "jdbc:oracle:thin:@localhost:1521:xe";
		 String uname = "system";
		 String pass = "user";
		 String query = "Select * from Student"; //1 Alex
		                                         //2 Chris
		                                         //3 Mark
		
		//register the jdbc driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//establish the connection
		Connection con = DriverManager.getConnection(url,uname,pass);
		
		//create statement
		Statement stmt = con.createStatement();
		
		//execute query
		ResultSet rs = stmt.executeQuery(query);
		
		String Userdata;
		//shifts the pointer to the first line of the table
		rs.next();
	
		String userdata = rs.getString(1)+ " " +rs.getString(2); // getString(1) gets first column here it is id 1
		//and getString gets second column which is name Alex
		//process result
		System.out.println(userdata);
		
		rs.next();
		
		userdata = rs.getString(1)+ " " +rs.getString(2); // getString(1) gets first column here it is id 1
		//and getString gets second column which is name Alex
		//process result
		
		System.out.println(userdata);
		
		rs.next();
		
		userdata = rs.getString(1)+ " " +rs.getString(2); // getString(1) gets first column here it is id 1
		//and getString gets second column which is name Alex
		//process result
		
		System.out.println(userdata);
		
		stmt.close(); // close the statement
		con.close();  // close the connection.
		
		}
		
}
