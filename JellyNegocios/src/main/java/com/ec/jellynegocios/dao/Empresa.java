package com.ec.jellynegocios.dao;


import jakarta.persistence.*;


/**
 * @author Oscar Pizarro
 * @since 30/10/2023
 */
@Entity
@Table(name = "empresa")

public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_empresa;

    @Column (length = 45)
    private String nombre;

    @Column (length = 45)
    private String cedulaRuc;

    @Column (length = 45)
    private String direccion;

    @Column (length = 45)
    private String telefono;

    @Column (length = 45)
    private String email;



    // METODOS GET Y SET
    public int getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(int id_empresa) {
        this.id_empresa = id_empresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedulaRuc() {
        return cedulaRuc;
    }

    public void setCedulaRuc(String cedulaRuc) {
        this.cedulaRuc = cedulaRuc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "id_empresa=" + id_empresa +
                ", nombre='" + nombre + '\'' +
                ", cedulaRuc='" + cedulaRuc + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
