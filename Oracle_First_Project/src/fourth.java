
import java.sql.*;
public class fourth {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		String url =  "jdbc:oracle:thin:@localhost:1521:xe";
		String uname = "system" ;
		String pass = "user";
		String query = "Select * from Student" ;
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con = DriverManager.getConnection(url,uname,pass);
		
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery(query);
		
		String userdata;
		
		// using while loop to print the table data and not using separate call like we have seen in third.java.
		
		while(rs.next()) // rs.next shifts the pointer to the next row and checks if the next row exists if it exists 
			// return true else false.
		{
			userdata = rs.getString(1)+ " " +rs.getString(2);
			System.out.println(userdata);
		}
		
		
		stmt.close();
		con.close();
		
	}

}
