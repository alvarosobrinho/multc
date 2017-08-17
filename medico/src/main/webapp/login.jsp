<html>
  <head>
    <title>Primeira tela de login</title>
    <!-- Feito por Jos� Carlos Pinheiro Filho, utilizando Pingento como ferramenta. -->
    <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
  </head>
  <body>
     <div class="py-5">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <h1 class="display-1 text-center">MultCare</h1>
            <p class="lead text-center">M�dico</p>
          </div>
        </div>
      </div>
    </div>
    <div class="py-5">
      <div class="container">
        <div class="row">
          <div class="col-md-6">
            <p class="lead">MultCare m�dico, vers�o destinada para os m�dicos monitorarem o andamento dos pacientes.
              <br>Fa�a login e tenha acesso as informa��es.</p>
          </div>
          <div class="col-md-6">
            <form class="">
              <div class="form-group w-75"> <label>E-mail</label>
                <input type="email" class="form-control" placeholder="Enter email"> </div>
              <div class="form-group w-75"> <label>Senha</label>
                <input type="password" class="form-control" placeholder="Senha"> </div>
              <button type="submit" class="btn btn-primary">Login</button>
            </form>
            <form name="formCadastro" action="cadnovomedico.jsp" method = "post">
           	 <button type="submit" class="btn btn-outline-success">Cadastrar-se</button>
            </form>
            <a href="#" class="btn btn-outline-warning">Esqueceu sua senha?</a>
          </div>
        </div>
      </div>
    </div>
    <script src="http://code.jquery.com/jquery-latest.js"></script>
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>