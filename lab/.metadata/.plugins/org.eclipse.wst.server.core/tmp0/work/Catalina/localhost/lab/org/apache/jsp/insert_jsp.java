/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.75
 * Generated at: 2023-06-16 10:29:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class insert_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/top.jsp", Long.valueOf(1686846378000L));
    _jspx_dependants.put("/user.jsp", Long.valueOf(1686846529000L));
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link href=\"style.css?after\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>수강신청 입력</title>\n");
      out.write("<script\n");
      out.write("	src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
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
      out.write("	<br>\n");
      out.write("	");
 if (session_id == null) response.sendRedirect("login.jsp"); 
      out.write("\n");
      out.write("	<br>\n");
      out.write("	<b><div id=\"semesterInfo\"></div></b>\n");
      out.write("	");

   String driver = "oracle.jdbc.driver.OracleDriver";
   String url = "jdbc:oracle:thin:@localhost:1521:xe";
   String user = "leebk";
   String password = "1124";
   
   Connection myConn = null;
   Statement stmt = null;
   
   PreparedStatement pstmt = null;
   PreparedStatement pstmt2 = null;
   int nEnrollStudent = 0;
   
   String nSQL = "";
   String mySQL = "";
   String majorSQL = "";
   String loginMajor = "";
   ResultSet myResultSet = null;
   ResultSet majorResultSet = null;
   ResultSet enrollSet = null;
   
   int currentTab = 0;
   int sem = 0; 
   int nYear = 0;
   int nSemester = 0;
   
   try{
      Class.forName(driver);
      myConn = DriverManager.getConnection(url, user, password);
      myConn.setAutoCommit(false);
      stmt = myConn.createStatement();
      pstmt = myConn.prepareStatement //테이블 출력 pstmt
            ("select c.c_id, c.c_id_no, c_name, c_unit, c_major, t.t_id, t_time, p.p_name, t_loc, t_max" 
      + " from course c, teach t, professor p where c.c_id = t.c_id and c.c_id_no = t.c_id_no and p.p_id = t.p_id"
      + " and t_year = ? and t_semester = ? and c_major LIKE ? ORDER BY c.c_id");
   }catch(ClassNotFoundException e){
      System.out.println("jdbc driver 로딩 실패");
   }catch(SQLException e){
      System.out.println("오라클 연결 실패");
   }
   //현 학기에 해당하는 과목만 보여주기
   CallableStatement cstmt = myConn.prepareCall("{? = call Date2EnrollYear(SYSDATE)}"); //stored function 이용
   cstmt.registerOutParameter(1, java.sql.Types.INTEGER);
   CallableStatement cstmt2 = myConn.prepareCall("{? = call Date2EnrollSemester(SYSDATE)}");
   cstmt2.registerOutParameter(1, java.sql.Types.INTEGER);
   try{
      cstmt.execute();
      cstmt2.execute();
      nYear = cstmt.getInt(1);
      nSemester = cstmt2.getInt(1);
       sem = nYear * 10 + nSemester; 
      
      out.write("<script>document.getElementById('semesterInfo').innerHTML = \"");
      out.print(nYear);
      out.write('년');
      out.write(' ');
      out.write(' ');
      out.print(nSemester);
      out.write("\n");
      out.write("							학기\";\n");
      out.write("						</script>\n");
      out.write("	");

   }catch(SQLException e){
      System.err.println("SQLException: " + e.getMessage());
   }finally{
      if(cstmt != null)
         try{myConn.commit(); cstmt.close();
         }catch(SQLException e){System.err.println("SQLException: " + e.getMessage());}
   }
   //login 사용자의 전공
   majorSQL = "select s_major from student where s_id = '" + session_id + "'";
   majorResultSet = stmt.executeQuery(majorSQL);
   if(majorResultSet.next()){
      loginMajor = majorResultSet.getString(1);   
   }
      out.write("\n");
      out.write("	<div class=\"tab_menu_container\" align=\"center\">\n");
      out.write("		<br>\n");
      out.write("		<button class=\"menu_btn\">전체</button>\n");
      out.write("		<button class=\"menu_btn\">전공</button>\n");
      out.write("		<button class=\"menu_btn\">교양</button>\n");
      out.write("		<button class=\"menu_btn\">타전공</button>\n");
      out.write("	</div>\n");
      out.write("	<br>\n");
      out.write("	");
 for(int i = 0; i < 4; i++){
      out.write('\n');
      out.write('	');

         String indexName = "box_" + i;
      out.write("\n");
      out.write("	<table width=\"70%\" align=\"center\" class=\"tab_box deleteTable\"\n");
      out.write("		id=\"");
      out.print(indexName);
      out.write("\" border>\n");
      out.write("\n");
      out.write("		");
if(i == 0){
            pstmt.setInt(1, nYear-2000); 
            pstmt.setInt(2, nSemester);
            pstmt.setString(3, "%");
         }
		
         else if(i == 1){
             pstmt.setInt(1, nYear-2000); 
             pstmt.setInt(2, nSemester);
            pstmt.setString(3, loginMajor);   

         }
		
         else if(i == 2){
             pstmt.setInt(1, nYear-2000); 
             pstmt.setInt(2, nSemester);
            pstmt.setString(3, "교양");   

         }
         else if(i == 3){
             pstmt.setInt(1, nYear-2000); 
             pstmt.setInt(2, nSemester);
            pstmt.setString(3, "%");   
         }
			
         
      out.write("\n");
      out.write("		<tr>\n");
      out.write("			<th>과목번호</th>\n");
      out.write("			<th>분반</th>\n");
      out.write("			<th>과목명</th>\n");
      out.write("			<th>학점</th>\n");
      out.write("			<th>주관학과</th>\n");
      out.write("			<th>시간</th>\n");
      out.write("			<th>교수</th>\n");
      out.write("			<th>강의실</th>\n");
      out.write("			<th>수강인원</th>\n");
      out.write("			<th>정원</th>\n");
      out.write("			<th>수강신청</th>\n");
      out.write("			<th>장바구니</th>\n");
      out.write("\n");
      out.write("		</tr>\n");
      out.write("\n");
      out.write("		");
 myResultSet = pstmt.executeQuery();

         if(myResultSet != null){
            while(myResultSet.next()){
               String c_id = myResultSet.getString(1);
               int c_id_no = myResultSet.getInt(2);
               String c_name = myResultSet.getString(3);
               int c_unit = myResultSet.getInt(4);
               String c_major = myResultSet.getString(5);
               String t_id = myResultSet.getString(6);
               int t_time = myResultSet.getInt(7);
               String p_name = myResultSet.getString(8);
               String t_loc = myResultSet.getString(9);
               int t_max = myResultSet.getInt(10);

               if(i==3){
                  if(c_major.equals(loginMajor) || c_major.equals("교양"))  
                	  continue;
            	}
            	
            	nSQL = "select COUNT(*) cnt from enroll where t_id = '" + t_id + "' and e_year = ? and e_semester = ?";
				pstmt2 = myConn.prepareStatement(nSQL);
				pstmt2.setInt(1, nYear-2000);
				pstmt2.setInt(2, nSemester);
				enrollSet = pstmt2.executeQuery();
				
				if (enrollSet != null) {
					while (enrollSet.next()) {
						nEnrollStudent = enrollSet.getInt(1);
					}
				}
      out.write("\n");
      out.write("		<tr>\n");
      out.write("			<td>");
      out.print(myResultSet.getString(1) );
      out.write("</td>\n");
      out.write("			<td>");
      out.print(c_id_no );
      out.write("</td>\n");
      out.write("			<td>");
      out.print(c_name );
      out.write("</td>\n");
      out.write("			<td>");
      out.print(c_unit );
      out.write("</td>\n");
      out.write("			<td>");
      out.print(c_major );
      out.write("</td>\n");
      out.write("			<td>");
      out.print(t_time );
      out.write("</td>\n");
      out.write("			<td>");
      out.print(p_name );
      out.write("</td>\n");
      out.write("			<td>");
      out.print(t_loc );
      out.write("</td>\n");
      out.write("			<td>");
      out.print(nEnrollStudent );
      out.write("</td>\n");
      out.write("			<td>");
      out.print(t_max );
      out.write("</td>\n");
      out.write("			<td><a id=\"Wcolor\"\n");
      out.write("				href=\"insert_verify.jsp?c_id=");
      out.print(c_id);
      out.write("&c_id_no=");
      out.print(c_id_no);
      out.write("\">신청</a></td>\n");
      out.write("			<td><a id=\"Wcolor\"\n");
      out.write("				href=\"cart_verify.jsp?c_id=");
      out.print(c_id);
      out.write("&c_id_no=");
      out.print(c_id_no);
      out.write("\"\n");
      out.write("				class=\"cartHeart\">💚</a></td>\n");
      out.write("		</tr>\n");
      out.write("		");
}
         }
      out.write("\n");
      out.write("	</table>\n");
      out.write("	");
}
      out.write('\n');
      out.write('	');

   pstmt.close();
   stmt.close();
   myConn.close();

      out.write("\n");
      out.write("	<script>\n");
      out.write("		$('.tab_box').hide();\n");
      out.write("		$('#box_0').show();\n");
      out.write("		$('.menu_btn').on('click', function() {\n");
      out.write("			$('.menu_btn').removeClass('on');\n");
      out.write("			$(this).addClass('on')\n");
      out.write("			var idx = $('.menu_btn').index(this);\n");
      out.write("			$('.tab_box').hide();\n");
      out.write("			$('#box_' + idx).show();\n");
      out.write("		});\n");
      out.write("		/* $(function() {\n");
      out.write("		    $('.cartHeart').click(function() {\n");
      out.write("		    	\n");
      out.write("		        alert($(this).text());\n");
      out.write("		        return false;\n");
      out.write("		    });\n");
      out.write("		}); */\n");
      out.write("\n");
      out.write("		/* 	const changeText = document.querySelector(\"#cartHeart\");\n");
      out.write("\n");
      out.write("		 changeText.addEventListener(\"click\", function() {\n");
      out.write("		 changeText.textContent = \"Text has been changed!\";\n");
      out.write("		 }); */\n");
      out.write("	</script>\n");
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
