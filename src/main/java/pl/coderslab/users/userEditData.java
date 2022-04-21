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

@WebServlet(name = "userEditData", value = "/user/editdata")
public class userEditData extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        UserDao userUpdateDao = new UserDao();
        HttpSession sess = request.getSession();


        User userToGetId = (User) sess.getAttribute("user");
        int userId = userToGetId.getId();


        try {
            User userToUpdate = userUpdateDao.read(userId);
            userToUpdate.setUserName(request.getParameter("userName"));
            userToUpdate.setEmail(request.getParameter("userEmail"));
            userToUpdate.setPassword(request.getParameter("userPassword"));
            userUpdateDao.update(userToUpdate);
            response.sendRedirect("/user/list");

        } catch (SQLException e) {
            e.printStackTrace();


        }
    }
}
