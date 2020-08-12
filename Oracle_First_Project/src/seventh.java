
// insert involveing prepared statement , prepared statement are queries already prepared only there values changes.
import java.sql.*;
public class seventh {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		 String url = "jdbc:oracle:thin:@localhost:1521:xe";
		 String uname = "system";
		 String pass = "user";
		 int id = 6 ;
		 String name = "Max" ;
		 String query = "Insert into Student values(?,?)"; //proper syntax to use string between query ' "+ String Name +" '
		 
		
		
		//register the jdbc driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//establish the connection
		Connection con = DriverManager.getConnection(url,uname,pass);
		
		//create statement
		PreparedStatement stmt = con.prepareStatement(query);
		stmt.setInt(1 , id);
		stmt.setString(2 , name);
		
		//execute query
		int count  = stmt.executeUpdate();
		
		
		System.out.println(count + " Row/s inserted");
		
		stmt.close(); // close the statement
		con.close();  // close the connection.
		
		// one can also perform other operations like delete ,insert etc like update.
		
		

		

	}

}
