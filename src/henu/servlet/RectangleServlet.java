package henu.servlet;

import henu.bean.Rectangle;

import java.io.IOException;

/**
 * User: Yangtse
 * Date: 2017/11/20
 * Time: 17:38
 */
@javax.servlet.annotation.WebServlet(name = "RectangleServlet",urlPatterns = "/RectangleServlet")
public class RectangleServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        Rectangle rectangle=new Rectangle();
        rectangle.setLength(Double.parseDouble(request.getParameter("length")));
        rectangle.setWidth(Double.parseDouble(request.getParameter("width")));
        request.setAttribute("rectangle",rectangle);
        request.getRequestDispatcher("/view/show.jsp").forward(request,response);
        System.out.println("RectangleServlet");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
