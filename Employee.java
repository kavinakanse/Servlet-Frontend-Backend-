package com.servletemp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/EmpInfo")
public class Employee extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String date = req.getParameter("date");
		String gender = req.getParameter("gender");
		String status = req.getParameter("staus");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String contact = req.getParameter("contact");
		String city = req.getParameter("city");
		String country = req.getParameter("country");
		String role = req.getParameter("role");
		String joining_date = req.getParameter("joining_date");
		String salary = req.getParameter("salary");
		String experience = req.getParameter("experience");
		
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(date);
		System.out.println(gender);
		System.out.println(status);
		System.out.println(email);
		System.out.println(password);
		System.out.println(contact);
		System.out.println(city);
		System.out.println(country);
		System.out.println(role);
		System.out.println(joining_date);
		System.out.println(salary);
		System.out.println(experience);
		
		PrintWriter out = resp.getWriter();
		out.println(fname);
		out.println(lname);
		out.println(date);
		out.println(gender);
		out.println(status);
		out.println(email);
		out.println(password);
		out.println(contact);
		out.println(city);
		out.println(country);
		out.println(role);
		out.println(joining_date);
		out.println(salary);
		out.println(experience);
	}
}
