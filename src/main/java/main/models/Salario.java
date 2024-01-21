package main.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Salario {
    @EmbeddedId
    private SalarioId id;

    @ManyToOne
    @MapsId("empleadoId")
    private Empleado empleado;

    @Column
    private int salario;

    @Column
    private Date hasta;

    public Salario(SalarioId id, int salario, Date hasta) {
        this.id = id;
        this.salario = salario;
        this.hasta = hasta;
    }

    public Salario() {

    }

    public SalarioId id() {
        return id;
    }

    public Salario setId(SalarioId id) {
        this.id = id;
        return this;
    }

    public int salario() {
        return salario;
    }

    public Salario setSalario(int salario) {
        this.salario = salario;
        return this;
    }

    public Date hasta() {
        return hasta;
    }

    public Salario setHasta(Date hasta) {
        this.hasta = hasta;
        return this;
    }
}