package org.code.Develop.Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class TestExample extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置响应类型
        resp.setContentType("text/html");
        // 获取输出流
        PrintWriter pw = resp.getWriter();
        // 写入响应
        pw.write("<h1>HelloWorld</h1>");

        // 最后设置强制输出
        pw.flush();

    }
}
