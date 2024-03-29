package pl.coderslab.users;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "userChoice", value = "/user/choice")
    public class userChoice extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        HttpSession s = request.getSession();
        s.setAttribute("id", id);
        RequestDispatcher rq = request.getRequestDispatcher("/choice.jsp");
        rq.forward(request, response);

    }
}
