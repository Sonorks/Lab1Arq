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
    <body background-color="#35AEA1">
        <div class="container well" style="width: 90%; background-color: #35AEA1">
            <h1 style="background-color:#90B2A4 "><center>Informacion de vehiculo</center></h1>
        <form action="./VehiculoServlet" method="POST" style="width: 100%;background-color: #afcad2;">
        <table align="center">
            <tr>
                <th><center> Codigo Vehiculo</center> </th>
                <th><input type="text" class="form-control" placeholder="Codigo de Vehiculo" required="true" name="VehiculoCod" value="${vehiculo.cod}"/> </th>
            </tr>
            <tr>
                <th><center> Marca</center> </th>
                 <th> <input type="text" name="vehiculoMarca" class="form-control" placeholder="Marca de Vehiculo" required="true" value="${vehiculo.marca}"/></th>
            </tr>
             <tr>
                 <th><center> Precio</center> </th>
                 <th><input type="text" name="vehiculoPrecio" class="form-control" placeholder="Precio de Vehiculo" required="true" value="${vehiculo.precio}"/> </th>
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
            <form method="get" action="./cliente.jsp" style="width:100%">
            <table border="1"class="table table-striped" align="center">
                <input class="btn btn-primary btn-block" type="submit" value="Cliente"/>
            </table>
            </form>
            <form method="get" action="./ventasGrales.jsp" style="width:100%">
            <table border="1"class="table table-striped" align="center">
                <input class="btn btn-primary btn-block" type="submit" value="Ventas Generales"/>
            </table>
            </form>
    </div>
    
    </body>
</html>