package com.example.lab_6;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.IOException;

public class HelloServlet extends HttpServlet {

    //private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

// Создаем экземпляр класса, который будет обрабатывать параметры запроса
        NewProcess newProcess = new NewProcess();

// Получаем параметры запроса
        String login = request.getParameter("login");

// Отправляем ответ клиенту
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2> POST </h2>");
        out.println("<h1>" + newProcess.addString(login) + "</h1>");
        out.println("</body></html>");
    }
   public void destroy() {
   }
}
