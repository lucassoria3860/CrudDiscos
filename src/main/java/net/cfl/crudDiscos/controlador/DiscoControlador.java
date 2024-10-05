package net.cfl.crudDiscos.controlador;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import net.cfl.crudDiscos.dto.DiscoDto;
import net.cfl.crudDiscos.servicios.DiscoServicio;

@CrossOrigin("*")
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
	
	@GetMapping({"id"})
	//REST API: Consulta discos por Id
	public ResponseEntity<DiscoDto> consultaDiscoPorId(@PathVariable("id") Long discoId){
		DiscoDto discoDto = discoServicio.consultaDiscoPorId(discoId);
		return ResponseEntity.ok(discoDto);
	}
	
	@GetMapping
	//REST API: consulta todos los discos
	public ResponseEntity<List<DiscoDto>> consultaTodosLosDiscos(){
		List<DiscoDto> discos = discoServicio.consultaTodosLosDiscos();
		return ResponseEntity.ok(discos);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<DiscoDto> actualizaDisco(@RequestBody DiscoDto discoActualizado, 
																@PathVariable Long discoId){
		
		DiscoDto discoDto = discoServicio.actualizaDisco(discoId, discoActualizado);
		
		return ResponseEntity.ok(discoDto);
	}
	
	
	
	
	
}
