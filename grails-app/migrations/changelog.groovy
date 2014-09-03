databaseChangeLog = {

	changeSet(author: "jimjosem (generated)", id: "1409740595949-1") {
		createTable(tableName: "persona") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "personaPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "apellido1", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "apellido2", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "fecha_nacimiento", type: "timestamp") {
				constraints(nullable: "false")
			}

			column(name: "nombre", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "salario_de_mierda", type: "double") {
				constraints(nullable: "false")
			}
		}
	}
}
