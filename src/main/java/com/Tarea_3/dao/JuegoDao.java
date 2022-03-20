
package com.Tarea_3.dao;

import com.Tarea_3.domain.Juego;
import org.springframework.data.repository.CrudRepository;

public interface JuegoDao extends CrudRepository<Juego, Long> {
    
}
