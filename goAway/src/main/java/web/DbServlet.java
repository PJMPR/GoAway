package web;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.RepositoryCatalog;
import dao.repositories.IRepositoryCatalog;
import domain.model.Client;
import domain.model.Tour;

@WebServlet("/DbServlet")
public class DbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DbServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		try {
			IRepositoryCatalog catalog = new RepositoryCatalog("jdbc:hsqldb:hsql://localhost/workdb");
			HttpSession session = request.getSession();
			Client client = (Client) session.getAttribute("client");
			List<Tour> tours = (List<Tour>) session.getAttribute("tours");
			catalog.Clients().add(client);
			catalog.save();
			int clientId = catalog.Clients().getLastId();
			client.setId(clientId);
			for(Tour tour: tours){
				tour.setClient(client);
				catalog.Tours().add(tour);
				catalog.save();
				tour.setId(catalog.Tours().getLastId());
				Tour log = new Tour();
				log.setAmount((double)tour.getAsset().floatValue());
				log.setDate(new Date(new java.util.Date().getTime()));
				log.setRate(1.0);
				log.setFrom(tour);
                log.setTo(tour);
			}
			catalog.saveAndClose();
			session.removeAttribute("person");
			session.removeAttribute("wallets");
			response.sendRedirect("index.html");
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

}
