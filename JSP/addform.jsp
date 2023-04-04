<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
          <link rel="stylesheet" href="updateform.css">
      
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-aFq/bzH65dt+w6FI2ooMVUpc+21e0SRygnTpmBvdBgSdnuTN7QbdgL+OapgHtvPp" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/js/bootstrap.bundle.min.js" integrity="sha384-qKXV1j0HvMUeCBQ+QVp7JcfGl760yU08IQ+GpUo5hlbpg51QRiuqHAJz8+BrxE/N" crossorigin="anonymous"></script>
      
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <div class="wrapper">
			<div class="inner">
				<img src="updateformimage1.png" alt="" class="image-1">
				<img src="updateformimage2.png" alt="" class="image-2">
				<form action="Firstservlet" method="get">
					
					<h3>New Patient?</h3>
					<div class="form-holder">
						     <label>Patient DOCTOR</label>
						<input type="text" class="form-control" placeholder="PatientId" name="id" >
					</div>
					<div class="form-holder">
						     <label>Patient DOCTOR</label>
						<input type="text" class="form-control" placeholder="PatientName" name="name">
					</div>
					<div class="form-holder">
						     <label>Patient DOCTOR</label>
						<input type="text" class="form-control" placeholder="Patient Membership" name="membership" >
					</div>
					<div class="form-holder">
				     <label>Patient DOCTOR</label><br>
						<input type="text" class="form-control" placeholder="Patient Disease" name="disease">
					</div>
					<div class="form-holder">
					     <label>Patient DOCTOR</label>
						<input type="text" class="form-control" placeholder="Patient bill" name="bill" >
					</div>
					<div class="form-holder">
						     <label>Patient DOCTOR</label>
						<input type="text" class="form-control" placeholder="Patient Doctor" name="doctor">
					</div>
					   <div style="text-align:center;">
           <input type="submit" value="submit" class="btn btn-danger">
          </div>
				</form>
				
			</div>
			
		</div>
</body>
</html>