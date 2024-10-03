package net.cfl.crudDiscos.servicios.imp;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import net.cfl.crudDiscos.dto.DiscoDto;
import net.cfl.crudDiscos.entidad.Discos;
import net.cfl.crudDiscos.exepciones.RecursoNoEncontrado;
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

	@Override
	public DiscoDto consultaDiscoPorId(Long discoId) {
		//El metodo .findById() develve los datos 
		//contenido en la entidad en donde coincida
		//el ID
		Discos disco = discoRepositorio.findById(discoId)
										.orElseThrow(() -> new RecursoNoEncontrado ("El disco no existe" + discoId));
		return DiscoMapper.mapToDiscoDto(disco);
	}

	@Override
	public List<DiscoDto> consultaTodosLosDiscos() {
		List<Discos> discos = discoRepositorio.findAll();
		return discos.stream().
						map((disco)-> DiscoMapper.mapToDiscoDto(disco)).
									collect(Collectors.toList());
	}
	
	
	

}

