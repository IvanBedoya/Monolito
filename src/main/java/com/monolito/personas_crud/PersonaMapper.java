package com.monolito.personas_crud;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonaMapper {
    public PersonaDTO personaObject(Persona persona){
        PersonaDTO personaDTO = new PersonaDTO();
        personaDTO.setId(persona.getPersonaId());
        personaDTO.setNombres(persona.getNombre());
        personaDTO.setApellidos(persona.getApellido());
        personaDTO.setTipoDocumento(persona.getDocumentoId().getTipoDocumentoId().getNombre());
        personaDTO.setNumeroDocumento(persona.getDocumentoId().getNumero());
        personaDTO.setEdad(persona.getEdad());
        personaDTO.setCiudad(persona.getCiudadId().getNombre());
        return personaDTO;
    }

    public List<PersonaDTO> personaDTOs(List<Persona> personas){
        if (personas == null){
            return null;
        }
        else{
            List<PersonaDTO> personasNueva = new ArrayList<PersonaDTO>(personas.size());
            for(Persona persona:personas){
                personasNueva.add(personaObject(persona));
            }
            return personasNueva;
        }
    }
}
