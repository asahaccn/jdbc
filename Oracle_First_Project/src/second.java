
import java.sql.*;

public class second {

	    // using try catch block.
		
		public static void main(String[] args){
			// TODO Auto-generated method stub

			 String url = "jdbc:oracle:thin:@localhost:1521:xe";
			 String uname = "system";
			 String pass = "user";
			 String query = "Select name from Student where id = 1"; //Alex
			
			try {
				
			//register the jdbc driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//establish the connection
			Connection con = DriverManager.getConnection(url,uname,pass);
			
			//create statement
			Statement stmt = con.createStatement();
			
			//execute query
			ResultSet rs = stmt.executeQuery(query);
			
			//shifts the pointer to the first line of the table
			rs.next();
		
			//process result
			String username = rs.getString("name");
			System.out.println(username);
			
			stmt.close(); // close the statement
			con.close();  // close the connection.
			
			}
			
			catch(Exception e)
			{
				System.out.println(e);
			}
					
		}



	}

