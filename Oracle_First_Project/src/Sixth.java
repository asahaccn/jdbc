import java.sql.*;
public class Sixth {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		 String url = "jdbc:oracle:thin:@localhost:1521:xe";
		 String uname = "system";
		 String pass = "user";
		 int id = 5 ;
		 String name = "Tom" ;
		 String query = "Insert into Student values(" + id + ",'" + name +"')"; //proper syntax to use string between query ' "+ String Name +" '
		 
		
		
		//register the jdbc driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//establish the connection
		Connection con = DriverManager.getConnection(url,uname,pass);
		
		//create statement
		Statement stmt = con.createStatement();
		
		//execute query
		int count  = stmt.executeUpdate(query);
		
		
		System.out.println(count + " Row/s inserted");
		
		stmt.close(); // close the statement
		con.close();  // close the connection.
		
		

	}

}
