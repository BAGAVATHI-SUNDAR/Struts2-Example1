package com;

import java.sql.Connection;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Login extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private String uname;
	private String password;
	  
	public String execute(){

		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			Statement s=c.createStatement();
			ResultSet r=s.executeQuery("select * from register where username='"+uname+"' and password='"+password+"'");
			if(r.next()){
				return "success";
			}
			else{
				return "failure";
			}
			}catch(Exception e){
			System.out.println(e);
		}
		return "failure";
				}
	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
public void Validate(){
	if(uname==null ||uname.trim().equals("")){
		addFieldError(uname,"Please provide UserName");
	}
	else{
	if(password==null || password.trim().equals("")){
		addFieldError(password,"Please provide Password");
	}}
	
}

}
