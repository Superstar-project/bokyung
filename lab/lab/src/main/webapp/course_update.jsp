<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<link href="style.css?after" rel="stylesheet" type="text/css">
<meta charset="UTF-8">
<title>강의정보 수정</title>
</head>
<body>
	<%@ include file="user.jsp"%>
	<%@ include file="top_prof.jsp"%>
	<br>
	<%
	Connection myConn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	String mySQL = "";
	PreparedStatement pstmt = null;
	int nYear = 0;
	int nSemester = 0;
	
	String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "leebk";
	String passwd = "1124";
	String dbdriver = "oracle.jdbc.driver.OracleDriver"; 
	
	try {
		Class.forName(dbdriver);
		myConn = DriverManager.getConnection(dburl, user, passwd);
		myConn.setAutoCommit(false);
		stmt = myConn.createStatement();
		
		CallableStatement cstmt = myConn.prepareCall("{? = call Date2EnrollYear(SYSDATE)}");
		cstmt.registerOutParameter(1, java.sql.Types.INTEGER);
		cstmt.execute();
		nYear = cstmt.getInt(1)-2000;
		
		CallableStatement cstmt2 = myConn.prepareCall("{? = call Date2EnrollSemester(SYSDATE)}");
		cstmt2.registerOutParameter(1, java.sql.Types.INTEGER);
		cstmt2.execute();
		nSemester = cstmt2.getInt(1);
		%>
	<script>document.getElementById('semesterInfo').innerHTML = "<%=nYear%>년  <%=nSemester%>학기";</script>
	<%
	} catch (SQLException ex) {
		System.err.println("SQLException: " + ex.getMessage());
	} catch (ClassNotFoundException ex) {
		System.err.println("ClassNotFoundException: " + ex.getMessage());
	} finally{
	      if(stmt != null)
		         try{myConn.commit(); stmt.close();
		         }catch(SQLException e){System.err.println("SQLException: " + e.getMessage());}
		   }
	%>
	
	<br>
	<br>

	<div>
		<input type="text" id="semesterInfo"
			value="<%= nYear %>년 <%= nSemester %>학기" readonly></input>
	</div>

	<br>
	<br>
	
	<%
	
 	mySQL = "select t.t_id, c.c_id, c.c_id_no, c.c_name, t.t_time, t.t_loc, t.t_max, t.p_id from teach t, course c where p_id = '" 
 			+ session_id 
 			+ "' and t.c_id = c.c_id and t.c_id_no = c.c_id_no and t_year = ? and t_semester = ?";
	
	
	pstmt = myConn.prepareStatement(mySQL);
	pstmt.setInt(1, nYear);
	pstmt.setInt(2, nSemester);
  	rs = pstmt.executeQuery();
	%>
	
	<table width="70%" align="center" class = "deleteTable" border>
	 <form method="post" action="course_update_inside.jsp"> 
		<br>
		<tr>
			<th>수업번호</th>
			<th>과목번호</th>
			<th>분반</th>
			<th>과목명</th>
			<th>교시</th>
			<th>장소</th>
			<th>수강정원</th>
			<th>수정</th>
		</tr>
		<%
		
		while (rs.next()) {
			String tid = rs.getString("t_id");
			String cid = rs.getString("c_id");
			Integer cidno = rs.getInt("c_id_no");
			String cname = rs.getString("c_name");
			Integer ttime = rs.getInt("t_time");
			String tloc = rs.getString("t_loc");
			Integer tmax = rs.getInt("t_max");
			
		%>
	
		<tr>
			<td><%=tid%></td>
			<td><%=cid%></td>
			<td><%=cidno%></td>
			<td><%=cname%></td>
			<td><%=ttime%></td>
			<td><%=tloc%></td>
			<td><%=tmax%></td>
			<td><a id="Wcolor"
				href="course_update_inside.jsp?t_id=<%=tid%>">
					수정 </a></td>
			<td>
				<input type="hidden" name="teachId" value=<%=tid%>>
				<input type="hidden" name="teachLoc" value=<%=tloc%>>
				<input type="hidden" name="teachTime" value=<%=ttime%>>
				<input type="hidden" name="teachMax" value=<%=tmax%>>
			</td>
			
			
<%-- 			<td><div>
					<%=cid%>
					</div></td>
			<td><div>
					<%=cidno%>
					</div></td>
			<td padding="10 10 10 10px;"><%=cname%></td>
			<td>
				<div>
					<input type="text" name="teachTime" class="c_editable">
					</div>
					</td>
			<td>
				<div>
					<input type="text" name="teachLoc" class="c_editable">
					</div>
					</td>
			<td>
				<div>
					<input type="text" name="teachMax" class="c_editable">
					</div>
					</td>
		</tr>
		 --%>
<%-- 		<script>
			document.getElementsByName("tid")[0].innerHTML = '<%=tid%>';
			document.getElementsByName("cid")[0].innerHTML = '<%=cid%>';
			document.getElementsByName("cidno")[0].innerHTML = '<%=cidno%>';
			document.getElementsByName("cname")[0].innerHTML = '<%=cname%>';
		    document.getElementsByName("teachTime")[0].value = '<%=ttime%>';
		    document.getElementsByName("teachLoc")[0].value = "<%=tloc%>";
		    document.getElementsByName("teachMax")[0].value = "<%=tmax%>";
		</script> --%>
		
		</tr>
		</form>
		<%
	}
			
	
		%>
		
	</table>
	
	
</body>
</html>