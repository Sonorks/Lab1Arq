<%-- 
    Document   : ventasGrales
    Created on : 25/08/2016, 08:47:46 PM
    Author     : CASA555
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <title>Ventas Generales</title>
    </head>
    <body background-color="#35AEA1">
        <div class="container well" style="width: 90%; background-color: #35AEA1">
            <h1 style="background-color:#90B2A4 "><center>Informacion de Ventas Generales</center></h1>
        <form action="./VentasGralesServlet" method="POST" style="width: 100%;background-color: #afcad2;">
        <table align="center">
            <tr>
                <th><center> Codigo Venta</center> </th>
                <th><input type="text" class="form-control" placeholder="codigo venta" required="true" name="codVenta" value="${ventasGrales.codVenta}"/> </th>
            </tr>
            <tr>
                <th><center> Precio </center> </th>
                 <th> <input type="text" name="precio" class="form-control" placeholder="precio" required="false" value="${ventasGrales.precio}"/></th>
            </tr>
             <tr>
                 <th><center> Codigo Vehiculo </center></th>
                 <th><input type="text" name="codVehiculo" class="form-control" placeholder="codigo vehiculo" required="false" value="${ventasGrales.codVehiculo}"/> </th>
            </tr>
            <tr>
                <th><center> Cliente </center></th>
                <th><input type="text" name="cliente" class="form-control" placeholder="cc cliente" required="false" value="${ventasGrales.cliente}"/></th>
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
                <th scope="row">Codigo Venta</th>
                <th>Precio</th>
                <th>Codigo Vehiculo</th>
                <th>Cliente</th>
                                
                <c:forEach items="${allVentasGrales}" var="ventasGrales">
                    <tr>
                        <td>${ventasGrales.codVenta}</td>
                        <td>${ventasGrales.precio}</td>
                        <td>${ventasGrales.codVehiculo}</td>
                        <td>${ventasGrales.cliente}</td>
                    </tr>
                </c:forEach>
           </table>
            <form action="./vehiculo.jsp" style="width:100%">
                <table border="1" class="table table-striped" align="center">
                    <input class="btn btn-primary btn-block" type="submit" value="Vehiculo"/>
                </table>
            </form>
            <form action="./cliente.jsp" style="width:100%">
                <table border="1" class="table table-striped" align="center">
                    <input class="btn btn-primary btn-block" type="submit" value="Cliente" />
                </table>
            </form>
    </div>
    </body>
</html>
