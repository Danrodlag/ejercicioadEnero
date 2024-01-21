package main.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "departamento")
public class Departamento {
    @Id
    private String idDepartamento;

    @Column
    private String nombreDepartamento;

    public Departamento() {
    }

    public Departamento(String idDepartamento, String nombreDepartamento) {
        this.idDepartamento = idDepartamento;
        this.nombreDepartamento = nombreDepartamento;
    }

    public String getIdDepartamento() {
        return idDepartamento;
    }

    public Departamento setIdDepartamento(String idDepartamento) {
        this.idDepartamento = idDepartamento;
        return this;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public Departamento setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
        return this;
    }
}
