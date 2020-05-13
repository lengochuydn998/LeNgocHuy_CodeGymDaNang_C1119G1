import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductDiscountServlet",urlPatterns = "/calculator")
public class ProductDiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String product = request.getParameter("pd");
        double price = Double.parseDouble(request.getParameter("lp"));
        int discount = Integer.parseInt(request.getParameter("dp"));

        double discountAmount = price * discount /100;
        double discountPrice = price - discountAmount;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("Product Description: "+product);
        writer.println("\nPrice: "+price);
        writer.println("\nDiscount Percent: "+discount+ "%");
        writer.println("\nDiscount Amount: "+discountAmount);
        writer.println("\nDiscount Price: "+discountPrice);
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
