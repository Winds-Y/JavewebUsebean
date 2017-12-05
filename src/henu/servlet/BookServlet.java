package henu.servlet;

import henu.bean.BookBean;
import henu.bean.Rectangle;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * User: Yangtse
 * Date: 2017/11/20
 * Time: 18:48
 */
@WebServlet(name = "BookServlet",urlPatterns = "/book.servlet")
public class BookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BookBean bookBean=new BookBean();
        bookBean.setBookName(request.getParameter(BookBean.BOOKNAME));
        bookBean.setBookPrice(request.getParameter(BookBean.BOOKPRICE));
        bookBean.setBookAuthor(request.getParameter(BookBean.BOOKAUTHOR));
        bookBean.setBookPublisher(request.getParameter(BookBean.BOOKPUBLISHER));
        bookBean.setBookModifyNumber(Integer.parseInt(request.getParameter(BookBean.BOOKMODIFYNUMBER)));
        request.setAttribute("bookInfo",bookBean);
        request.getRequestDispatcher("/view/show.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
