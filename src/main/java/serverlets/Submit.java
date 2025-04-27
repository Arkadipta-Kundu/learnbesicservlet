package serverlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/Submit")
public class Submit extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("Post req got form from");
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        // 2. Use the data (example: print or store in database)
        resp.getWriter().write("""
    <h1>welcome %s </h1>
    <h3> your email is %s </h3>
    <p>password is %s </p>
    """.formatted(name,email,password));

    }
}
