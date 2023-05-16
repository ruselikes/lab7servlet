
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%-- Объявление библиотек тэгов JSF --%>
<%--<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://xmlns.jcp.org/jsf/html">--%>
<?xml version="1.0" encoding="UTF-8"?>

<!DOCTYPE html
PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/html"
      xmlns:h="http://xmlns.jcp.org/jsf/html">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Стартовая страница</title>
</head>
<body>
<jsp:useBean id="mybean" scope="session" class="jspappl.NameHandler" />
<h1>Стартовая страница</h1>
<pre>`1 0 0 1 01
    6 вариант
    1) Программный код вычисляемой функции разместить:  1 –
    в классе Bean-компоненты.
    0) Заголовки страниц должны иметь следующий вид: 0 – «Стартовая страница»,
    «Главная страница» и «Финишная страница»;
    0) Формат «Стартовой страницы»: 0 – содержит текст задания на лабораторную работу,
    ФИО студента и ссылку для перехода на «Главную страницу»
    1) Организовать вывод результатов работы функции на «Финишной странице»: 1 – результаты должны быть каким-то
    образом размещены в видимой таблице, в таблице допускается произвольное число
    столбцов и строк
    1) При повторном переходе на «Главную страницу», например при нажатии кнопки
    «Возврат» на «Финишной странице», на «Главной странице» должно отображаться:  1 – изменение счётчика, размещённого на
    «Главной странице»;`</pre>
<h1>Маратканов Руслан Дмитриевич 4311</h1>
<a href="jsp_2.jsp">Главная страница</a>
</body>
</html>