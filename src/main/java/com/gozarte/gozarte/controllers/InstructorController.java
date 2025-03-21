package com.gozarte.gozarte.controllers;

import com.gozarte.gozarte.entities.Instructor;
import com.gozarte.gozarte.services.InstructorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/instructores")
public class InstructorController {

    private final InstructorService instructorService;

    public InstructorController(InstructorService instructorService) {
        this.instructorService = instructorService;
    }

    @GetMapping("/lista")
    public String listarInstructores(Model model) {
        return instructorService.listarInstructores(model);
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioInstructor() {        
        return "guardar-instructor";
    }

    @PostMapping("/guardar")
    public String guardarInstructor(@ModelAttribute Instructor instructor) {
        return instructorService.guardarInstructor(instructor);
    }
}
