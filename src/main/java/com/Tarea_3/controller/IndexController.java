package com.Tarea_3.controller;

import com.Tarea_3.domain.Consulta;
import com.Tarea_3.domain.Juego;
import com.Tarea_3.service.ConsultaService;
import com.Tarea_3.service.JuegoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class IndexController {

    @Autowired

    private JuegoService juegoService;
    private ConsultaService consultaService;

    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Ahora se usa arquitectura MVC");

        //var juegoDB = juegoService.getJuego();
        // model.addAttribute("juegoDB", juegoDB);
        return "Bienvenido";
    }
    
     @GetMapping("/index")
    public String volver(Model model) {
       
        return "Index";
    }

    @GetMapping("/listar")
    public String mostrar(Model model) {

        var juegoDB = juegoService.getJuego();
        model.addAttribute("juegoDB", juegoDB);

        return "Listar";
    }

    @GetMapping("/nuevoJuego")
    public String nuevoJuego(Juego juego) {
        return "modifica";
    }
  
    @GetMapping("/nuevaConsulta")
    public String nuevaConsulta(Consulta consulta) {
        return "Contactenos";
    }

    @PostMapping("/guardarConsulta")
    public String guardarConsulta(Consulta consulta) {
        consultaService.save(consulta);
        return "redirect:/";
    }

    @GetMapping("/modificarJuego/{idJuego}")
    public String modificarJuego(Juego juego, Model model) {
        var respuesta = juegoService.getJuego(juego);
        model.addAttribute("juego", respuesta);
        return "modifica";
    }

    @PostMapping("/guardarJuego")
    public String guardarJuego(Juego juego) {
        juegoService.save(juego);
        return "redirect:/";
    }

    @GetMapping("/eliminarJuego/{idJuego}")
    public String eliminarCliente(Juego juego) {
        juegoService.delete(juego);
        return "redirect:/";
    }
}
