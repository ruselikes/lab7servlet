package com.example.lab7servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.*;

@WebServlet(name = "ServletAppl", urlPatterns = {"/ServletAppl"}, loadOnStartup = 1)
public class HelloServlet extends HttpServlet {
    static String triglabel;
    static boolean trigger;
    static int cycle;
    static int startsize = 2;

    static int[][] results;

    public HelloServlet(){
        HelloServlet.triglabel = "TRIGGER =";
        HelloServlet.trigger = false;
        HelloServlet.cycle = 4;
    }

    public int[] CompareOddEvenQty(String args[]) {
        int even = 0;
        int odd = 0;
        for (String x : args) {
            if (Integer.parseInt(x) % 2 == 0) {
                even =even + 1;//добавление в список чётного
            } else {
                odd = odd + 1;//добавление в список нечётного
            }
        }


        return new int[] {even, odd};
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Маратканов, 4311</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> Лаба 7</h1>");

            //=============I

            if (HelloServlet.trigger) HelloServlet.trigger = false;
            else HelloServlet.trigger = true;


//            out.println("<h3> " + HelloServlet.ast + " " +HelloServlet.trigger + "</h3>");
//            out.println("<h3> Размер текста таблицы :" + HelloServlet.cycle + "</h3>");

            String[] pArray = request.getParameterValues("pArray");
            String arr = request.getParameter("arr");
            String prmSize = request.getParameter("size");
            String fullName = request.getParameter("fi");
            String groupNumber = request.getParameter("group");
            String reset = request.getParameter("reset");

            out.println("<h2> Студент: " + fullName + "</h2>");
            out.println("<h2> Группа: " +  groupNumber + "</h2>");

            out.println("<h" + HelloServlet.cycle + "><table border>"+ "<tr>" + "<td>Размер текста таблицы :"  + "</td>" + "<td>"+"h"+HelloServlet.cycle +"</td>" + "</tr>"+
                    "<tr>" + "<td>"+triglabel + "</td>" + "<td>"+trigger+"</td>" + "</tr>" +

                    "<tr>" + "<td>FI:"  + "</td>" + "<td>"+fullName+"</td>" + "</tr>" +
                    "<tr>" + "<td>group:"  + "</td>" + "<td>"+groupNumber +"</td>" + "</tr>"
                    + "</table></h" + HelloServlet.cycle + ">");

            if(prmSize != "" && prmSize != null) {
                HelloServlet.cycle = Integer.parseInt(prmSize);
                if(HelloServlet.cycle > 1){
                    HelloServlet.cycle = Integer.parseInt(prmSize);
                }else{
                    out.println("<h2>Дальнейшее увеличение не возможно</h2>");
                }
            }


            if(reset != null & reset!="") {
                if (Integer.parseInt(reset) == 1){
                HelloServlet.cycle = startsize;}
            }

            int[] result = CompareOddEvenQty(pArray);
//            int[] result = CompareOddEvenQty(arr.split(" "));
//            out.println("<h2>"+ Integer.toString(result[0]) + "</h2>");
            if (result[0] > result[1]){
                out.println("<h2>Четных больше."+Integer.toString(result[0]) + " > " + Integer.toString(result[1])+ "</h2>");
            }
            else if (result[0] < result[1]) {
                out.println("Нечетных больше. "+Integer.toString(result[1]) + " > " + Integer.toString(result[0]));
            }
            else {
                out.println("Поровну. "+Integer.toString(result[0])+ "==" + Integer.toString(result[1]));
            }

            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        processRequest(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Info about Servlet";
    }
}