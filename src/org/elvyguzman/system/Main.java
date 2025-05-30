package org.elvyguzman.system;
import org.elvyguzman.models.Profesor;

public class Main {

    public static void main(String[] args) {
        
        //crear un objeto haciendo uso del const. vacio
        Profesor profesor = new Profesor();
        
        //crear un objeto haciendo uso del const. lleno
        Profesor profesor2  = new Profesor("Juan", "Garcia", 35, 
        "elvyguz@gmail.com", "450289", "12543578");
        
        
        profesor.setNombres("Elvy");
        profesor.setApellidos("Guzman");
        profesor.setEdad(18);
        profesor.setEmail("elvyguz@gmail.com");
        profesor.setId("058205");
        profesor.setPhone("55881250");
        
        System.out.println(profesor);
        System.out.println(profesor2);
        
        System.out.println("Esta es una prueba en la rama ft/test");
        
    }
    
}
