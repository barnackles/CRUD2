package pl.coderslab.users;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "userAdd", value = "/user/add")
public class userAdd extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.sendRedirect("/add.jsp");

    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String userName = request.getParameter("userName");
        String userEmail = request.getParameter("userEmail");
        String userPassword = request.getParameter("userPassword");

        User newUser = new User(userName, userEmail, userPassword);
        UserDao newUserDao = new UserDao();
        newUserDao.create(newUser);

        response.sendRedirect("/user/list");

    }

}
