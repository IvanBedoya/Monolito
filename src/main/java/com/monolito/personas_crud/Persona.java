package com.monolito.personas_crud;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "PERSONAS" )

public class Persona {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="PERSONA_ID", nullable = false, insertable=false)
    private Long personaId;
    @Column(name="NOMBRES", nullable = false)
    private String nombre;
    @Column(name="APELLIDOS", nullable = false)
    private String apellido;
    @ManyToOne
    @JoinColumn(name="DOCUMENTO_ID")
    private Documento documentoId;
    @Column(name="EDAD", nullable = false)
    private Long edad;
    @ManyToOne
    @JoinColumn(name="CIUDAD_ID")
    private Ciudad ciudadId;
    @ManyToOne
    @JoinColumn(name="FOTO")
    private Imagen foto;
}
