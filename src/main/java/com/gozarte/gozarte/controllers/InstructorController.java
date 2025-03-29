package com.gozarte.gozarte.controllers;

import com.gozarte.gozarte.entities.Instructor;
import com.gozarte.gozarte.services.InstructorService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/instructores")
@Tag (name = "Instructores", description = "End point para las operaciones relacionadas con los instructores")
public class InstructorController {

    private final InstructorService instructorService;

    public InstructorController(InstructorService instructorService) {
        this.instructorService = instructorService;
    }

    @GetMapping("/lista")
    @Operation(
        summary = "Listar instructores",
        description = "Lista todos los instructores de la DB"
    )
    public String listarInstructores(Model model) {
        return instructorService.listarInstructores(model);
    }

    @GetMapping("/nuevo")
@Operation(
summary = "Formulario de creación de instructor",
description = "End point que retorna un formulario para crear un nuevo instructor"
)
    public String mostrarFormularioInstructor() {        
    
        return "guardar-instructor";
    }

    @PostMapping("/guardar")
    @Operation(
summary = "Guardar instructor",
description = "End point que recibe los datos de un nuevo instructor y los guarda en la DB"
    )
    public String guardarInstructor(@ModelAttribute Instructor instructor) {
        return instructorService.guardarInstructor(instructor);
    }
}
