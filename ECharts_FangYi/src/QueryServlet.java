import bao.entity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author Dongao
 * @create 2020-03-03 15:49
 */
@WebServlet("/queryServlet")
public class QueryServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String date = request.getParameter("date");
        List<entity> list = Service.query(date);
        request.setAttribute("lists",list);
        request.getRequestDispatcher("result.jsp").forward(request,response);
        doGet(request,response);
    }
}
