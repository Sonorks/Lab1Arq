<%-- 
    Document   : cliente
    Created on : 21/08/2016, 12:36:34 PM
    Author     : CASA555
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<link rel="stylesheet" href="style.css">
<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css">
 
<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
        <title>Cliente</title>
    </head>
    <body background-color="#35AEA1">
        <div class="container well"style="width: 90%; background-color: #35AEA1">
            <h1 style="background-color:#90B2A4"><center>Informacion de Cliente</center></h1>
        <form action="./ClienteServlet" method="POST" style="width: 100%;background-color: #afcad2;">
        <table align="center">
            <tr>
                <th><center> CC Cliente </center></th>
                <th><input type="text" class="form-control" placeholder="CC" required="true" name="ClienteCc" value="${cliente.cc}"/> </th>
            </tr>
            <tr>
                <th><center> Nombre  </center></th>
                 <th> <input type="text" name="ClienteNombre" class="form-control" placeholder="Nombre" required="false" value="${cliente.nombre}"/></th>
            </tr>
             <tr>
                 <th><center> Apellido</center> </th>
                 <th><input type="text" name="ClienteApellido" class="form-control" placeholder="Apellido" required="false" value="${cliente.apellido}"/> </th>
            </tr>
            <tr>
                <th><center> Telefono </center></th>
                <th><input type="text" name="ClienteTelefono" class="form-control" placeholder="#Telefono" required="false" value="${cliente.telefono}"/></th>
            </tr>           
            
             <tr>
                 <td colspan="2">
                 <input class="btn icon-btn btn-success" type="submit" name="action" value="Add">
                 <span class="glyphicon btn-glyphicon glyphicon-plus img-circle text-success"></span>
           
                 
                 <input class="btn icon-btn btn-info" type="submit" name="action" value="Edit">
                 <span class="glyphicon btn-glyphicon glyphicon-share img-circle text-info"></span>
                 
                 <input class="btn icon-btn btn-danger" type="submit" name="action" value="Delete">
                 <span class="glyphicon btn-glyphicon glyphicon-trash img-circle text-danger"></span>
                 
               <input class="btn icon-btn btn-primary" type="submit" name="action" value="Search">
               <span class="glyphicon btn-glyphicon glyphicon-search img-circle text-primary"></span>
               
               <input class="btn btn-primary btn-block" type="reset" name="Reset" value="Clear" />
                 
                 </td>
             </tr>
            
        </table>
            </form>
            <br>
            
            <table border="1" class="table table-striped" align="center">
                <th scope="row">CC de Cliente</th>
                <th>Nombre de Cliente</th>
                <th>Apellido de Cliente</th>
                <th>Telefono de Cliente</th>
                                
                <c:forEach items="${allClientes}" var="cliente">
                    <tr>
                        <td>${cliente.cc}</td>
                        <td>${cliente.nombre}</td>
                        <td>${cliente.apellido}</td>
                        <td>${cliente.telefono}</td>
                    </tr>
                </c:forEach>
           </table>
            <form method="get" action="./vehiculo.jsp" style="width:100%">
                <table border="1" class="table table-striped" align ="center">
                    <input class="btn btn-primary btn-block" type="submit" value="Vehiculo" />
                </table>
            </form>
            <form method="get" action="./ventasGrales.jsp" style="width:100%">
                <table border="1" class="table table-striped" align ="center">
                    <input class="btn btn-primary btn-block" type="submit" value="Ventas Generales"/>
                </table>
            </form>
    </div>
   
    </body>
</html>
