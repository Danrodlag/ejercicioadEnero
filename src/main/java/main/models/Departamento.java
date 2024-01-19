package main.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Departamento {
    @Id
    private int id;

    private String nombre;
    private String descripcion;


    // otros campos
}
