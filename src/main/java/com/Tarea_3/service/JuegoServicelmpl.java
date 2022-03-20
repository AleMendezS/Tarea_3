package com.Tarea_3.service;

import com.Tarea_3.dao.JuegoDao;
import com.Tarea_3.domain.Juego;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class JuegoServicelmpl implements JuegoService {
    
    @Autowired
    private JuegoDao juegoDao;
    
    @Transactional(readOnly = true)
    @Override
    public List<Juego> getJuego() {
        return (List<Juego>) juegoDao.findAll();
    }
    
    @Override
    @Transactional
    public void save(Juego juego) {
        juegoDao.save(juego);
    }
    
    @Override
    @Transactional
    public void delete(Juego juego) {
        juegoDao.delete(juego);
    }
    
    @Override
    @Transactional(readOnly = true)
    public Juego getJuego(Juego juego) {
  return juegoDao.findById(juego.getIdJuego()).orElse(null);
    }
    
}
