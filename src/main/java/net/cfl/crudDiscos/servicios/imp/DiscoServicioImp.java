package net.cfl.crudDiscos.servicios.imp;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import net.cfl.crudDiscos.dto.DiscoDto;
import net.cfl.crudDiscos.entidad.Discos;
import net.cfl.crudDiscos.mapper.DiscoMapper;
import net.cfl.crudDiscos.repositorio.DiscoRepositorio;
import net.cfl.crudDiscos.servicios.DiscoServicio;

@Service
@AllArgsConstructor
public class DiscoServicioImp implements DiscoServicio{
	
	private DiscoRepositorio discoRepositorio;
		
	@Override
	public DiscoDto crearDisco(DiscoDto discoDto) {
		Discos disco = DiscoMapper.mapToDisco(discoDto);
		//El metodo .save() de JPA guarda los datos en la base de datos
		Discos discoGuardado = discoRepositorio.save(disco);
		return DiscoMapper.mapToDiscoDto(discoGuardado);
	}

}
