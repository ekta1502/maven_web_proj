package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

import model.EmpUsers;

public class UsersDao {
	public boolean registerUser(EmpUsers emp){
		boolean flag = false;
		try{
			Properties props = new Properties();
			
			props.load(this.getClass().getResourceAsStream("/database.properties"));
			String driver = props.getProperty("jdbc.driver");
			if(driver!=null){
				Class.forName(driver);
			}
			String url = props.getProperty("jdbc.url");
			String username = props.getProperty("jdbc.username");
			String password = props.getProperty("jdbc.password");
			//Class.forName("oracle.jdbc.driver.OracleDriver"); // step-1
			Connection con = DriverManager.getConnection(
					url,
					username,
					password); // step-2
//			Connection con = DriverManager.getConnection(
//						"jdbc:oracle:thin:@192.168.101.67:1521:xe",
//						"hr",
//						"hr"); // step-2
			PreparedStatement smt = con.prepareStatement("INSERT INTO EMPUSERS VALUES (?,?,?,?,?,?)");
			smt.setString(1, emp.getUid());
			smt.setString(2, emp.getUname());
			smt.setString(3, emp.getUpwd());
			smt.setString(4, emp.getContact());
			smt.setString(5, emp.getEmail());
			smt.setString(6, emp.getGender());
			int result = smt.executeUpdate();
			if(result>0){
				flag=true;
			}
			con.close();
			
		}catch(Exception e){
			System.out.println(e);
		}
		return flag;
	}
}
