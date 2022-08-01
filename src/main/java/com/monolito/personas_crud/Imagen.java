package com.monolito.personas_crud;

import lombok.Data;

import javax.persistence.*;
import java.sql.Blob;

@Entity
@Data
@Table(name = "IMAGENES" )

public class Imagen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IMAGEN_ID", nullable = false, insertable = false)
    private Long foto;
    @Lob
    @Column(name = "IMAGEN", nullable = false)
    private Blob imagen;
}
