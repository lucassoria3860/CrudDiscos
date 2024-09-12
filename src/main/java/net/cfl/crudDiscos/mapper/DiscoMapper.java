package net.cfl.crudDiscos.mapper;

import net.cfl.crudDiscos.dto.DiscoDto;
import net.cfl.crudDiscos.entidad.Discos;

public class DiscoMapper {
	public static DiscoDto mapToDiscoDto(Discos disco) {
		return new DiscoDto (
							disco.getId(),
							disco.getTitulo(),
							disco.getArtista(),
							disco.getDuracion(),
							disco.getCod()
							);
	}
	
	public static Discos mapToDisco(DiscoDto discoDto) {
		return new Discos(
						discoDto.getId(),
						discoDto.getTitulo(),
						discoDto.getArtista(),
						discoDto.getDuracion(),
						discoDto.getCod()
						);
	}
	
	
	
}
