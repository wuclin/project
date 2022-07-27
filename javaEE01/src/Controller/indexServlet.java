package Controller;

import model.Discount;
import model.Goods;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class indexServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            request.setCharacterEncoding("utf-8");
        Goods goods = new Goods();
        Discount discount = new Discount();
        int num;
        Double price;
        Double dis;
        try{
            num = Integer.parseInt(request.getParameter("num"));
            price = Double.parseDouble(request.getParameter("price"));
            goods.setNum(num);
            dis = discount.calculate(num);
            goods.setPrice(num*price*dis);
            request.getSession().setAttribute("goods",goods);
            request.getRequestDispatcher("price.jsp").forward(request, response);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
