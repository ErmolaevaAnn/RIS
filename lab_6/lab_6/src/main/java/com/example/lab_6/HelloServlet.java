package com.example.lab_6;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.IOException;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
// Получаем параметры запроса
        String login = request.getParameter("LOGIN");
        String password = request.getParameter("PASSWORD");

// Создаем экземпляр класса, который будет обрабатывать параметры запроса
        NewProcess newProcess = new NewProcess();

// Обрабатываем параметры запроса и получаем результат
        String result = newProcess.newProcess(login, password);

// Отправляем ответ клиенту
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Form Submit Result:</h1>");
        out.print(result);
        out.println("</body></html>");
    }
    public void destroy() {
    }
}
