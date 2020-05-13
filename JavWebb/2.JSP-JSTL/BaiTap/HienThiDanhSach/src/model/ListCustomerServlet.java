package model;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ListCustomerServlet",urlPatterns = "/customers")
public class ListCustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("huy","19","Đà Nẵng","https://cdn3.ivivu.com/2019/10/huong-dan-duong-den-thac-dray-nur-ivivu-7.jpg"));
        customerList.add(new Customer("huyền","18","Buôn Ma Thuột","https://cdn3.ivivu.com/2019/10/huong-dan-duong-den-thac-dray-nur-ivivu-7.jpg"));
        customerList.add(new Customer("hung","10","Đà Nẵng","https://cdn3.ivivu.com/2019/10/huong-dan-duong-den-thac-dray-nur-ivivu-7.jpg"));
        request.setAttribute("danhSach",customerList);
        request.getRequestDispatcher("/index.jsp").forward(request,response);
    }
}
