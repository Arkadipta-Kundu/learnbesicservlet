package serverlets;


import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;

@WebServlet("/first")
public class FirstServlets implements Servlet {

private ServletConfig servletConfig;

    @Override
    public void init(ServletConfig arg0) throws ServletException {
        this.servletConfig=arg0;
        System.out.println("Servlet initialized");
    }

    @Override
    public ServletConfig getServletConfig() {
        return servletConfig;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Servlet service method called");
    }

    @Override
    public String getServletInfo() {
        return "";
    }

    @Override
    public void destroy() {

    }
}
