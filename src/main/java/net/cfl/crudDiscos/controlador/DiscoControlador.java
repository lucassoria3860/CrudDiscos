package net.cfl.crudDiscos.controlador;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import net.cfl.crudDiscos.dto.DiscoDto;
import net.cfl.crudDiscos.servicios.DiscoServicio;


@RestController //Establece la clase como un controlador
@AllArgsConstructor
@RequestMapping("./api/discos")
public class DiscoControlador {
	
	private DiscoServicio discoServicio;
	
	@PostMapping
	//REST API: Crear disco
	public ResponseEntity<DiscoDto> crearDisco(@RequestBody DiscoDto discoDto){
		DiscoDto discoGuardado = discoServicio.crearDisco(discoDto);
		return new ResponseEntity<>(discoGuardado, HttpStatus.CREATED) ;
	}
	
	
}
