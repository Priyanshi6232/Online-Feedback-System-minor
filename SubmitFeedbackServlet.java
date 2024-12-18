package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.FeedbackDAO;

@WebServlet("/submitFeedback")
public class SubmitFeedbackServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String message = request.getParameter("message");
        
        FeedbackDAO feedbackDAO = new FeedbackDAO();
        feedbackDAO.addFeedback(name, email, message);
        
        response.sendRedirect("viewFeedback");
    }
}
