package com.monolito.personas_crud;

import lombok.Data;

@Data
public class PersonaDTO {
    private Long id;
    private String nombres;
    private String apellidos;
    private String tipoDocumento;
    private Long numeroDocumento;
    private Long edad;
    private String ciudad;
}
