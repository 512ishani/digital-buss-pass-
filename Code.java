package buffer;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
public class Code {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("hello");
		Connection  con=null;
		final String db_url= "jdbc:mysql://localhost:3306";
		final String username="root@localhost";
		final String password="Nov@2022";
		try {
		     // Class.forName("com.mysql.jdbc.Driver");
			 DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			//Class.forName("com.mysql.jdbc.Driver"); 
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306");
			
		      con = DriverManager.getConnection(db_url, username, password);

		      System.out.println("Connected!");

		    } catch (SQLException ex) {
		        throw new Error("Error ", ex);
		    } finally {
		      
		    	try {
		        if (con != null) {
		            con.close();
		        }
		      } catch (SQLException ex) {
		          System.out.println(ex.getMessage());
		      }
		    }
		//void data  (String name,long a_num,long ph_num) {
			
		}
		
	}


