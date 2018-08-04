package applets;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import java.sql.*;
public class ap1
{
	public static void main(String args[])
	{
		Statement st;
		ResultSet rs,rs1;

		try
		{
		//	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

			Connection con = DriverManager.getConnection("jdbc:ucanaccess://D:\\Employee.accdb");

			st = con.createStatement();
						
			String rd = "Update Employee_Master set Emp_Experiance = 6 where Emp_id=4";
                        String rd1 = "Update Employee_Master set Emp_Experiance = 11 where Emp_id=3";
                        String rd2 = "select Emp_Experiance from Employee_Master where Emp_id=4 ";
			st.execute(rd);
                        st.execute(rd1);
                        rs1= st.executeQuery(rd2);
                        while(rs1.next())
			{
				System.out.println( 
						rs1.getInt("Emp_Experiance") + "\t"
						);
								
			}
			con.commit();

			rs = st.executeQuery("select * from Employee_Master");

			while(rs.next())
			{
				System.out.println(rs.getInt("Emp_Id") + "\t" +
						rs.getString("Emp_Name") + "\t"	 +	
						rs.getString("Emp_Add") + "\t" +
						rs.getInt("Emp_Salary") + "\t" +
						rs.getInt("Emp_Experiance") + "\t"
						);
								
			}
			st.close();
			con.close();
		}
		catch(SQLException e1)
		{
			System.out.println(e1);
		}
	}
}