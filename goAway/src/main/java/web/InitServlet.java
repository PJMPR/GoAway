package web;

import dao.TemporaryCountryEnumHelper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/initServlet")
public class InitServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        TemporaryCountryEnumHelper temporaryCountryEnumHelper = new TemporaryCountryEnumHelper();
        temporaryCountryEnumHelper.insertCountryEnums();
    }
}