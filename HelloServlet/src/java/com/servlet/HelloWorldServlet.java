/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author PaulRyan
 */
public class HelloWorldServlet extends HttpServlet  {
    public void init() throws ServletException {
    
    }
    
    public void destroy() {
    
    }
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String course = request.getParameter("course");
        String[] langs = request.getParameterValues("lang");
        String boxer = request.getParameter("boxer");
        
        PrintWriter out = response.getWriter();
        out.println("<h1><i>Hello "+name+"! Hello Everybody! Hola hola!</i></h1>");
        out.println("<h3>Are you sure you are gonna Graduate as "+course+"?</h3>");
        
        if(langs == null) {
            out.println("<h3>No languages to learn.</h3>");
        }
        
        else if (langs.length != 0) {
            out.println("<h3>You need to learn the following languages first.</h3>");
            for(int x = 0; x < langs.length; x++) {
                out.println("<h4>"+langs[x]+"</h4>");
            }
        }
        
        out.println("<h4>Your favorite boxer is ");
        if(boxer.equals("Pacman")) {
            out.println("Manny Pacquiao</h4>");
        }
        else if(boxer.equals("Money")) {
            out.println("Floyd Mayweather Jr.</h4>");
        }
        
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
    
}
