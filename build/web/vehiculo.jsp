<%-- 
    Document   : vehiculo
    Created on : 20/08/2016, 09:35:53 PM
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
        <title>Vehiculo</title>
    </head>
    <body>
        <div class="container well">
        <h1>Informacion de vehiculo</h1>
        <form action="./VehiculoServlet" method="POST">
        <table>
            <tr>
                <th> Codigo Vehiculo </th>
                <th><input type="text" class="form-control" placeholder="Codigo de Vehiculo" required="true" name="VehiculoCod" value="${vehiculo.cod}"/> </th>
            </tr>
            <tr>
                <th> Marca </th>
                 <th> <input type="text" name="vehiculoMarca" class="form-control" placeholder="Marca de Vehiculo" required="true" value="${vehiculo.marca}"/></th>
            </tr>
             <tr>
                <th> Precio </th>
                 <th><input type="text" name="vehiculoPrecio" class="form-control" placeholder="Precio de Vehiculo" required="true" value="${vehiculo.precio}"/> </th>
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
            
            <table border="1" class="table table-striped">
                <th scope="row">Codigo de Vehiculo</th>
                <th>Marca de Vehiculo</th>
                <th>Precio de Vehiculo</th>
                                
                <c:forEach items="${allVehiculos}" var="vehiculo">
                    <tr>
                        <td>${vehiculo.cod}</td>
                        <td>${vehiculo.marca}</td>
                        <td>${vehiculo.precio}</td>
                    </tr>
                </c:forEach>
           </table>
    </div>

    </body>
</html>