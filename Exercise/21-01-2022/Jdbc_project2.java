import java.sql.*;

public class Jdbc_project2 {

public static void main(String[] args) {
// TODO Auto-generated method stub
try{  
	Class.forName("com.mysql.jdbc.Driver");  
	Connection con=DriverManager.getConnection(  
	"jdbc:mysql://localhost:3306/student_db","root","Rajesh@6997");  
	//here sonoo is database name, root is username and password  
	Statement stmt=con.createStatement();  
	ResultSet rs=stmt.executeQuery("select * from tittle");  
	while(rs.next())  
	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
	con.close();  
	}catch(Exception e){ System.out.println(e);}   

	}

}
/*
Output:
1  Manager  2016-02-20 00:00:00
2  Executive  2016-06-11 00:00:00
8  Executive  2016-06-11 00:00:00
5  Manager  2016-06-11 00:00:00
4  Asst. Manager  2016-06-11 00:00:00
7  Executive  2016-06-11 00:00:00
6  Lead  2016-06-11 00:00:00
3  Lead  2016-06-11 00:00:00

*/