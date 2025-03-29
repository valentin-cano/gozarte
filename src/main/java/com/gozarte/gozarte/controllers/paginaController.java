package com.gozarte.gozarte.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;



@Controller
@RequestMapping("/")
@Tag(name = "Página", description = "End point para las operaciones relacionadas con la página web")
public class paginaController {

@GetMapping("mision")
@Operation(
summary = "Página Misión",
description = "End point que retorna la vista Misión"
)
public String paginaMision() {
return"mision";
}

@GetMapping("vision")
@Operation(
summary = "Página Visión",
description = "End point que retorna la vista Visión"
)
public String paginaVision() {
return"vision";
}


@GetMapping("valores")
@Operation(
summary = "Página Valores",
description = "End point que retorna la vista Valores"
)
public String paginaValores() {
return"valores";
}


@GetMapping("servicios")
@Operation(
summary = "Página Servicios",
description = "End point que retorna la vista Servicios"
)
public String paginaServicios() {
return"servicios";
}


@GetMapping("eventos")
@Operation(
summary = "Página Eventos",
description = "End point que retorna la vista Eventos"
)
public String paginaEventos() {
return"eventos";
}


@GetMapping("gestion")
@Operation(
summary = "Página gestión",
description = "End point que retorna la vista Gestión"
)
public String paginaGestion() {
return"gestion";
}



}