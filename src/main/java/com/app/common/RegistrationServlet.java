package com.app.common;

import com.app.service.User;
import com.app.service.UsersDB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RegistrationServlet", urlPatterns = {"/registrationPage"})
public class RegistrationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String nickName = request.getParameter("nickName");
            String password = request.getParameter("password");
            String email = request.getParameter("email");
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String sex = request.getParameter("sex");
            int age = Integer.parseInt(request.getParameter("age"));
            String address = request.getParameter("address");
            User user = new User(nickName, password, email, firstName, lastName, sex, age, address);
            UsersDB.insert(user);
            response.sendRedirect(request.getContextPath()+"/index");
        }
        catch(Exception ex) {

            getServletContext().getRequestDispatcher("/registrationPage.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/registrationPage.jsp").forward(request, response);
    }
}
