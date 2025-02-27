package com.gozarte.gozarte.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaginaController {

    @GetMapping("/mision")
    public String mostrarMision() {
        return "mision";
    }

    @GetMapping("/vision")
    public String mostrarVision() {
        return "vision";
    }

    @GetMapping("/valores")
    public String mostrarValores() {
        return "valores";
    }

    @GetMapping("/servicios")
    public String mostrarServicios() {
        return "servicios";
    }

    @GetMapping("/eventos")
    public String mostrarEventos() {
        return "eventos";
    }
}
