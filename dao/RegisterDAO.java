package com.hosp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import com.hosp.model.Register;
import com.hosp.util.DButil;

public class RegisterDAO {
    
	
    public static int AddUser(Register user) throws SQLException,NullPointerException
    {
    	int b=0;
    	 Connection con=DButil.getConnection();
    PreparedStatement pst=con.prepareStatement("INSERT INTO patient VALUES(?,?,?,?,?,?)");
         pst.setInt(1,user.getPid());
         pst.setString(2,user.getPname());
         pst.setString(3,user.getPmembership());
         pst.setString(4,user.getPdisease());
         pst.setInt(5,user.getPbill());
         pst.setString(6,user.getPDoctor());
         b=pst.executeUpdate();
        
    return b;
    }
    
    ///*** UPDATE PATIENT *** ///
    
    public static int UpdateUser(Register user) throws SQLException
    {
    	 Connection con;
     int b;
    con=DButil.getConnection();
    
    PreparedStatement pst=con.prepareStatement("UPDATE patient SET Pname=?,Pmembership=?,Pdisease=?,Pbill=?,Pdoctor=? WHERE Pid =? ");
         pst.setString(1,user.getPname());
         pst.setString(2,user.getPmembership());
         pst.setString(3,user.getPdisease());
         pst.setInt(4,user.getPbill());
         pst.setString(5,user.getPDoctor());
         pst.setInt(6,user.getPid());
       
         b=pst.executeUpdate();
    return b;
    }
    
    ///***    DELETE USER   *** ///
    
    public static int DeleteUser(int id)
    {
    	 Connection con;
    	 int b=0;
    con=DButil.getConnection();
    try{
    PreparedStatement pst=con.prepareStatement("DELETE FROM patient WHERE Pid=?");
         pst.setInt(1,id);
         b=pst.executeUpdate();
       return b;
    }
    catch(SQLException e)
    {
    e.printStackTrace();
    }
	return b;
    
    }
    public static Register selectUser(int id) throws SQLException,NullPointerException
    {
         Register user=new Register();
         Connection con=DButil.getConnection();
         PreparedStatement pst=con.prepareStatement(" select Pid,Pname,Pmembership,Pdisease,Pbill,Pdoctor from patient WHERE Pid =?");
         pst.setInt(1, id);
     	ResultSet rst=pst.executeQuery();
     	while(rst.next())
     	{
     		user.setPid(rst.getInt(1));
     		user.setPname(rst.getString(2));
     		user.setPmembership(rst.getString(3));
     		user.setPdisease(rst.getString(4));
     		user.setPbill(rst.getInt(5));
     		user.setPDoctor(rst.getString(6));
        }
		return user;
        
    }
    
    public static List<Register> collectdetails() throws SQLException
    {
    	List<Register> ll=new LinkedList<>();
       Connection con=DButil.getConnection();
        PreparedStatement pst=con.prepareStatement(" select * from patient");
      	ResultSet rst=pst.executeQuery();
     	while(rst.next())
     	{
     		Register user=new Register(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getInt(5),rst.getString(6));
     		ll.add(user);
        }
		return ll;
    	
    }
}
