package main.models;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class JefeDepartamentoId implements Serializable {
    private int idEmpleado;
    private String idDepartamento;

    // getters, setters, equals, and hashCode methods
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public JefeDepartamentoId setIdEmpleado(int empleadoId) {
        this.idEmpleado = empleadoId;
        return this;
    }

    public String getIdDepartamento() {
        return idDepartamento;
    }

    public JefeDepartamentoId setIdDepartamento(String departamentoId) {
        this.idDepartamento = departamentoId;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JefeDepartamentoId that = (JefeDepartamentoId) o;
        return idEmpleado == that.idEmpleado && Objects.equals(idDepartamento, that.idDepartamento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEmpleado, idDepartamento);
    }
}