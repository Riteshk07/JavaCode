import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
class A {
	public static void main (String [] args){
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb?user=root&password=1234");
			// Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/schooldb?");
			PreparedStatement pst = con.prepareStatement("select * from students");
			
			ResultSet rst = pst.executeQuery();
			
			while(rst.next()){
				System.out.print("Student_id: "+rst.getInt());
				System.out.print("name: "+rst.getString());
				System.out.print("Email: "+rst.getString());
				System.out.println("pass: "+rst.getString());
				
			}
			con.close();
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}
}