
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<?xml version="1.0" encoding="UTF-8"?>

<!DOCTYPE html
PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/html"
      xmlns:h="http://xmlns.jcp.org/jsf/html">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Финишная страница</title>
</head>
<body>
<h1>Финишная страница</h1>
<h1>Маратканов Руслан Дмитриевич</h1>
<jsp:useBean id="mybean" scope="session" class="jspappl.NameHandler" />
<jsp:useBean id="indi" scope="session" class="jspappl.Indi" />
<table id="results">

</table>
<table id="results" border="1px solid black">
  <tr>
    <td>Четных чисел: ${Indi.getCountEven()}</td>
    <td>Сумма нечетных чисел: ${Indi.getCountOdd()}</td>
    <td><%=indi.CompareOddEvenQty(request.getParameterValues("pArray"))%></td>
  </tr>


</table>
<a href="jsp_2.jsp">Главная страница</a>
</body>
</html>