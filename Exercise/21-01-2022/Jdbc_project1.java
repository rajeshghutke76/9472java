
import java.sql.*;
 
public class Jdbc_project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
try{  
	Class.forName("com.mysql.jdbc.Driver");  
	Connection con=DriverManager.getConnection(  
	"jdbc:mysql://localhost:3306/student_db","root","Rajesh@6997");    
	 //here sonoo is database name, root is username and password  
   	 Statement stmt=con.createStatement();  
	 ResultSet rs=stmt.executeQuery("select * from bonus");  
	while(rs.next())  
	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
	con.close();  
	}catch(Exception e){ System.out.println(e);}  
	}
}
/*
Output:
1  5000  2016-02-20 00:00:00
2  3000  2016-06-11 00:00:00
3  4000  2016-02-20 00:00:00
1  4500  2016-02-20 00:00:00
2  3500  2016-06-11 00:00:00

*/
