package net.cfl.crudDiscos.entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_discos")
@Id
@GeneratedValues(estrategue = generetiontime.id)
public class Discos {
	private Long id ;
	private String titulo;
	private String artista;
	private int duracion;
	private String cod;
}
