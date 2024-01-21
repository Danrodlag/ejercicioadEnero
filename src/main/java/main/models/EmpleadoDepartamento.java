package main.models;

import jakarta.persistence.*;

@Entity
public class EmpleadoDepartamento {
    @EmbeddedId
    private EmpleadoDepartamentoId id;

    @ManyToOne
    @MapsId("idEmpleado")
    private Empleado empleado;

    @ManyToOne
    @MapsId("idDepartamento")
    private Departamento departamento;

    public EmpleadoDepartamentoId getId() {
        return id;
    }

    public EmpleadoDepartamento setId(EmpleadoDepartamentoId id) {
        this.id = id;
        return this;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public EmpleadoDepartamento setEmpleado(Empleado empleado) {
        this.empleado = empleado;
        return this;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public EmpleadoDepartamento setDepartamento(Departamento departamento) {
        this.departamento = departamento;
        return this;
    }
}