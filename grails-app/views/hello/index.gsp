<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Personas</title>
	</head>
	<body>
        <g:each in="${persons}" var="person" status="i">
            <h3>${i+1}. ${person.nombre}, ${person.apellido1}</h3>
            <p>
                Fecha Nacimiento: ${person.fechaNacimiento}
            </p>
            <p>
                Fecha Baja: ${person.fechaBaja}
            </p>
            <p>
                Salario de Mierda: <g:formatNumber number="${person.salarioDeMierda}" type="currency" currencyCode="EUR"  maxFractionDigits="0"/> 
            </p>
            <br/>
        </g:each>
	</body>
</html>