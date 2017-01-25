package web;

import domain.model.Country;
import domain.model.Client;
import domain.model.Tour;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/final")
public class FinalOutputServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();
        
        Client client = (Client) session.getAttribute(SessionKey.client);
        Tour tour = (Tour) session.getAttribute(SessionKey.tours);

        
        resp.setContentType("text/html");
        
        resp.getWriter().println("Wszystko ok");

    }

}
