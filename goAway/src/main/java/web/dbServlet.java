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
import domain.model.Tour;
import domain.model.Client;

@WebServlet("/dbServlet")
public class dbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public dbServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		try {
			IRepositoryCatalog catalog = new RepositoryCatalog("jdbc:hsqldb:hsql://localhost/workdb");
			HttpSession session = request.getSession();
			Client client = (Client) session.getAttribute("client");
			Tour tour = (Tour) session.getAttribute("tour");
			
			catalog.Clients().add(client);
			catalog.saveAndClose();
			//int clientId = catalog.Clients().getLastId();
			//client.setId(clientId);
			
			catalog.Tours().add(tour);
			catalog.saveAndClose();
			//int tourId = catalog.Tours().getLastId();
			//tour.setId(tourId);
			catalog.saveAndClose();
			
			response.sendRedirect("index.html");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException a) {
			// TODO Auto-generated catch block
			a.printStackTrace();	
	} 
	}
	}
