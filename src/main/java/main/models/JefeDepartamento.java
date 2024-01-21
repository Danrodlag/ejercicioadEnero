package main.models;

import jakarta.persistence.*;

@Entity
public class JefeDepartamento {
    @EmbeddedId
    private JefeDepartamentoId id;

    @ManyToOne
    @MapsId("idEmpleado")
    private Empleado empleado;

    @ManyToOne
    @MapsId("idDepartamento")
    private Departamento departamento;

    public JefeDepartamentoId getId() {
        return id;
    }

    public JefeDepartamento setId(JefeDepartamentoId id) {
        this.id = id;
        return this;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public JefeDepartamento setEmpleado(Empleado empleado) {
        this.empleado = empleado;
        return this;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public JefeDepartamento setDepartamento(Departamento departamento) {
        this.departamento = departamento;
        return this;
    }
}