package com.monolito.personas_crud;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "DOCUMENTOS" )

public class Documento {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="DOCUMENTO_ID", nullable = false, insertable=false)
    private Long documentoId;
    @ManyToOne
    @JoinColumn(name="TIPO_DOC_ID")
    private TipoDocumento tipoDocumentoId;
    @Column(name="NUMERO", nullable = false)
    private Long numero;

}
