package main.models;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Embeddable
public class SalarioId implements Serializable {
    private int empleadoId;
    private Date desde;


    public SalarioId() {
    }

    public SalarioId(int empleadoId, Date desde) {
        this.empleadoId = empleadoId;
        this.desde = desde;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public SalarioId setEmpleadoId(int empleadoId) {
        this.empleadoId = empleadoId;
        return this;
    }

    public Date getDesde() {
        return desde;
    }

    public SalarioId setDesde(Date desde) {
        this.desde = desde;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SalarioId)) return false;
        SalarioId salarioId = (SalarioId) o;
        return getEmpleadoId() == salarioId.getEmpleadoId() && Objects.equals(getDesde(), salarioId.getDesde());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmpleadoId(), getDesde());
    }

    @Override
    public String toString() {
        return "SalarioId{" +
                "empleadoId=" + empleadoId +
                ", desde='" + desde + '\'' +
                '}';
    }

}