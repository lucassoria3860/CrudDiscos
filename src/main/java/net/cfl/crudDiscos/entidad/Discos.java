package net.cfl.crudDiscos.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


@Entity  //Esta notacion le dice a java que esta clase es una entidad
@Table(name = "tb_discos") //Indica el nombre de la tabla en la base de datos
/*CREAMOS LA CLASE Discos PARA JPA
 * 
 */
public class Discos {
	@Id //Establecemos el campo id como PRIMARY KEY
	@GeneratedValue(strategy = GenerationType.IDENTITY)// Generamos el auto increment
	private Long id;
	//La notacion @Column indica el nombre del campo en la base de datos
	@Column(name = "d_titulo")
	private String titulo;
	@Column(name = "d_artista")
	private String artista;
	@Column(name = "d_duracion")
	private int duracion;
	@Column(name = "d_cod", nullable = false, unique = true)
	private String cod;
}
