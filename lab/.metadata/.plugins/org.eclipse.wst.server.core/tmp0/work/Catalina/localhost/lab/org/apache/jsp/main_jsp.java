/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.75
 * Generated at: 2023-06-15 17:22:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/top.jsp", Long.valueOf(1686846378000L));
    _jspx_dependants.put("/top_prof.jsp", Long.valueOf(1686846367000L));
    _jspx_dependants.put("/user.jsp", Long.valueOf(1686846529000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link href=\"style.css?after\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>수강신청</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
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
      out.write("				<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p> ");
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
      out.write("		</td>\n");
      out.write("\n");
      out.write("		<td></td>\n");
      out.write("	</tr>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');
      out.write('	');
if (session_id != null) {
	 	if (session_id.length()==7) { 
      out.write('\n');
      out.write('	');
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link href=\"style.css?after\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("</head>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<div class=\"topButton\">\n");
      out.write("	<table class=\"top\" width=\"75%\" align=\"center\">\n");
      out.write("		<tr>\n");
      out.write("			<td><a href=\"all_course.jsp\">전체과목 조회</a></td>\n");
      out.write("			<td><a href=\"insert.jsp\">수강신청 입력</a></td>\n");
      out.write("			<td><a href=\"delete.jsp\">수강신청 조회</a></td>\n");
      out.write("			<td><a href=\"cart.jsp\">장바구니</a></td>\n");
      out.write("			<td><a href=\"history.jsp\">개별수강 이력</a></td>\n");
      out.write("		</tr>\n");
      out.write("	</table>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("	<h2 class=\"mainTitle\">ENROLL</h2>\n");
      out.write("	");
 } else if (session_id.length() == 5) { 
      out.write('\n');
      out.write('	');
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link href=\"style.css?after\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("</head>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<div class=\"topButton\">\n");
      out.write("	<table class=\"top\" width=\"75%\" align=\"center\">\n");
      out.write("		<tr>\n");
      out.write("			<td>강의 조회</td>\n");
      out.write("			<td><a href=\"course_update.jsp\">강의 수정</a></td>\n");
      out.write("			<td><a href=\"student_prof.jsp\">수강신청학생 조회</a></td>\n");
      out.write("			<td>지도학생 조회</td>\n");
      out.write("			<td>공지사항</td>\n");
      out.write("		</tr>\n");
      out.write("	</table>\n");
      out.write("</div>");
      out.write("\n");
      out.write("	<h2 class=\"mainTitle\">COURSE</h2>\n");
      out.write("	");
 } }
	else { 
      out.write('\n');
      out.write('	');
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link href=\"style.css?after\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("</head>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<div class=\"topButton\">\n");
      out.write("	<table class=\"top\" width=\"75%\" align=\"center\">\n");
      out.write("		<tr>\n");
      out.write("			<td><a href=\"all_course.jsp\">전체과목 조회</a></td>\n");
      out.write("			<td><a href=\"insert.jsp\">수강신청 입력</a></td>\n");
      out.write("			<td><a href=\"delete.jsp\">수강신청 조회</a></td>\n");
      out.write("			<td><a href=\"cart.jsp\">장바구니</a></td>\n");
      out.write("			<td><a href=\"history.jsp\">개별수강 이력</a></td>\n");
      out.write("		</tr>\n");
      out.write("	</table>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("	<h2 class=\"mainTitle\">ENROLL</h2>\n");
      out.write("	");
 }
      out.write("\n");
      out.write("\n");
      out.write("	<script type=\"text/javascript\">\n");
      out.write("		const cursor = document.querySelector(\".cursor\");\n");
      out.write("		var timeout;\n");
      out.write("		\n");
      out.write("		document.addEventListener(\"mousemove\", (e) => {\n");
      out.write("			let x = e.pageX;\n");
      out.write("		let y = e.pageY;\n");
      out.write("		\n");
      out.write("		cursor.style.top = y + \"px\";\n");
      out.write("		cursor.style.left = x + \"px\";\n");
      out.write("		cursor.style.display = \"block\";\n");
      out.write("		\n");
      out.write("		function mouseStopped() {\n");
      out.write("			cursor.style.display = \"none\";\n");
      out.write("		}\n");
      out.write("		clearTimeOut(timeout);\n");
      out.write("		timeout = setTimeout(mouseStopped, 1000);\n");
      out.write("		});\n");
      out.write("		\n");
      out.write("		document.addEventListener(\"mouseout\", () => {\n");
      out.write("			cursor.style.display = \"none\";\n");
      out.write("		});\n");
      out.write("		</script>\n");
      out.write("</body>\n");
      out.write("</html>");
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
