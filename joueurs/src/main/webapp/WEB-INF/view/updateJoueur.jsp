<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<link rel="stylesheet" type="text/css" href="webjars/bootstrap/4.3.1/css/bootstrap.min.css" />
	<c:url value="/css/main.css" var="jstlCss" />
	<link href="${jstlCss}" rel="stylesheet" />
	<script type="text/javascript" src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Modifier un Joueur</title>
</head>
<body>
<div class="card-body">
<form action="updateJoueur" method="post">
   <div class="form-group">
      <label class="control-label">ID Joueur :</label>
       <input type="text" name="idProduit" value="${joueur.idJoueur}" readonly class="form-control"/>
    </div>	
   <div class="form-group">
      <label class="control-label">Nom Produit :</label>
       <input type="text" name="nomJoueur" value="${joueur.nomJoueur}" class="form-control"/>
    </div>	
     <div class="form-group">
      <label class="control-label">Prenom Joueur :</label>
       <input type="text" name="prenomJoueur" value="${joueur.prenomJoueur}" class="form-control"/>
    </div>	
    <div class="form-group">
		<label class="control-label">jour de Signature:</label>
 		<input type="date" name="date" value="${formatDate}" class="formcontrol"/></div>
 		<div class="form-group">
      <label class="control-label">poste Joueur :</label>
       <input type="text" name="posteJoueur" value="${joueur.posteJoueur}" class="form-control"/>
    </div>
    <div class="form-group">
      <label class="control-label">Age Joueur :</label>
       <input type="text" name="age" value="${joueur.age}" class="form-control"/>
    </div>
    <div>
 		  <button type="submit" class="btn btn-primary">Modifier</button>
 	</div>
</form>
</div>
<br/>
<br/>
<a href="ListeJoueur">Liste de Joueurs</a>
</body>
</html>