package com.san.entities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class JdbcSample2 {
	public static void main(String[] args) {
		Connection con = null;
		ResultSet rs = null;
		Statement stmt = null;
		/*
		 * try { Class.forName("com.mysql.jdbc.Driver").newInstance(); } catch
		 * (InstantiationException | IllegalAccessException | ClassNotFoundException e)
		 * { // TODO Auto-generated catch block e.printStackTrace(); }
		 */

		try {
			String dburl = "jdbc:mysql://localhost:3306/employee_info?user=root$password=TIGER";
			con = DriverManager.getConnection(dburl);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			String query = "select * from employee";
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			while (rs.next()) {
				System.out.println(rs.getInt("empid"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getInt("salary"));
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if (con != null) {
					con.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if(rs!=null) {
					rs.close();
				}
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
