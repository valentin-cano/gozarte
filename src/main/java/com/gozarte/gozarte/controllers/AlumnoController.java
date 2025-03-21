package com.gozarte.gozarte.controllers;

import com.gozarte.gozarte.entities.Alumno;
import com.gozarte.gozarte.services.AlumnoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@Controller
@RequestMapping("/alumnos")
public class AlumnoController {

    private final AlumnoService alumnoService;

    public AlumnoController(AlumnoService alumnoService) {
        this.alumnoService = alumnoService;
    }

    @GetMapping("/lista")
public String listarAlumnos(Model model) {
    model.addAttribute("alumnos", alumnoService.listarAlumnos());
    return "lista-alumnos"; 
}

    @GetMapping("/nuevo")
    public String mostrarFormularioAlumno() {      
        return "guardar-alumno";
    }

    @PostMapping("/guardar")
    public String guardarAlumno(@ModelAttribute Alumno alumno) {
        alumnoService.guardarAlumno(alumno);
    return "redirect:/alumnos/lista";
    }

@PostMapping("/eliminar")
    public String eliminarAlumno(@RequestParam("seleccionado") Long id) {    
    alumnoService.eliminarAlumno(id);
    return "redirect:/alumnos/lista";
    }


 @GetMapping("/editar/{id}")
public String mostrarFormularioEdicion(@PathVariable("id") Long id, Model model) {
    Alumno alumno = alumnoService.obtenerAlumnoPorId(id);
    model.addAttribute("alumno", alumno);
    return "editar-alumno"; // Nombre del archivo HTML con el formulario de edición
}
   
@PostMapping("/editar")
public String editarAlumno(@ModelAttribute("alumno") Alumno alumno) {
    alumnoService.editarAlumno(alumno);
    return "redirect:/alumnos/lista"; 
}








}