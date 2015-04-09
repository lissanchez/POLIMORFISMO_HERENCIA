/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno05
 */
public abstract class persona  {
    int id,edad,DNI;
    String Nombre,Apellidos;

    public persona(int id, int edad, int DNI, String Nombre, String Apellidos) {
        this.id = id;
        this.edad = edad;
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }
    
    public void reunion(){
        System.out.println("estoy en reunion");
    }
    
    public void deporte(){
        System.out.println("estoy jugando futbol");
        
    }
    public abstract void trabajo();
}
