package net.cfl.crudDiscos.servicios;

import java.util.List;

import net.cfl.crudDiscos.dto.DiscoDto;


public interface DiscoServicio {
	
	
	DiscoDto crearDisco(DiscoDto discoDto);
	
	DiscoDto consultaDiscoPorId(Long discoId);
	
	List<DiscoDto> consultaTodosLosDiscos();
	
	DiscoDto actualizaDisco(Long discoId, DiscoDto discoActualizado);
	
	void borraDisco(Long discoId);
	
}
