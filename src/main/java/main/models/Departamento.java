package main.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "departamento")
public class Departamento {
    @Id
    private int idDepartamento;

    @Column
    private String nombreDepartamento;

    public Departamento() {
    }

    public Departamento(int idDepartamento, String nombreDepartamento) {
        this.idDepartamento = idDepartamento;
        this.nombreDepartamento = nombreDepartamento;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public Departamento setIdDepartamento(int idDepartamento) {
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
