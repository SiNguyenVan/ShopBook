/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller.Admin;

import static dal.DAO.Instance;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author sinan
 */
public class UpdateProductServlet extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
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
            out.println("<title>Servlet UpdateProductServlet</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UpdateProductServlet at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
       String  id = request.getParameter("id");
       if(Instance.getProductByID(id)==null) {
           response.sendRedirect("Adm");
           return;
       } 
       request.setAttribute("product", Instance.getProductByID(id));
       request.setAttribute("listOfCategory", Instance.getAllCategory());
       request.getRequestDispatcher("view/FormUpdateProduct.jsp").forward(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String name=request.getParameter("pName");
        String price=request.getParameter("pPrice");
        double price_raw=0;
        if(price!=null) {
            price_raw =Double.parseDouble(price);
        }
     
        String img=request.getParameter("Pimg");
        String Quantity = request.getParameter("pQuantity");
        int quan=0;
        if(Quantity!=null) {
            quan=Integer.parseInt(Quantity);
        }
        String cateID=request.getParameter("op");
        String author=request.getParameter("pAuthor");
        String id =request.getParameter("id");
       // System.out.println(id);
//        System.out.println(name);
//        System.out.println(price);
//        System.out.println(img);
//        System.out.println(Quantity);
//        System.out.println(cateID);
//        System.out.println("--------------");
       if(Instance.UpdateProduct(name, price_raw, img, quan, cateID, author,id )==true) {
           response.sendRedirect("Adm");
           return ;
       }else {
           request.setAttribute("fail", "Fail to update");
           doGet(request, response);
       }

    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
