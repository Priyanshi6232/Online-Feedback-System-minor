<%-- 
    Document   : viewFeedback
    Created on : Dec 16, 2024, 11:43:56 AM
    Author     : Priyanshi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
    <h1>Feedback List</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Message</th>
            <th>Submitted At</th>
        </tr>
        <%
            java.util.List<models.Feedback> feedbackList = (java.util.List<models.Feedback>) request.getAttribute("feedbackList");
            if (feedbackList != null) {
                for (models.Feedback feedback : feedbackList) {
        %>
        <tr>
            <td><%= feedback.getId() %></td>
            <td><%= feedback.getName() %></td>
            <td><%= feedback.getEmail() %></td>
            <td><%= feedback.getMessage() %></td>
            <td><%= feedback.getSubmittedAt() %></td>
        </tr>
        <% 
                }
            } 
        %>
    </table>
</body>
</html>

