package controllers;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Feedback;
import models.FeedbackDAO;

@WebServlet("/viewFeedback")
public class ViewFeedbackServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        FeedbackDAO feedbackDAO = new FeedbackDAO();
        List<Feedback> feedbackList = feedbackDAO.getAllFeedback();
        
        request.setAttribute("feedbackList", feedbackList);
        request.getRequestDispatcher("viewFeedback.jsp").forward(request, response);
    }
}
