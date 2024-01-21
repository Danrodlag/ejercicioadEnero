package main.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Titles {
    @EmbeddedId
    private TitlesId id;

    @ManyToOne
    @MapsId("empleadoId")
    private Empleado empleado;

    @Column
    private Date fechaDesde;

    public TitlesId id() {
        return id;
    }

    public Titles setId(TitlesId id) {
        this.id = id;
        return this;
    }

    public Empleado empleado() {
        return empleado;
    }

    public Titles setEmpleado(Empleado empleado) {
        this.empleado = empleado;
        return this;
    }

    public Date fechaDesde() {
        return fechaDesde;
    }

    public Titles setFechaDesde(Date fechaDesde) {
        this.fechaDesde = fechaDesde;
        return this;
    }
}