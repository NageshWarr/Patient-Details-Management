package com.hosp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DButil {
     public static Connection con;
     public static Connection getConnection()
     {
    	 try {
    		 
    			 Class.forName("com.mysql.cj.jdbc.Driver");
    		 
    
               con= DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalscheme","root","Mysql.12345*");	 
           
         }
         catch(SQLException d)
         {
        	 d.printStackTrace();
         } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     
    		
    	 
		return con;
     }	 
    
}
