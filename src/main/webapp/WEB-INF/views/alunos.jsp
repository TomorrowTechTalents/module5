<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head><%@ page isELIgnored="false" %>
    <meta charset="ISO-8859-1">
    <title>Alunos | Lista</title>
</head>
<body>
<h2>${aluno.nome}</h2>
<h4>Este aluno está no módulo ${aluno.turma} e tem ${aluno.idade} anos de idade</h4>
</body>
</html>
