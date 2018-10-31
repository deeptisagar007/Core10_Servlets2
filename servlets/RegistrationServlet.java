package com.marlabs.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegistrationServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String eName = request.getParameter("eName");
		int eId = Integer.parseInt(request.getParameter("eId"));
		int eSal = Integer.parseInt(request.getParameter("eSal"));
		int deptNo = Integer.parseInt(request.getParameter("deptNo"));

		EmployeeValueObjectModel employeeValueObjectModel = new EmployeeValueObjectModel();
		employeeValueObjectModel.seteName(eName);
		employeeValueObjectModel.seteId(eId);
		employeeValueObjectModel.seteSal(eSal);
		employeeValueObjectModel.setDeptNo(deptNo);

		boolean insertedResult = InsertEmployeeData.insertData(employeeValueObjectModel);

		if (insertedResult) {

			// System.out.println("Employee details" + employeeValueObjectModel.toString());

			response.setContentType("text/html");
			PrintWriter printWriter = response.getWriter();

			printWriter.println("<html>");
			printWriter.println("<body>");
			printWriter.println("<table>");

			printWriter.println("<tr>");
			printWriter.println("<td>");
			printWriter.println("Employee Details: " + employeeValueObjectModel.toString());
			printWriter.println("</td>");
			printWriter.println("</tr>");

			printWriter.println("<tr>");
			printWriter.println("<td>");
			printWriter.println("eName: " + eName);
			printWriter.println("</td>");
			printWriter.println("</tr>");

			printWriter.println("<tr>");
			printWriter.println("<td>");
			printWriter.println("eId: " + eId);
			printWriter.println("</td>");
			printWriter.println("</tr>");

			printWriter.println("<tr>");
			printWriter.println("<td>");
			printWriter.println("eSal: " + eSal);
			printWriter.println("</td>");
			printWriter.println("</tr>");

			printWriter.println("<tr>");
			printWriter.println("<td>");
			printWriter.println("deptNo: " + deptNo);
			printWriter.println("</td>");
			printWriter.println("</tr>");

			printWriter.println("");
			printWriter.println("</table>");

			printWriter.println("</body>");
			printWriter.println("</html>");

			// response.getWriter().append("Served at: ").append(request.getContextPath());

		} else {
			response.setContentType("text/html");
			PrintWriter printWriter = response.getWriter();

			printWriter.println("<html>");
			printWriter.println("<body>");
			printWriter.println("<p>Not Able to Insert Data</p>");
			printWriter.println("</body>");
			printWriter.println("</html>");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
