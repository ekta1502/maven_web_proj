package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import model.EmpUsers;

public class UsersDao {
	public boolean registerUser(EmpUsers emp){
		boolean flag = false;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver"); // step-1
			Connection con = DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521:xe",
						"hr",
						"hr"); // step-2
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
