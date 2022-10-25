package com.practicaswrest.practicaswrest.controllers;

import com.practicaswrest.practicaswrest.entity.Empleado;
import com.practicaswrest.practicaswrest.services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ws1/empleados")
public class EmpleadoController {

    // Se realiza una intancia a la clase service
    @Autowired
    EmpleadoService empleadoService;

    //listar todos los empleados
    @GetMapping
    public List<Empleado> lista(){
        return empleadoService.listar();
    }

    @PostMapping ("/crear")
    public Empleado create(@RequestBody Empleado emple){
        return empleadoService.insertar(emple);
    }
    @PostMapping ("/editar")
    //@PutMapping una opción para diferenciar el metodo por tipo de http y no por path
    public Empleado editar(@RequestBody Empleado emple){
        return empleadoService.actualizar(emple);
    }
    //@DeleteMapping una opción para diferenciar el metodo por tipo de http y no por path
    @PostMapping ("/borrar")
    public void borrar(@RequestBody Long id){
        empleadoService.borrar(id);
    }


}
