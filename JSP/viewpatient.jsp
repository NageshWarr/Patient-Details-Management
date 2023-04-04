<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-aFq/bzH65dt+w6FI2ooMVUpc+21e0SRygnTpmBvdBgSdnuTN7QbdgL+OapgHtvPp" crossorigin="anonymous">
   <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/js/bootstrap.bundle.min.js" integrity="sha384-qKXV1j0HvMUeCBQ+QVp7JcfGl760yU08IQ+GpUo5hlbpg51QRiuqHAJz8+BrxE/N" crossorigin="anonymous"></script>
    <%@ page   import="java.sql.*" %>
    <%@ page   import="java.util.*" %>
      <%@ page   import="java.io.*" %>
    <%@ page import="com.hosp.dao.RegisterDAO" %>
       <%@ page import="com.hosp.model.Register" %>
    <%@page import="com.hosp.util.DButil" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:black;'">
<div style="text-align:center;">
   <img src="i2.png" width=250px height=250px>
   </div><%
   HttpSession session1=request.getSession(); 
   
   int pid=(int)session1.getAttribute("pid");
	String pname=(String)session1.getAttribute("pname");
	String pmembership=(String)session1.getAttribute("pmembership");
	String pdisease=(String)session1.getAttribute("pdisease");
	int pbill=(int)session1.getAttribute("pbill");
	String pDoctor=(String)session1.getAttribute("pDoctor");
	int res=(int)session1.getAttribute("res");
	
	

   %>
   <div class="container">
	<h1 style="text-align:center; margin-left:80px;"> <font color="white">  Registered Patient Details </font>
	<button type="button" class="btn btn-warning" onclick="location.assign('addform.jsp');" style="margin-left:950px">ADD PATIENT</button> </h1>
	
	<table class="table table-dark table-hover table-bordered" style="color:white;">
	  <tr style="color:red;">
	  <td>S.no</td>
	     <td>Patient ID</td>
	     <td>Patient Name</td>
	     <td>Patient Membership</td>
	     <td>Patient Disease</td>
	     <td>Patient Bill</td>
	     <td>Patient Doctor</td>
	     <td colspan=2 style="text-align:center;">ACTION</td>
	  </tr>
	    <%    
	    int S=0;
	    List<Register> ll=RegisterDAO.collectdetails();
	      for(Register user:ll){%>
	  <tr>
	   <td><%out.println(S++);%></td>
	  <td><%out.println(user.getPid()); %></td>
	   <td><%out.println(user.getPname()); %></td>
	    <td><%out.println(user.getPmembership()); %></td>
	     <td><%out.println(user.getPdisease()); %></td>
	      <td><%out.println(user.getPbill()); %></td>
	       <td><%out.println(user.getPDoctor()); %></td>
	    <td><button type="button" class="btn btn-warning " onclick="editinfo(<%=user.getPid()%>)">EDIT</button></td>
	         <td><button type="button" class="btn btn-danger" onclick="deleteinfo (<%=user.getPid()%>)">DELETE</button></td>
	  </tr>
	  <% } %>
	</table>
	</div>
</body>
<script>
    function editinfo(user)
    {
    	location.assign("updateform.jsp?id="+user);
    }
    function deleteinfo(userid)
    {
    
      let row=event.target.closest("tr");
      console.log(row);
      let xhttp=new XMLHttpRequest();
      xhttp.open("GET","DeleteServlet?id="+userid,true);
      xhttp.send();
      xhttp.onreadystatechange=function()
      {
    	  if(this.readyState==4 && this.status==200)
    		   row.remove();
      }
    }
    
</script>
</html>