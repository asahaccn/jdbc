

// INSERT QUERIES Number 1.
import java.sql.*;
public class fifth {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		 String url = "jdbc:oracle:thin:@localhost:1521:xe";
		 String uname = "system";
		 String pass = "user";
		 String query = "insert into Student values(4 ,'Martin')"; // inserting a new row .
		
		
		//register the jdbc driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//establish the connection
		Connection con = DriverManager.getConnection(url,uname,pass);
		
		//create statement
		Statement stmt = con.createStatement();
		
		//execute query
		int count = stmt.executeUpdate(query);
		
		//shifts the pointer to the first line of the table
		
		System.out.println(count + " Row/s inserted"); // 1 Row/s inserted
		
		stmt.close(); // close the statement
		con.close();  // close the connection.
		
			
		

	}

}
