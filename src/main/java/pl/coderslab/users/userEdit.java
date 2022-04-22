package pl.coderslab.users;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "userEdit", value = "/user/edit")
public class userEdit extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int userId = Integer.parseInt(request.getParameter("id"));
        UserDao readUserDao = new UserDao();
        HttpSession sess = request.getSession();

       try {

            request.setAttribute("user", readUserDao.read(userId));
            sess.setAttribute("user", readUserDao.read(userId));
            getServletContext().getRequestDispatcher("/edit.jsp").forward(request,response);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        }


  /*  @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



        UserDao userUpdateDao = new UserDao();
        try {
            User userToUpdate = userUpdateDao.read(id);
            userToUpdate.setUserName(newUserName);
            userToUpdate.setEmail(newUserEmail);
            userToUpdate.setPassword(newUserPassword);
            userUpdateDao.update(userToUpdate);

        } catch (SQLException e) {
            e.printStackTrace();


    }*/
}
