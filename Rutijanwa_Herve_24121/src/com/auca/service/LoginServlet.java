package com.auca.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private static final String CORRECT_USERNAME = "Rutijanwa";
    private static final String CORRECT_PASSWORD = "1234";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String iusername = request.getParameter("username");
        String ipassword = request.getParameter("password");

        if (iusername.equals(CORRECT_USERNAME) && ipassword.equals(CORRECT_PASSWORD)) {
            // Successful login, redirect to the user's profile or dashboard.
            response.sendRedirect("profile.html");
        } else {
            // Incorrect credentials, redirect to the "Forgot Password" page.
            response.sendRedirect("forgot_password.html");
        }
    }
}
