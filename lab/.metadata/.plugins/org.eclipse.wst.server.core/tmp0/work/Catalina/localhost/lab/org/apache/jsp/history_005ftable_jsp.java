/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.75
 * Generated at: 2023-06-07 22:21:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class history_005ftable_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/top.jsp", Long.valueOf(1686064075000L));
    _jspx_dependants.put("/user.jsp", Long.valueOf(1685562014000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("<title>개별수강 이력</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("request.setCharacterEncoding(\"utf-8\");\n");
      out.write("	");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link href=\"style.css?after\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("</head>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<table class=\"top\" width=\"500px\" align=\"right\">\n");
      out.write("	<tr>\n");
      out.write("		<td>\n");
      out.write("			");
 String session_id = (String) session.getAttribute("user");
		if (session_id == null) {
      out.write("\n");
      out.write("			<p>로그인을 해주세요.</p> ");
} else {
      out.write("\n");
      out.write("			<p>");
      out.print(session_id);
      out.write("님 방문을 환영합니다.\n");
      out.write("			</p>\n");
      out.write("		</td>\n");
      out.write("		<td>\n");
      out.write("			");
 if (session_id.length() == 7) {
      out.write(" <a href=\"update.jsp\">마이페이지</a> ");
} else if (session_id.length() == 5) {
      out.write("\n");
      out.write("			<a href=\"update_prof.jsp\">마이페이지</a> ");
 }
		else { 
      out.write("\n");
      out.write("			<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p>\n");
      out.write("			");
} 
      out.write(' ');
}
      out.write("\n");
      out.write("		</td>\n");
      out.write("		<td>\n");
      out.write("			");
 String log;
if (session_id == null)
log = "<a href=login.jsp>로그인</a>";
else log = "<a href=logout.jsp>로그아웃</a>"; 
      out.write("\n");
      out.write("			<p class=\"title\">");
      out.print(log);
      out.write("</p>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("		</td>\n");
      out.write("\n");
      out.write("		<td></td>\n");
      out.write("	</tr>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');
      out.write('	');
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link href = \"style.css?after\" rel = \"stylesheet\" type = \"text/css\">\n");
      out.write("</head>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<div class = \"topButton\">\n");
      out.write("<table class=\"top\" width=\"75%\" align=\"center\">\n");
      out.write("	<tr>\n");
      out.write("		<td><a href=\"all_course.jsp\">전체과목 조회</a></td>\n");
      out.write("		<td><a href=\"insert.jsp\">수강신청 입력</a></td>\n");
      out.write("		<td><a href=\"delete.jsp\">수강신청 조회</a></td>\n");
      out.write("		<td><a href=\"select.jsp\">장바구니</a></td>\n");
      out.write("		<td><a href=\"history.jsp\">개별수강 이력</a></td>\n");
      out.write("	</tr>\n");
      out.write("</table>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write('\n');
      out.write('	');

	if (session_id == null)
		response.sendRedirect("login.jsp");
	
      out.write("\n");
      out.write("	<br>\n");
      out.write("	<br>\n");
      out.write("	<br>\n");
      out.write("	<table width=\"70%\" align=\"center\" class = \"deleteTable\" border>\n");
      out.write("		<br>\n");
      out.write("		<tr>\n");
      out.write("			<th>수업번호</th>\n");
      out.write("			<th>과목명</th>\n");
      out.write("			<th>학년도</th>\n");
      out.write("			<th>학기</th>\n");
      out.write("			<th>학점</th>\n");
      out.write("		</tr>\n");
      out.write("		");

		Connection myConn = null;
		Statement stmt = null;
		ResultSet myResultSet = null;
		String mySQL = "";
		int totalnum = 0;
		int totalnum2 = 0;
		
		PreparedStatement pstmt = null;
		int nYear = 0;
		int nSemester = 0;
		int year = Integer.parseInt(request.getParameter("year"));
		int semester = Integer.parseInt(request.getParameter("semester"));

		String dbdriver = "oracle.jdbc.OracleDriver";
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "leebk";
		String passwd = "1124";

		try {
			Class.forName(dbdriver);
			myConn = DriverManager.getConnection(dburl, user, passwd);
			stmt = myConn.createStatement();
			
			CallableStatement cstmt = myConn.prepareCall("{? = call Date2EnrollYear(SYSDATE)}");
			cstmt.registerOutParameter(1, java.sql.Types.INTEGER);
			cstmt.execute();
			nYear = cstmt.getInt(1)-2000;
			
			CallableStatement cstmt2 = myConn.prepareCall("{? = call Date2EnrollSemester(SYSDATE)}");
			cstmt2.registerOutParameter(1, java.sql.Types.INTEGER);
			cstmt2.execute();
			nSemester = cstmt2.getInt(1);
			
      out.write("\n");
      out.write("			<script>document.getElementById('enrollS').innerHTML = \"");
      out.print(nYear);
      out.write('년');
      out.write(' ');
      out.write(' ');
      out.print(nSemester);
      out.write("학기\";</script>\n");
      out.write("			");

		} catch (SQLException ex) {
			System.err.println("SQLException: " + ex.getMessage());
		}
		
		
      out.write("\n");
      out.write("\n");
      out.write("		<div>\n");
      out.write("			<input type=\"text\" id=\"enrollS\" align=\"center\" style=\"font-weight: bold;\"\n");
      out.write("				value=\"");
      out.print( nYear );
      out.write('년');
      out.write(' ');
      out.print( nSemester );
      out.write("학기\" readonly></input>\n");
      out.write("		</div>\n");
      out.write("	\n");
      out.write("		<br>\n");
      out.write("		<br>\n");
      out.write("\n");
      out.write("		\n");
      out.write("		<br>\n");
      out.write("		<br>\n");
      out.write("		<br>\n");
      out.write("\n");
      out.write("		");

		System.out.println(year);
		System.out.println(semester);
		mySQL = "select e.c_id, c.c_name, e.e_year, e.e_semester, h.h_score FROM history h, course c, enroll e where h.e_id = e.e_id and e.c_id = c.c_id and e.c_id_no = c.c_id_no and s_id = '"
				+ session_id + "' and e_year = " + year + "and e_semester = " + semester;

		myResultSet = stmt.executeQuery(mySQL);

		if (myResultSet != null) {
			while (myResultSet.next()) {
				String c_id = myResultSet.getString("c_id");
				String c_name = myResultSet.getString("c_name");
				int e_year = myResultSet.getInt("e_year");
				int e_semester = myResultSet.getInt("e_semester");
				String h_score = myResultSet.getString("h_score");

				CallableStatement cstmt = myConn.prepareCall("{call MajorCount(?,?,?)}");
				cstmt.setString(1, session_id);
				cstmt.registerOutParameter(2, java.sql.Types.INTEGER);
				cstmt.registerOutParameter(3, java.sql.Types.INTEGER);

				try {
				cstmt.execute();
				totalnum = cstmt.getInt(2);
				totalnum2 = cstmt.getInt(3);

		} catch (SQLException ex) {
		System.err.println("SQLException: " + ex.getMessage());
		}
		
      out.write("\n");
      out.write("		<tr>\n");
      out.write("			<td>");
      out.print(c_id);
      out.write("</td>\n");
      out.write("			<td>");
      out.print(c_name);
      out.write("</td>\n");
      out.write("			<td>");
      out.print(e_year);
      out.write("</td>\n");
      out.write("			<td>");
      out.print(e_semester);
      out.write("</td>\n");
      out.write("			<td>");
      out.print(h_score);
      out.write("</td>\n");
      out.write("\n");
      out.write("		</tr>\n");
      out.write("		");

		}
		}
		stmt.close();
		myConn.close();
		
      out.write("\n");
      out.write("	</table>\n");
      out.write("	<br>\n");
      out.write("	<br>\n");
      out.write("\n");
      out.write("<div id=\"CountInfo\" align=\"center\" style=\"font-weight: bold;\">\n");
      out.write("		총 이수 학점 <br><br> 전공 :\n");
      out.write("		");
      out.print(totalnum);
      out.write("학점 &nbsp;&nbsp; /  &nbsp;&nbsp; 교양 :\n");
      out.write("		");
      out.print(totalnum2);
      out.write("학점 &nbsp;&nbsp;&nbsp;\n");
      out.write("	</div>\n");
      out.write("	\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}