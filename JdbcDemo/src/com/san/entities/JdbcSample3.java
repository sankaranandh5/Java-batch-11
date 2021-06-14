package com.san.entities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSample3 {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		try {
			String dburl = "jdbc:mysql://localhost:3306/employee_info";
			con = DriverManager.getConnection(dburl, "root", "TIGER");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			String query = "insert into employee values(1, 'sankar', 30000,'2019/08/05');";
			stmt = con.createStatement();
			int n = stmt.executeUpdate(query);
			System.out.println(n + " number of rows affected");
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

			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
