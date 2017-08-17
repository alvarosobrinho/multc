<%@ page import="java.sql.*" %>
<%@ page import="java.util.*"%>
<%@ page import="br.com.multicare.medico.dao.*"%>
<%@ page import="br.com.multicare.medico.javabeans.*"%>
<%@ page import="javax.servlet.*" %>
<html>
	<link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
  <body>
    	<%
    		MedicoDao dao = new MedicoDao();
    		Medico medico = new Medico();
    		medico.setNome(request.getParameter("nome"));
    		medico.setEndereco(request.getParameter("endereco"));
    		medico.setCrm(request.getParameter("crm"));
    		medico.setCpf(request.getParameter("cpf"));
    		medico.setEmail(request.getParameter("email"));
    		medico.setSenha(request.getParameter("senha"));
    		dao.adicionar(medico);
    	%>
    	<div class="py-5">
		    <div class="container">
		      <div class="row">
		        <div class="col-md-12">
		          <h1 class="display-1 text-center">Multicare</h1>
		        </div>
		      </div>
		    </div>
		  </div>
		  <div class="py-5">
		    <div class="container">
		      <div class="row">
		        <div class="col-md-12">
		          <p class="lead">Obrigado por se cadastrar no multicare, seja bem vindo, agora poderá ter acesso a informações sobre seus paciêntes.</p>
		        </div>
		      </div>
		    </div>
  		</div>
  		<div class="py-5">
	    <div class="container">
		     <div class="row">
		        <div class="col-md-12">
		        	<form action="login.jsp">
		        	  <button type="submit" class="btn btn-primary">Voltar</button>
		        	</form>
		        </div>
		      </div>
		    </div>
		  </div>	
  	<script src="http://code.jquery.com/jquery-latest.js"></script>
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>