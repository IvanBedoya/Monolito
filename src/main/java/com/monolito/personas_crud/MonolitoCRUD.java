package com.monolito.personas_crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/api/personas/persona")
@CrossOrigin(origins = {"*"})
public class MonolitoCRUD {
    @Autowired
    PersonaRepository repository;
    @Autowired
    PersonaMapper mapper;
    @GetMapping("mostrar_todos")
    public ResponseEntity<?> obtenerPersonas(){
        List<Persona> todosPersonas = this.repository.findAll();
        List<PersonaDTO> personaDTOS = this.mapper.personaDTOs(todosPersonas);
        return ResponseEntity.ok(personaDTOS);
    }

    @GetMapping("mostrar_persona/{id}")
    public ResponseEntity<?> mostrarPersona(@PathVariable Long id){
        return ResponseEntity.ok("mostrar persona " + id);
    }

    @PutMapping("actualizar_persona/{id}")
    public ResponseEntity<?> actualizarPersona(@PathVariable Long id){
        return ResponseEntity.ok("actualizar persona " + id);
    }

    @PostMapping("agregar_persona")
    public ResponseEntity<?> agregarPersona(){
        return ResponseEntity.ok("agregar persona ");
    }

    @DeleteMapping("eliminar_persona/{id}")
    public ResponseEntity<?> eliminarPersona(@PathVariable Long id){
        return ResponseEntity.ok("eliminar persona " + id);
    }
}
