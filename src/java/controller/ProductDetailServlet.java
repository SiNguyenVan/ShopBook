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
import model.ListProduct;
import model.Product;
import model.User_Info;

/**
 *
 * @author sinan
 */
public class ProductDetailServlet extends HttpServlet {
   
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
            out.println("<title>Servlet ProductDetailServlet</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ProductDetailServlet at " + request.getContextPath () + "</h1>");
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
        request.setAttribute("product1", Instance.getProductByID("ADV02"));
        request.setAttribute("product2", Instance.getProductByID("ADV03"));
        request.setAttribute("product3", Instance.getProductByID("ADV04"));
        request.setAttribute("product4", Instance.getProductByID("ADV05"));
        request.setAttribute("product5", Instance.getProductByID("ADV06"));
        Product a =Instance.getProductByID(request.getParameter("ProductID"));
        
        if(a==null) {
            response.sendRedirect("Home");
        }
        
        request.setAttribute("product", Instance.getProductByID(request.getParameter("ProductID")));
        request.getRequestDispatcher("view/detail.jsp").forward(request, response);
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
       //User_Info user = (User_Info) request.getSession().getAttribute("account");
//       String k= request.getParameter("ProductID");
//       Product a = Instance.getProductByID(k);
//       int quan=Integer.parseInt(request.getParameter("quantity"));
//       a.setQuantity(quan);
//       a.setPrice(quan*a.getPrice());
//        System.out.println(quan);
//       if(checkProductList(a)==true) {
//            for (Product i : ListProduct.getInstance().getproductList()) {
//            if(i.getProductID().equals(a.getProductID())) {
//               i.setQuantity(quan +i.getQuantity());
//               i.setPrice(i.getPrice()*i.getQuantity());
//               break;
//              }
//            i.setPrice(i.getPrice()*i.getQuantity());
//            }
//       }else {
//          ListProduct.getInstance().add(a);
//       }
//
//        
//       request.setAttribute("success", "Add Success");
//        
//       
//     
//       
//        doGet(request, response);
        int quan=Integer.parseInt(request.getParameter("quantity"));
        String product= request.getParameter("ProductID");
        User_Info a = (User_Info) request.getSession().getAttribute("account");
        if(a==null) {
            response.sendRedirect("Login");
            return;
        }
        
        String userID =a.getUserID()+"";
        if(Instance.checkQuantity(product, quan)==false) {
            request.setAttribute("success", "Stock is not enough");
            doGet(request, response);
            return ;
        }
        
        
        Cookie [] CookieArr = request.getCookies();
         boolean exist=false;
        for (Cookie cookie : CookieArr) {
            if(ListProduct.getInstance().tachChuoi(cookie.getName().trim()).equals(product)) {
                exist=true;
                break;
            }
        }
        System.out.println(exist);
        
        if(exist==true) {
            boolean check=true;
        for (Cookie cookie : CookieArr) {
            if(ListProduct.getInstance().tachChuoi(cookie.getName()).trim().equals(product)) {
                if(ListProduct.getInstance().tachChuoi2(cookie.getName()).equals(userID)) {
                int quantityCookie = Integer.parseInt(cookie.getValue());   
                int tong =quantityCookie+quan;
              
               if(Instance.checkQuantity(product, tong)==false) {
                request.setAttribute("success", "Stock is not enough");
               // System.out.println("da chay qua day");
                doGet(request, response);
                return ;
              } 
                check=false;
                cookie.setValue(quantityCookie+quan+"");
                response.addCookie(cookie);
                break;
                 }
            }
            }
        if(check==true) {
            
                Cookie c = new Cookie(product+"!"+userID, quan+"");
                System.out.println("da chay");
                c.setMaxAge(60*60*24);
                response.addCookie(c);
        }
        }else {
             
      
                Cookie c = new Cookie(product+"!"+userID, quan+"");
                System.out.println("da chay");
                c.setMaxAge(60*60*24);
                response.addCookie(c);
        
        }
        
        System.out.println("---------");
         request.setAttribute("success", "Add Success");
          request.setAttribute("quan", quan+"");
         doGet(request, response);
    }
//    
//    boolean checkProductList(Product a) {
//         for (Product i : ListProduct.getInstance().getproductList()) {
//            if(i.getProductID().equals(a.getProductID())) {
//              return true;
//              }
//        }
//         return false;
//    }
//   
    
    

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
