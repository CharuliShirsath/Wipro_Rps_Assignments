package com.wipro;

import java.sql.*;
import java.util.Scanner;

public class Jdbc_Connectivity {
	public static void main(String[] args) throws SQLException,ClassNotFoundException {
		
		//step1  create driver
		
		Class.forName("oracle.jdbc.OracleDriver");
		
		//step2 
		//url,id,pwd
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:9501/XE","system","rps@123");
		
		System.out.println("connection is success");
Statement st=con.createStatement();
		
//		 cretae,altre,drop,insert,indelete,update
//		st.executeUpdate("create table product(id number primary key,name varchar(10),price number)");
		
//		st.executeUpdate("insert into product values(4,'bag',999)");
//		st.executeUpdate("insert into product values(5,'book',1999)");
//		st.executeUpdate("insert into product values(6,'table',2999)");
//		
//		System.out.println("table created, inserted");

//	st.executeUpdate("update product set price =2000 where id=4");
//	st.executeUpdate("delete from product where id=5");
//
//
//	System.out.println("table created, inserted");
//
//	ResultSet rs=st.executeQuery("select * from product");
//	while(rs.next()) {
//	System.out.println(rs.getString(1)+"  "+rs.getString(2)+"   "+rs.getString(3));
//}

	PreparedStatement pst=con.prepareStatement("insert into product values(?,?,?)");
	Scanner sc=new Scanner(System.in);
	System.out.println("enter 3 products details");
	for(int i=1;i<=3;i++) {
	//read data
	int id=sc.nextInt();   sc.nextLine();
	String name=sc.nextLine();
	int price=sc.nextInt();
			//set data
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setInt(3, price);
			//execute statement
			pst.execute();
	}

	ResultSet rs=st.executeQuery("select * from product");
	//meta data
	ResultSetMetaData rsmd=rs.getMetaData();
	for(int i=1;i<=rsmd.getColumnCount();i++)
	System.out.print(rsmd.getColumnName(i)+ "  ");
	while(rs.next()) {
		System.out.println(rs.getString(1)+"  "+rs.getString(2)+"   "+rs.getString(3));
	}
}
}
