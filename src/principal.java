
import java.util.ArrayList;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno05
 */
public class principal {

    /**
     * @param args the command line arguments
     */
   public static ArrayList <persona> personal = new ArrayList<persona>();
    public static void main(String[] args) {
       
      

 
        persona rm = new docente(1, 23, 7624789,"Rolando", "Mendoza Perez");
        persona kl= new coordinador(2,30,789524,"carlos", "rodriguez calderon");
        persona ct= new gerente(3,20,7952472,"Pedro", "Gomez");
        persona gt= new tesorero(4,30,789225,"Ulises", "Julca");
        persona hr= new contador(5,12,751258,"Luis", "Manya");
        persona jh= new jefedearea(6,23,7824669,"Junior", "Gomez");
        persona da= new director(7,24,79865586,"Jorge", "Polo");
        
        personal.add(rm);
        personal.add(kl);
        personal.add(ct);
        personal.add(gt);
        personal.add(hr);
        personal.add(jh);
        personal.add(da);
        
        
        for(persona obj:personal)
       {
           System.out.println(obj.getId()+" "+obj.getEdad()+" "+obj.getNombre()+" "+obj.getApellidos());
           obj.trabajo();
       }
       //viaje
       for(persona obj:personal)
       {
           System.out.println(obj.getId()+" "+obj.getEdad()+" "+obj.getNombre()+" "+obj.getApellidos());
           obj.deporte();
       }
       //concentracion
       for(persona obj:personal)
       {
           System.out.println(obj.getId()+" "+obj.getEdad()+" "+obj.getNombre()+" "+obj.getApellidos());
           obj.reunion();
       }   
                
    }
}

