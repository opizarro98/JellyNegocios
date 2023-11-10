package com.ec.jellynegocios.dao;


import jakarta.persistence.*;

/**
 * @author Oscar Pizarro
 * @since 09/11/2023
 */
@Entity
@Table(name = "persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_persona;

    @Column (length = 45)
    private String cedulaRuc;

    @Column (length = 45)
    private String nombres;

    @Column (length = 45)
    private String apellidos;

    @Column (length = 45)
    private String telefono;

    @Column (length = 45)
    private String direccion;

    @Column (length = 45)
    private String email;

    @Column (length = 45)
    private String es_Activo;

    //CONSTRUCTOR
    public Persona() {
    }

    public Persona(int id_persona, String cedulaRuc, String nombres, String apellidos, String telefono, String direccion, String email, String es_Activo) {
        this.id_persona = id_persona;
        this.cedulaRuc = cedulaRuc;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.es_Activo = es_Activo;
    }

    //METODOS GET Y SET
    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getCedulaRuc() {
        return cedulaRuc;
    }

    public void setCedulaRuc(String cedulaRuc) {
        this.cedulaRuc = cedulaRuc;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEs_Activo() {
        return es_Activo;
    }

    public void setEs_Activo(String es_Activo) {
        this.es_Activo = es_Activo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id_persona=" + id_persona +
                ", cedulaRuc='" + cedulaRuc + '\'' +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", email='" + email + '\'' +
                ", es_Activo='" + es_Activo + '\'' +
                '}';
    }
}
