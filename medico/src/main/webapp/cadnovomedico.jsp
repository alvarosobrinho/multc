<html>
  <head>
    <title>Tela de cadastro médico</title>
    <!-- Feito por José Carlos Pinheiro Filho, utilizando Pingento como ferramenta. -->
    <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
  </head>
  <body>
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
	          <p class="">Bem vindo ao Multicare médico.</p>
	        </div>
	      </div>
	    </div>
	  </div>
	  <div class="py-5">
	    <div class="container">
	      <div class="row">
	        <div class="col-md-6">
	          <form class="" name="formCadastrar" action="cadastrar.jsp" method = "post">
	            <div class="form-group"> <label>Nome Completo</label>
	              <input type="text" name="nome" class="form-control" placeholder="Nome"> </div>
	            <div class="form-group"> <label>Endereço</label>
	              <input type="text" name="endereco" class="form-control" placeholder="ex: Rua medico, 456, hospital, alagoas, brasil."> </div>
	            <div class="form-group"> <label>CRM</label>
	              <input type="text" name = "crm" class="form-control" placeholder="CRM"> </div>
	            <div class="form-group"> <label>CPF</label>
	              <input type="text" name="cpf" class="form-control" placeholder="ex: 12345678995"> </div>
	            <div class="form-group"> <label>Email</label>
	             <input type="email" name="email" class="form-control" placeholder="ex: multicare@multi.com"></div>
	            <div class="form-group"> <label>Senha</label>
	              <input type="password" name="senha" class="form-control" placeholder="senha"> </div>
	            <button type="submit" class="btn btn-primary">Cadastrar</button>
	          </form>
	        </div>
	      </div>
	    </div>
	  </div>
    <script src="http://code.jquery.com/jquery-latest.js"></script>
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>