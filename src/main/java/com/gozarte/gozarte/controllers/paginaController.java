package com.gozarte.gozarte.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("/")
public class paginaController {

@GetMapping("mision")
public String paginaMision() {
return"mision";
}

@GetMapping("vision")
public String paginaVision() {
return"vision";
}


@GetMapping("valores")
public String paginaValores() {
return"valores";
}


@GetMapping("servicios")
public String paginaServicios() {
return"servicios";
}


@GetMapping("eventos")
public String paginaEventos() {
return"eventos";
}


@GetMapping("gestion")
public String paginaGestion() {
return"gestion";
}



}