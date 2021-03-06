<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<link type="text/css" rel="stylesheet" href="style.css" />

<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Dosis:wght@200&display=swap" rel="stylesheet">

<style type="text/css">
label {
display:inline-block;
width : 70px;
}
</style>
<title>Profil</title>
</head>

<body>	
	<div class="container">
	<div class="row">
	<div class="col-lg-3 col-sm-4 offset-1">
		<a href="<%=request.getContextPath()%>/AccueilServlet"><img class="transparent" width="100px" src="img/marteaulogo.png" alt="logo marteau du site"></a>
	</div>
	</div>
	</div>
	
	<div class="container affichlst">
	<div class="row">
	<div class="col-lg-8 offset-2 col-sm-12">
		<ul class="list-group" style ="list-style-type:none">
			<li><b>Pseudo : ${u.pseudo}</b></li>
			<li>Nom : ${u.nom}</li>
			<li>Prénom : ${u.prenom}</li>
			<li>Email : ${u.email}</li>
			<li>Téléphone : ${u.telephone}</li>
			<li>Rue : ${u.rue}</li>
			<li>Code Postal : ${u.code_postal}</li>
			<li>Ville : ${u.ville}</li>
		</ul>
	</div>	
	</div>
	</div>
</body>
</html>