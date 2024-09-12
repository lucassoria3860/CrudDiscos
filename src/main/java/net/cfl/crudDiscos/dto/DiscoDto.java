package net.cfl.crudDiscos.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class DiscoDto {
	private Long id;
	private String titulo;
	private String artista;
	private int duracion;
	private String cod;
}
