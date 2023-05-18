
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html
PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/html"
      xmlns:h="http://xmlns.jcp.org/jsf/html">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Главная страница</title>
</head>

<body>
<jsp:useBean id="mybean" scope="session" class="jspappl.NameHandler" />
<jsp:useBean id="individual" scope="session" class="jspappl.Indi" />

<%@ page language="java" %>
<%--<%--%>
<%--    String data = request.getParameter("data");--%>
<%--    if (data == null){--%>

<%--    }--%>
<%--    else{--%>
<%--        String[] args = data.split(" ");--%>
<%--        int sum1 = 0;--%>
<%--        int sum2 = 0;--%>

<%--        for (String x : args)--%>
<%--        {--%>
<%--            int number = Integer.parseInt(x);--%>
<%--            if (number < 0)--%>
<%--            {--%>
<%--                if (number % 2 == -1){--%>
<%--                    sum2 += number;--%>
<%--                }--%>
<%--                else {--%>
<%--                    sum1 += number;--%>
<%--                }--%>
<%--            }--%>
<%--        }--%>
<%--        individual.setEven(sum1);--%>
<%--        individual.setOdd(sum2);--%>
<%--    }--%>

<%--%>--%>

<h1>Главная страница </h1>
<h3>Введите данные для функции через пробел</h3>
<form name="Input form" action="jsp_3.jsp">
    <input type="text" name="data" id="inputdata"/>
    <input type="submit" value="OK" name="button1" />
    <%mybean.addCounter(1);%>
    <h1>${mybean.counter}</h1>
</form>
<%--<script>--%>

<%--        let params = document.getElementById("inputdata").value;--%>
<%--        if(params !== "")--%>
<%--        {--%>
<%--            let url = 'finish.jsp?total='+params;--%>
<%--            window.location.href = url;--%>
<%--        }--%>

<%--</script>--%>
<%--<a href="jsp_3.jsp?pArray=${params.value}">Получить данные</a>--%>
<%--<a href="jsp_3.jsp?pArray=5&pArray=2">Получить данные</a>--%>
</body>
</html>