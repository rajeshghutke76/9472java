import java.sql.*;

public class Jdbc_project {

public static void main(String[] args) {
		// TODO Auto-generated method stub
    
try{  
	Class.forName("com.mysql.jdbc.Driver");  
	Connection con=DriverManager.getConnection(  
	"jdbc:mysql://localhost:3306/student_db","root","Rajesh@6997");  
	//here sonoo is database name, root is username and password  
	Statement stmt=con.createStatement();  
	ResultSet rs=stmt.executeQuery("select * from student_tbl");  
	while(rs.next())  
	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
	con.close();  
	}catch(Exception e){ System.out.println(e);}  
  }  
}  

/* 
Output:

1  Rajesh  23
2  shubham  24
3  govind  25
4  ajay  26
5  Pandurang  27
 
 */