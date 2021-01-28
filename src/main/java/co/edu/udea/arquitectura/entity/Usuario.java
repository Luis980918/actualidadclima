package co.edu.udea.arquitectura.entity;

import co.edu.udea.arquitectura.util.enums.TipoUsuario;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "correo", nullable = false, length = 100, unique = true)
    private String correo;

    @Column(name = "contrasena", nullable = false, length = 50)
    private String contrasena;

    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;

    @Column(name = "celular")
    private String celular;


    @Column(name = "fk_ciudad_cliente")
    private Long fkCiudadCliente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_ciudad_cliente", insertable = false, updatable = false)
    private Ciudad ciudadCliente;

    /*
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_administrador", insertable = false, updatable = false)
    private Usuario administrador;
    */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Long getFkCiudadCliente() {
        return fkCiudadCliente;
    }

    public void setFkCiudadCliente(Long fkCiudadCliente) {
        this.fkCiudadCliente = fkCiudadCliente;
    }

    public Ciudad getCiudadCliente() {
        return ciudadCliente;
    }

    public void setCiudadCliente(Ciudad ciudadCliente) {
        this.ciudadCliente = ciudadCliente;
    }
}
