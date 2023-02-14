package tp5;
import java.sql.*;
public class Principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	String url="jdbc:mysql://localhost:3306/tp_base";
		try {
			Connection con=DriverManager.getConnection(url, "root", "");
			System.out.println("connected");
		} catch (Exception e) {
			System.out.println("not connected");
		}*/	
		
		Fenetre f=new Fenetre();
		f.affciher();
	}
	

}
