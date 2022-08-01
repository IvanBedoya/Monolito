package com.monolito.personas_crud;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "CIUDADES" )

public class Ciudad {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="CIUDAD_ID", nullable = false, insertable=false)
    private Long ciudadId;
    @Column(name="NOMBRE", nullable = false)
    private String nombre;
}
