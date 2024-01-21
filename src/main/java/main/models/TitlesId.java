package main.models;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class TitlesId implements Serializable {
    private int empleadoId;
    private String titulo;
    private String fechaInicio;

    // getters, setters, equals, and hashCode methods
    // ...

    public int getEmpleadoId() {
        return empleadoId;
    }

    public TitlesId setEmpleadoId(int empleadoId) {
        this.empleadoId = empleadoId;
        return this;
    }

    public String getTitulo() {
        return titulo;
    }

    public TitlesId setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public TitlesId setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TitlesId)) return false;
        TitlesId titlesId = (TitlesId) o;
        return getEmpleadoId() == titlesId.getEmpleadoId() && Objects.equals(getTitulo(), titlesId.getTitulo()) && Objects.equals(getFechaInicio(), titlesId.getFechaInicio());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmpleadoId(), getTitulo(), getFechaInicio());
    }

    @Override
    public String toString() {
        return "TitlesId{" +
                "empleadoId=" + empleadoId +
                ", titulo='" + titulo + '\'' +
                ", fechaInicio='" + fechaInicio + '\'' +
                '}';
    }


}