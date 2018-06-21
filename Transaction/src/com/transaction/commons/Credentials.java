package com.transaction.commons;

public interface Credentials {

	String DBURL="jdbc:mysql://localhost:3306/Banking?useSSL=false";
	String PASSWORD="root";
	String USER="root";
	String CLASS="com.mysql.jdbc.Driver";
	String SEARCHSENDER="select * from bankholder where accountnumber=?";
	String DEBITSENDER="update bankholder set balance=? where accountnumber=?";
}
