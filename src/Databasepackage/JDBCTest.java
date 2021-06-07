package Databasepackage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","root");
		 System.out.println("Connection is successfull");
          
		 System.out.println ("Connection is successfull");
		 Statement stmt=con.createStatement();
		 ResultSet rs=stmt.executeQuery("select * from eproduct");
		 
		 while(rs.next()) {
			 System.out.println(rs.getInt(1)+" "+ rs.getString(2));
			
		       	 
		 }
		 
      stmt.executeUpdate("insert into eproduct(name,price,date_added) values ('Hard Drive',600.00,now())");
      //update the values in thetable
      
      stmt.executeUpdate("update eproduct set price=20000 where name = 'Laptop'");
      stmt.executeUpdate("delete from  eproduct where name = 'Laptop'");
      		
      
      }catch (ClassNotFoundException e) {

      // TODO Auto-generated catch block
      e.printStackTrace();
  } catch (SQLException e) {
      // TODO Auto-generated catch block
      System.out.println("SQL password is incorrect");
	  e.printStackTrace();
    
                             }
	}
}

	
	
	
	
	
