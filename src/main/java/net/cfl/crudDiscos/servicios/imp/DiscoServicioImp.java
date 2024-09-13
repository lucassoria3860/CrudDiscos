package net.cfl.crudDiscos.servicios.imp;

import net.cfl.crudDiscos.dto.DiscoDto;
import net.cfl.crudDiscos.entidad.Discos;
import net.cfl.crudDiscos.mapper.DiscoMapper;
import net.cfl.crudDiscos.repositorio.DiscoRepositorio;
import net.cfl.crudDiscos.servicios.DiscoServicio;

public class DiscoServicioImp implements DiscoServicio{
	
	private DiscoRepositorio discoRepositorio;
		
	@Override
	public DiscoDto crearDisco(DiscoDto discoDto) {
		Discos disco = DiscoMapper.mapToDisco(discoDto);
		//
		Discos discoGuardado = discoRepositorio.save(disco);
		return DiscoMapper.mapToDiscoDto(discoGuardado);
	}

}
