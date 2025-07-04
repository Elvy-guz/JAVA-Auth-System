package org.elvyguzman.views;

import org.elvyguzman.utils.SingletonScanner;

public class MenuGeneral {
    final java.util.Scanner leer = SingletonScanner.getInstance().getScanner();
    private boolean flag = true;
    private ProfesorViews pv = new ProfesorViews();
    private AlumnoViews av = new AlumnoViews();
    
    public void mostrarMenu(){
        while(flag)
            try{
                System.out.println("\n === MENU GENRAL ===");
                System.out.println("1. Gestion de profesores");
                System.out.println("2. Gestion de alumnos");
                System.out.println("3. Salir");
                int op = 0;
                while(true){
                    System.out.println("Seleccione una opcion: ");
                    if(!leer.hasNextInt()){
                        System.out.println("Entrada invalida, se esperaba un numero");
                        leer.nextLine();
                    }
                    op = leer.nextInt();
                    break;
                }
                switch(op){
                    case 1 -> pv.menuProfesor();
                    case 2 -> av.menuAlumno();
                    case 3 -> {
                        System.out.println("Hasta pronto, adios!!!");
                        flag = false;
                    }
                    default -> System.out.println("Selecciona una opcion validad");
                }
            }catch(Exception e){
                System.out.println("Error en el sistema " + e.getMessage());
                leer.nextLine();
            }
    }
}

