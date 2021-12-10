<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC 5 - form handling | Java Guides</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
 rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

</head>
<body>
 <div class="container">
  <div class="col-md-offset-2 col-md-7">
   <h2 class="text-center">Teachers Feedback form Management</h2>
   <div class="panel panel-info">
    <div class="panel-heading">
     <div class="panel-title">Add Student</div>
    </div>
    <div class="panel-body">
     <form:form action="saveStudent" cssClass="form-horizontal"
      method="post" modelAttribute="student">

      <!-- need to associate this data with customer id -->
      <form:hidden path="id" />

      <div class="form-group">
       <label for="firstname" class="col-md-3 control-label">First
        Name</label>
       <div class="col-md-9">
        <form:input path="firstName" cssClass="form-control" />
       </div>
      </div>
      <div class="form-group">
       <label for="lastname" class="col-md-3 control-label">Last
        Name</label>
       <div class="col-md-9">
        <form:input path="lastName" cssClass="form-control" />
       </div>
      </div>

      <div class="form-group">
       <label for="Q1" class="col-md-3 control-label">What specific advice would you give to help improve your instructor's teaching?</label>
       <div class="col-md-9">
        <form:input path="Q1" cssClass="form-control" />
       </div>
      </div>

      <div class="form-group">
       <label for="Q2" class="col-md-3 control-label">What are the strongest and weakest features of the way this course is structured?</label>
       <div class="col-md-9">
        <form:input path="Q2" cssClass="form-control" />
       </div>
      </div>
      
      <div class="form-group">
       <label for="Q3" class="col-md-3 control-label">Would you recommend any specific changes?</label>
       <div class="col-md-9">
        <form:input path="Q3" cssClass="form-control" />
       </div>
      </div>
      
      <div class="form-group">
       <label for="Q4" class="col-md-3 control-label">Any additional topics you would like to see covered in class?</label>
       <div class="col-md-9">
        <form:input path="Q4" cssClass="form-control" />
       </div>
      </div>
   
      
      
      <div class="form-group">
       <!-- Button -->
       <div class="col-md-offset-3 col-md-9">
        <form:button cssClass="btn btn-primary">Submit</form:button>
       </div>
      </div>

     </form:form>
    </div>
   </div>
  </div>
 </div>
</body>
</html>