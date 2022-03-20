package com.Tarea_3.service;

import com.Tarea_3.dao.ConsultaDao;
import com.Tarea_3.domain.Consulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ConsultaServicelmpl implements ConsultaService {

    @Autowired
    private ConsultaDao consultaDao;

    @Override
    @Transactional
    public void save(Consulta consulta) {
        consultaDao.save(consulta);
    }

}
