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
    <body>
        <div class="container well">
        <h1>Informacion de Cliente</h1>
        <form action="./ClienteServlet" method="POST">
        <table>
            <tr>
                <th> CC Cliente </th>
                <th><input type="text" class="form-control" placeholder="CC" required="true" name="ClienteCc" value="${cliente.cc}"/> </th>
            </tr>
            <tr>
                <th> Nombre  </th>
                 <th> <input type="text" name="ClienteNombre" class="form-control" placeholder="Nombre" required="false" value="${cliente.nombre}"/></th>
            </tr>
             <tr>
                <th> Apellido </th>
                 <th><input type="text" name="ClienteApellido" class="form-control" placeholder="Apellido" required="false" value="${cliente.apellido}"/> </th>
            </tr>
            <tr>
                <th> Telefono </th>
                <th><input type="text" name="ClienteTelefono" class="form-control" placeholder="#Telefono" required="false" value="${cliente.telefono}"/></th>
            </tr>
            <div class="break"></div>                        
                    </div>
            
            
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
            <form action="./clienteServlet">
                <table border="1" class="table table-striped"
                    <input class="btn btn-primary btn-block" type="submit" name="action" value="Vehiculo" />
                    <input class="btn btn-primary btn-block" type="submit" name="action" value="ventasGrales"/>
                </table>
            </form>
            <table border="1" class="table table-striped">
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
    </div>
   
    </body>
</html>
