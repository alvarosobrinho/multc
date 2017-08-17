<%@ page import="java.sql.*" %>
<%@ page import="java.util.*"%>
<%@ page import="br.com.multicare.medico.dao.*"%>
<%@ page import="br.com.multicare.medico.javabeans.*"%>
<html>
  <body>
    <table>
      <%
      MedicoDao dao = new MedicoDao();
      List<Medico> medicos = dao.getLista();
      
      for (Medico medico : medicos ) {
      %>
        <tr>
          <td><%=medico.getNome() %></td> 
          <td><%=medico.getEmail() %></td>
          <td><%=medico.getEndereco() %></td>
          <td><%=medico.getCrm() %></td>
          <td><%=medico.getCpf() %></td>
        </tr>
      <%
      }
      %>
    </table>
  </body>
</html>