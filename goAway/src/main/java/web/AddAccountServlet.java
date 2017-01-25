package web;

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

import domain.model.Client;
import domain.model.Country;
import domain.model.EnumDictionary;
import domain.model.Tour;

import java.math.BigDecimal;

@WebServlet("/AddAccountServlet")
public class AddAccountServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, 	HttpServletResponse resp)throws ServletException, IOException {
	
    String name = req.getParameter("currency");
    BigDecimal value = new BigDecimal(req.getParameter("value"));
    HttpSession session = req.getSession();
	Client client = (Client) session.getAttribute(SessionKey.client);
    Tour tour = new Tour();
    tour.setCountry(Country.valueOf(name));
    tour.setAsset(value);
    tour.setClient(client);
	
	List<Tour> tours = (List<Tour>) session.getAttribute(SessionKey.tours);
	if(tours == null)
	{
		tours = new ArrayList<Tour>();
		tours.add(tour);
		session.setAttribute(SessionKey.tours, tours);
	}
	else
	{
		tours.add(tour);
	}
	resp.sendRedirect("addTour.html");
}
}
