package com.gozarte.gozarte.controllers;

import com.gozarte.gozarte.entities.Alumno;
import com.gozarte.gozarte.services.AlumnoService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@Controller
@RequestMapping("/alumnos")
@Tag(name = "Alumnos", description = "End point para las operaciones relacionadas con los alumnos")
public class AlumnoController {

    private final AlumnoService alumnoService;

    public AlumnoController(AlumnoService alumnoService) {
        this.alumnoService = alumnoService;
    }

    @GetMapping("/lista")
@Operation(
summary = "Obtener la lista de todos los alumnos",
description = "Retorna una lista con todos los alumnos registrados en la plataforma"
)
    public String listarAlumnos(Model model) {
    model.addAttribute("alumnos", alumnoService.listarAlumnos());
    return "lista-alumnos"; 
}

    @GetMapping("/nuevo")
    @Operation(
summary = "Crear un nuevo alumno",
description = "Retorna la vista para crear un alumno nuevo y lo guarda"
    )
    public String mostrarFormularioAlumno() {      
        return "guardar-alumno";
    }

    @PostMapping("/guardar")
    @Operation(
summary = "Guardar alumno",
description = "Recibe la información capturada en la vista y la guarda enla DB"

    )
    
public String guardarAlumno(@ModelAttribute Alumno alumno) {
        alumnoService.guardarAlumno(alumno);
    return "redirect:/alumnos/lista";
    }

@PostMapping("/eliminar")
@Operation(
summary = "Elimnar un alumno",
description = "Recibe un id de tipo long y elimina el registro de la DB"

)    
public String eliminarAlumno(@RequestParam("seleccionado") Long id) {    
    alumnoService.eliminarAlumno(id);
    return "redirect:/alumnos/lista";
    }


 @GetMapping("/editar/{id}")
@Operation(
summary = "Vista de editar un alumno",
description = "Retorna la vista para obtener la información de un alumno a editar y la guarda en la DB"

)
 public String mostrarFormularioEdicion(@PathVariable("id") Long id, Model model) {
    Alumno alumno = alumnoService.obtenerAlumnoPorId(id);
    model.addAttribute("alumno", alumno);
    return "editar-alumno"; // Nombre del archivo HTML con el formulario de edición
}
   
@PostMapping("/editar")
@Operation(
summary = "Mostrar lista de alumnos",
description = "Muestra la vista con los alumnos después de crear o editar alguno"
)
public String editarAlumno(@ModelAttribute("alumno") Alumno alumno) {
    alumnoService.editarAlumno(alumno);
    return "redirect:/alumnos/lista"; 
}








}