package models;

import java.sql.Date;

public class Empleado {
    
    private Long id;
    private String nombre;
    private String domicilio;
    private String telefono;
    private String email;
    private Date fechaNacimiento;
    private Genero genero;

    public Empleado(Long id, String nombre, String domicilio, String telefono, String email, Date fechaNacimiento, Genero genero)
    {
        this.id = id;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;

    }

    public String getDomicilio() {
        return domicilio;
    }
    public String getEmail() {
        return email;
    }
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
    public Genero getGenero() {
        return genero;
    }
    public Long getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
