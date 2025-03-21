package com.gozarte.gozarte.services;

import com.gozarte.gozarte.entities.Instructor;
import com.gozarte.gozarte.repositories.InstructorRepository;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import java.util.List;

@Service
public class InstructorService {

    private final InstructorRepository instructorRepository;

    public InstructorService(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }

    public String listarInstructores(Model model) {
        List<Instructor> instructores = instructorRepository.findAll();
        model.addAttribute("instructores", instructores);
        return "lista-instructores";
    }

    public String guardarInstructor(Instructor instructor) {
        instructorRepository.save(instructor);
        return "redirect:/instructores/lista";
    }
}
