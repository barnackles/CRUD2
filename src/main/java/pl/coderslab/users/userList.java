package pl.coderslab.users;

import pl.coderslab.entity.UserDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;

@WebServlet(name = "userList", value = "/user/list")
public class userList extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        UserDao userToFindAll = new UserDao();
        try {
            request.setAttribute("userList", userToFindAll.findAll());
            getServletContext().getRequestDispatcher("/list.jsp").forward(request,response);
        } catch (SQLException | NullPointerException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
