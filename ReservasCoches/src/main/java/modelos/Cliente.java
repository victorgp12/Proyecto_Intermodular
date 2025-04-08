/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Portatil
 */
public class Cliente extends Persona{

    public Cliente() {
    }

    public Cliente(int id_usuario) {
        super(id_usuario);
    }

    public Cliente(int id_usuario, String nombre, String apellidos, String telefono, String correo, String contraseña) {
        super(id_usuario, nombre, apellidos, telefono, correo, contraseña);
    }

    @Override
    public String toString() {
        return "Cliente{" + '}';
    }
    
    
}
