package hello2

import java.text.SimpleDateFormat
import java.util.Date;

class HelloController {

    def index() {
		def persons = Persona.list()
		[persons:persons]
	}
	
	def hi() {
		render (view:'index.gsp')
	}
	
	def nuevaPersona(){
		println "nuevaPersona"
		
		SimpleDateFormat dt = new SimpleDateFormat("yyyyy-mm-dd");
		
		/*
		Persona p=new Persona(nombre:"Jose Miguel",
					apellido1:"JIMENEZ",
					apellido2:"VILLA",
					fechaNacimiento:dt.parse("1976-07-27"),
					fechaBaja:dt.parse("2014-11-01"),
					salarioDeMierda:3000000)
		*/
			Persona p=new Persona(params);
			
			p.save(failOnError:"true")
			
			int numberOfRecords = Persona.count()
			println "NUMERO PERSONAS " + numberOfRecords
		}
	
	def crearPersonaForm(){
		println "crearPersonaForm"
		render (view:'crearPersonaForm.gsp')
	}
	
		
	
}
