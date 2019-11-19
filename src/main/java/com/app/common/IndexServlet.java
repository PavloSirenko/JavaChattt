package com.app.common;

import com.app.dao.UsersDB;
import com.app.service.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/index")
public class IndexServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         /* реалізувати перевірку аутентифікації користувача */
         String nickName = request.getParameter("nickName");
         String password = request.getParameter("password");
        UsersDB usersDB = new UsersDB();
        User user = usersDB.selectUserByEmailByPassword(nickName, password);

         //if (user != null) {
            response.sendRedirect(request.getContextPath() + "/userpage");
//         } else {
//             System.out.println("Error!");
//         }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
