/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno05
 */
public class director extends persona {

    public director(int id, int edad, int DNI, String Nombre, String Apellidos) {
        super(id, edad, DNI, Nombre, Apellidos);
    }

    @Override
    public void trabajo() {
        System.out.println("estoy trabajando");
    }
    
    
}
