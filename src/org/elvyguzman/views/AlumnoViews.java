package org.elvyguzman.views;

import org.elvyguzman.controllers.AlumnoController;
import org.elvyguzman.models.Alumno;
import org.elvyguzman.utils.SingletonScanner;

public class AlumnoViews {
    Integer op1, op2;
    boolean flag = true;
    final java.util.Scanner leer = SingletonScanner.getInstance().getScanner();
    AlumnoController pc = new AlumnoController();
    Alumno pf;
    
    //Menu para las opciones
    public AlumnoViews(){}
    
    public void menuAlumno(){
        while(flag == true){
            System.out.println("\n Que deseas realizar?");
            System.out.println("1. Agregar alumno");
            System.out.println("2. Listar alumno");
            System.out.println("3. Buscar alumno");
            System.out.println("4. Actualizar alumno");
            System.out.println("5. Eliminar alumno");
            op1 = leer.nextInt();
            leer.nextLine();
            
            switch(op1){
                case 1 -> {
                    pc.agregarAlumno();
                    System.out.println("Deseas continuar");
                    System.out.println("1. Para si, 2. Para no");
                    op2 = leer.nextInt();
                    flag = menuRepetir(op2);
                }
                case 2 -> {
                    pc.listarAlumnos();
                    System.out.println("Deseas continuar");
                    System.out.println("1. Para si, 2. Para no");
                    op2 = leer.nextInt();
                    flag = menuRepetir(op2);
                }
                case 3 -> {
                    System.out.println("Ingresa el ID del alumno a buscar");
                    String id = leer.nextLine();
                    pf = pc.buscarAlumno(id);
                    System.out.println(pf);
                    System.out.println("Deseas continuar");
                    System.out.println("1. Para si, 2. Para no");
                    op2 = leer.nextInt();
                    flag = menuRepetir(op2);
                }
                case 4 -> {
                    System.out.println("Ingresa el ID del alumno a actualizar");
                    String id = leer.nextLine();
                    pf = pc.actualizarAlumno(id);
                    System.out.println(pf);
                    System.out.println("Deseas continuar");
                    System.out.println("1. Para si, 2. Para no");
                    op2 = leer.nextInt();
                    flag = menuRepetir(op2);
                }
                case 5 -> {
                   System.out.println("Ingresa el ID del alumno a eliminar");
                    String id = leer.nextLine(); 
                    pc.eliminarAlumno(id);
                    System.out.println("Deseas continuar");
                    System.out.println("1. Para si, 2. Para no");
                    op2 = leer.nextInt();
                    flag = menuRepetir(op2);
                }
                default -> {
                    System.out.println("Opcion no valida.");
                    System.out.println("Deseas continuar?");
                    System.out.println("1. Para si, 2. Para no");
                    op2 = leer.nextInt();
                    flag = menuRepetir(op2);
                }
            }   
        }
    }
    
    public static boolean menuRepetir(int op){
        return op != 2;
    }
}
