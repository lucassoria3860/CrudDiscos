package net.cfl.crudDiscos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import net.cfl.crudDiscos.entidad.Discos;
/*
 * Esta Interfaz implementa los metodos para tareas de Crud del JPARepository
 */

public interface DiscoRepositorio extends JpaRepository <Discos, Long> {
	
}
