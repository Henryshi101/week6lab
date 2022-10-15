/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
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

    ArrayList<String> shoppingItems = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/WEB-INF/register.jsp")
                .forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        session.setAttribute("shoppingItems", shoppingItems);
        String url = "";
        String username = request.getParameter("username");
        String shoppingItem = request.getParameter("itemIn");

        String op = request.getParameter("action");
        switch (op) {

            case "register":
                if (username != null && !username.isEmpty()) {

                    session.setAttribute("username", "hello " + username + "!");
                    shoppingItems.clear();
                    session.removeAttribute("shoppingItems");

                    url = "/WEB-INF/shoppingList.jsp";
                } else {
                    url = "/WEB-INF/register.jsp";
                }
                break;

            case "add":
                if (shoppingItem != null && !shoppingItem.isEmpty()) {
                    shoppingItems.add(shoppingItem);
                    session.setAttribute("shoppingItem", shoppingItems.get(0));
                    url = "/WEB-INF/shoppingList.jsp";
                } else {
                    url = "/WEB-INF/shoppingList.jsp";
                }
                break;

            case "delete":
                shoppingItems.remove(0);
                session.removeAttribute("shoppingItem");
                url = "/WEB-INF/shoppingList.jsp";
                break;

            case "logout":
                session.invalidate();
                url = "/WEB-INF/register.jsp";
                break;

            default:
                break;

        }
        getServletContext().getRequestDispatcher(url).forward(request, response);

    }

}
