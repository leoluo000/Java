package com.smartlab.sqldemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainClass {

	public static void main(String[] args) {

		Connection con;
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/mydatabase";
		String user = "root";
		String password = "Luoqilin.0053";

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);

			if (!con.isClosed()) {
				System.out.println("Succeeded connecting to the Database!");
			}
			Statement statement = con.createStatement();
			String sql = "select * from mytable";

			ResultSet rs = statement.executeQuery(sql);
			System.out.println("---------------");
			System.out.println("执行结果如下所示：");
			System.out.println("---------------");
			System.out.println("姓名" + "\t" + "地址");
			System.out.println("---------------");

			String address = null;

			String name = null;

			while (rs.next()) {
				name = rs.getString("sname");
				address = rs.getString("address");
				System.out.println(name + "\t" + address);
			}

			rs.close();
			con.close();

		} catch (ClassNotFoundException e) {
			System.out.println("sorry,can't find the Driver!");
			e.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		} catch (Exception e2) {
			e2.printStackTrace();
		} finally {
			System.out.println("数据库数据成功获取！");
		}

	}

}
