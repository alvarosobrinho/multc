<%@ page import="java.sql.*" %>
<%@ page import="java.util.*"%>
<%@ page import="br.com.multicare.medico.factory.*" %>
<html>
<body>

		<%
		Connection connection = new ConnectionFactory().getConnection();	
		System.out.println("Conexão aberta!");
		connection.close();
		%>
	
</body>
</html>