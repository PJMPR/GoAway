package web;

import domain.model.Country;
import domain.model.Client;
import domain.model.Tour;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/tourServlet")
public class tourServlet extends HttpServlet{

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	HttpSession session = request.getSession();
    	
    	Tour tour = new Tour();
		tour.setCountryTo(request.getParameter("countryTo"));
		tour.setAmountOfDays(request.getParameter("amountOfDays"));
		session.setAttribute("tour", tour);
		response.sendRedirect("final.jsp");
	}
}