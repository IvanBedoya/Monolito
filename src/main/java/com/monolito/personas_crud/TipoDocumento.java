package com.monolito.personas_crud;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "TIPO_DOC" )


public class TipoDocumento {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="TIPO_DOC_ID", nullable = false, insertable=false)
    private Long tipoDocumentoId;
    @Column(name="NOMBRE", nullable = false)
    private String nombre;
}
