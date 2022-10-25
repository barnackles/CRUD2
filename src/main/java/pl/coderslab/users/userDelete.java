package pl.coderslab.users;

import pl.coderslab.entity.UserDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "userDelete", value = "/user/delete")
public class userDelete extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


            String choiceValue = request.getParameter("choice");

            if ("yes".equals(choiceValue)) {

                int userId = Integer.parseInt(request.getParameter("id"));
                UserDao userToDeleteDao = new UserDao();
                userToDeleteDao.delete(userId);
                response.sendRedirect("/user/list");
            } else {
                response.sendRedirect("/user/list");
            }


    }
}
