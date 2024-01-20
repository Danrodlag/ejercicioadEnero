package main.models;

import jakarta.persistence.*;

import java.sql.Date;
import java.io.Serializable;

@Entity
@Table(name = "empleado")
public class Empleado implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY) // autoincremental
    private int idEmpleado;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private String genero;
    @Column
    private Date fechaNacimiento;
    @Column
    private Date fechaContratacion;

    public Empleado() {
    }

    public Empleado(int idEmpleado, String nombre, String apellido, String genero, Date fechaNacimiento, Date fechaContratacion) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaContratacion = fechaContratacion;
    }

    public int idEmpleado() {
        return idEmpleado;
    }

    public Empleado setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
        return this;
    }

    public String nombre() {
        return nombre;
    }

    public Empleado setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String apellido() {
        return apellido;
    }

    public Empleado setApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public String genero() {
        return genero;
    }

    public Empleado setGenero(String genero) {
        this.genero = genero;
        return this;
    }

    public Date fechaNacimiento() {
        return fechaNacimiento;
    }

    public Empleado setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
        return this;
    }

    public Date fechaContratacion() {
        return fechaContratacion;
    }

    public Empleado setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
        return this;
    }
}