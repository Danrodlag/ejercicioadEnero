package main.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class EmpleadoDepartamento {
    @Id
    private int id;

    @ManyToOne
    private Empleado empleado;

    @ManyToOne
    private Departamento departamento;
    // otros campos
}