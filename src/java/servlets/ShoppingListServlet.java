/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

/**
 *
 * @author 14686
 */
public class ShoppingListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/WEB-INF/register.jsp")
                .forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ArrayList<String> items = new ArrayList<>();

        HttpSession session = request.getSession();
        session.getAttribute("username");
        String username = request.getParameter("username");
        String item = request.getParameter("itemIn");
        items.add(item);

        session.setAttribute("username", username);

        String op = request.getParameter("action");
        switch (op) {

            case "add":
                items.add(request.getParameter("itemIn"));

                request.setAttribute("username", username);

                session.setAttribute("item", items.get(0));

                break;
            case "delete":
                session.removeAttribute("item");
                break;
            default:
                break;

        }
//        for(int i=0;i<= items.size();i++){
//                session.setAttribute("test", items.get(i));
//                session.setAttribute("item", items.get(i));}
        getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request, response);

    }

}
