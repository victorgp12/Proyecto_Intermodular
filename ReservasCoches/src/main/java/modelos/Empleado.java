/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Portatil
 */
public class Empleado extends Persona{
    private String especialidad;

    public Empleado() {
    }

    public Empleado(String especialidad, int id_usuario) {
        super(id_usuario);
        this.especialidad = especialidad;
    }

    public Empleado(String especialidad, int id_usuario, String nombre, String apellidos, String telefono, String correo, String contraseña) {
        super(id_usuario, nombre, apellidos, telefono, correo, contraseña);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Empleado{" + "especialidad=" + especialidad + '}';
    }
    
    
    
}
