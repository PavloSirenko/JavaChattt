package com.app.common;

import com.app.service.*;
import com.app.dao.UsersDB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String nickName = request.getParameter("nickName");
            String password = request.getParameter("password");
            String email = request.getParameter("email");
            User user = new User(new BuilderUser(nickName, password, email));
            UsersDB.insert(user);
            response.sendRedirect(request.getContextPath() + "/userpage");
        }
        catch(Exception ex) {

            getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/views/registration.jsp").forward(request, response);
    }
}
