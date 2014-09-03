<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Form</title>
	</head>
	<body>
        <g:form controller="hello" action="nuevaPersona">
            <label>Nombre: </label>
            <g:textField name="nombre"/><br/>

            <label>Apellido1: </label>
            <g:textField name="apellido1"/><br/>

            <label>Apellido2: </label>
            <g:textField name="apellido2"/><br/>

            <label>Fecha Nacimiento: </label>
            <g:textField name="fechaNacimiento"/><br/>

            <label>Fecha Baja: </label>
            <g:textField name="fechaBaja"/><br/>

            <label>Salario: </label>
            <g:textField name="salarioDeMierda"/><br/>

            <g:actionSubmit value="nuevaPersona"/>
        </g:form>
	</body>
</html>