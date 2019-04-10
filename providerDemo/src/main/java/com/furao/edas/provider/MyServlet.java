package com.furao.edas.provider;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet extends HttpServlet {

    private static final long serialVersionUID = -7757938143863656976L;

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp ) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.write("my weather service OK!");
        return;
    }

    @Override
    protected void doPost( HttpServletRequest req, HttpServletResponse resp ) throws ServletException, IOException {
        return;
    }

}
