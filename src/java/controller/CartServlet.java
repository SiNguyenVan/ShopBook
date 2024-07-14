/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import static dal.DAO.Instance;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import model.ListProduct;
import model.Product;
import model.User_Info;

/**
 *
 * @author sinan
 */
public class CartServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CartServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CartServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ListProduct.getInstance().getproductList().clear();
        User_Info user = (User_Info) request.getSession().getAttribute("account");
        String userID = user.getUserID() + "";

        Cookie[] arr = request.getCookies();

        double tong = 0;
        for (Cookie cookie : arr) {
            if (Instance.checkProductinStore(ListProduct.getInstance().tachChuoi(cookie.getName().trim()))) {
                if (ListProduct.getInstance().tachChuoi2(cookie.getName()).equals(userID)) {
                    Product a = Instance.getProductByID(ListProduct.getInstance().tachChuoi(cookie.getName().trim()));
                    a.setQuantity(Integer.parseInt(cookie.getValue()));
                    a.setPrice(a.getPrice() * a.getQuantity());

                    ListProduct.getInstance().getproductList().add(a);
                }
            }
        }

        if (!ListProduct.getInstance().getproductList().isEmpty()) {
            request.setAttribute("product", ListProduct.getInstance().getproductList());
           request.setAttribute("thanhtien", ListProduct.getInstance().getSumPrice());
        }

        request.getRequestDispatcher("view/cart.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        User_Info user = (User_Info) request.getSession().getAttribute("account");
        String userID = user.getUserID() + "";
        String pID = request.getParameter("remove");
        Cookie arr[] = request.getCookies();
        
        for (Cookie cookie : arr) {
            if (ListProduct.getInstance().tachChuoi(cookie.getName().trim()).equals(pID)) {
                if (ListProduct.getInstance().tachChuoi2(cookie.getName()).equals(userID)) {
                    cookie.setMaxAge(0);
                    response.addCookie(cookie);
                    break;
                }
            }
        }
        response.sendRedirect("Cart");
//        for (Product i : ListProduct.getInstance().getproductList()) {
//            if (i.getProductID().equals(pID)) {
//                if (ListProduct.getInstance().getproductList().remove(i) == true) {
//                    System.out.println("da xoa");
//                    break;
//                }
//
//            }

//        }
//        request.setAttribute("product", ListProduct.getInstance().getproductList());
//        request.setAttribute("thanhtien", ListProduct.getInstance().getSumPrice());
//
//        request.getRequestDispatcher("view/cart.jsp").forward(request, response);
//doGet(request, response);

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
