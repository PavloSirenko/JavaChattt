package com.app.common;

import com.app.dao.UsersDB;
import com.app.service.BuilderUser;
import com.app.service.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/userpage")
public class UserpageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = UsersDB.selectOne(3);
        getServletContext().getRequestDispatcher("/views/userpage.jsp").forward(request, response);
    }
}
