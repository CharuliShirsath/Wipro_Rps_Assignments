package com.wipro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Product1 {
	
	private Connection getConnection() throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		return
		DriverManager.getConnection("jdbc:oracle:thin:@localhost:9501/XE","system","rps@123");
		}
	
	public void addProduct(int id,String name, int price) throws Exception {
		Connection con =  getConnection	();
		PreparedStatement pst = con.prepareCall("insert into product value(?,?,?)");
		pst.setInt(1, id);
		pst.setString(2, name);
		pst.setInt(3, price);
		pst.execute();
		pst.close();
		con.close();
		
		}
	public void updateProduct(int id, String name, int price) throws Exception {
		Connection con = getConnection();
		PreparedStatement pst = con.prepareStatement("update product set name=?, price=?where id=?");
		pst.setString(1, name);
		pst.setInt(2, price);
		pst.setInt(3, id);
		pst.executeUpdate();
		pst.close();
		con.close();
		}
		public void deleteProduct(int id) throws Exception {
		Connection con = getConnection();PreparedStatement pst = con.prepareStatement("delete from product where id=?");
		pst.setInt(1, id);
		pst.executeUpdate();
		pst.close();
		con.close();
		}
		public List<String> listProducts() throws Exception {
		List<String> productList = new ArrayList< >();
		Connection con = getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from product");
		ResultSetMetaData rsmd = rs.getMetaData();
		StringBuilder header = new StringBuilder();
		for(int i = 1; i <= rsmd.getColumnCount(); i++) {
		header.append(rsmd.getColumnName(i)).append(" ");
		}
		productList.add(header.toString());
		while(rs.next()) {
		productList.add(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
		}
		rs.close();
		st.close();
		con.close();
		return productList;
	}
}
