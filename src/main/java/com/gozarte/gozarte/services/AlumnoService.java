package com.gozarte.gozarte.services;

import com.gozarte.gozarte.entities.Alumno;
import com.gozarte.gozarte.repositories.AlumnoRepository;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
public class AlumnoService {

    private final AlumnoRepository alumnoRepository;

    public AlumnoService(AlumnoRepository alumnoRepository) {
        this.alumnoRepository = alumnoRepository;
    }

    public void guardarAlumno(Alumno alumno) {
        alumnoRepository.save(alumno);
        }

    
        public List<Alumno> listarAlumnos() {
        return alumnoRepository.findAll();
    }


public void eliminarAlumno(long identificador) {
 alumnoRepository.deleteById(identificador);  
}


public Alumno obtenerAlumnoPorId(Long id) {
    return alumnoRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Alumno no encontrado con ID: " + id));
}


public void editarAlumno(Alumno alumno) {
    alumnoRepository.save(alumno);
    }



}

