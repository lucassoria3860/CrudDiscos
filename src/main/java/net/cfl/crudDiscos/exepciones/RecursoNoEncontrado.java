package net.cfl.crudDiscos.exepciones;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RecursoNoEncontrado extends RuntimeException {
	
	public RecursoNoEncontrado(String msg){
		super(msg);
	}
	
}
