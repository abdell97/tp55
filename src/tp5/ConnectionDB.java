package tp5;

import java.sql.*;
public class ConnectionDB {
public Connection con;
	
	public ConnectionDB() {
		String url="jdbc:mysql://localhost:3306/tp_base";
		try {
			this.con=DriverManager.getConnection(url, "root", "");
			System.out.println("connected");
		} catch (Exception e) {
			System.out.println("not connected");
		}
	}

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}
}
