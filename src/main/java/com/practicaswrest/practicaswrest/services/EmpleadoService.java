package com.practicaswrest.practicaswrest.services;

import com.practicaswrest.practicaswrest.entity.Empleado;
import com.practicaswrest.practicaswrest.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService {
    @Autowired
    EmpleadoRepository empleado;

    public Empleado insertar(Empleado emple){
        return empleado.save(emple);

    }

    public Empleado actualizar(Empleado emple){
        return empleado.save(emple);
    }
    public List<Empleado> listar(){
        return empleado.findAll();
    }
    public void borrar(Long id){
        empleado.deleteById(id);
    }
}
