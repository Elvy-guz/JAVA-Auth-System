package org.elvyguzman.controllers;
//import de dependencia de Java
import java.util.ArrayList;
//import de lo que nosotros hacemos
import org.elvyguzman.models.Profesor;
import org.elvyguzman.utils.SingletonScanner;
import org.elvyguzman.utils.InputException;

public class ProfesorController {
    //CRUD de profesor
    //Create crear
    //Read leer u obtener/ obtener todos y obtener uno especifico
    //Update Actualizar
    //Delete Eliminar
    //Try = intentar catch =capturar
    //UI/UX -> User Interface / User Expirince
    
    final java.util.Scanner leer = SingletonScanner.getInstance().getScanner();
    ArrayList<Profesor> profesores = new ArrayList<> ();
    
    public ProfesorController () {}
    
    //CREATE DE CRUD
    public void agregarProfesor(){
        Profesor profesor = new Profesor();
        System.out.println("Ingresa nombres");
        profesor.setNombres(leer.nextLine());
        System.out.println("Ingresa apellidos");
        profesor.setApellidos(leer.nextLine());
        
        while (true){
            try{
                System.out.println("Ingresa edad");
                if(!leer.hasNextInt()){
                    throw new InputException("Edad no valida, se espera un numero");
                }
                profesor.setEdad(leer.nextInt());
                leer.nextLine();
                break;
            }catch(InputException error){
                System.out.println(error.getMessage());
                leer.nextLine();
            }
        }
        
        while (true){
            try{
               System.out.println("Ingresa el email");
               profesor.setEmail(leer.nextLine()); 
               if(profesor.getEmail().equals("Email invalido")){
                   throw new InputException("Ingrese un email valido");
                }else{
                   break;
               }
            }catch(InputException e){
                System.out.println(e.getMessage());
            }
        }
        
        System.out.println("Ingresa el telefono");
        profesor.setPhone(leer.nextLine());
        System.out.println("Ingresa el ID");
        profesor.setId(leer.nextLine());
        profesores.add(profesor);
        
    }
    //void no devuelve ningun valor
    public void listarProfesores(){
        for(int i = 0; i < profesores.size(); i++){
            System.out.println(profesores.get(i));
        }
    }
    
    //READ DE CRUD
    public Profesor buscarProfesor(String id){
        Profesor profesorTemporal;
        Profesor mostrarProfesor = new Profesor();
        for(int i = 0; i < profesores.size(); i++){
            profesorTemporal = profesores.get(i);
            if (profesorTemporal.getId().equals(id)){
                mostrarProfesor = profesorTemporal;
            }
        }
        return mostrarProfesor;
    }
    
    //UPDATE DE CRUD
    public Profesor actualizarProfesor(String id){
        Profesor profesorTemporal = new Profesor();
        Profesor profesorActualizado = new Profesor(); 
        
        for(int i = 0; i < profesores.size(); i++){
            profesorTemporal = profesores.get(i);
            if (profesorTemporal.getId().equals(id)){
                profesorActualizado = profesorTemporal;
                profesores.remove(i);
            }
        }
        
        System.out.println("Los datos del profesor buscado son: ");
        System.out.println(profesorTemporal.toString());
        System.out.println("------------------------------");
        System.out.println("INGRESA LOS NUEVOS DATOS");
        System.out.println("Ingresa nombres");
        profesorActualizado.setNombres(leer.nextLine());
        System.out.println("Ingresa apellidos");
        profesorActualizado.setApellidos(leer.nextLine());
        System.out.println("Ingresa telefono");
        profesorActualizado.setPhone(leer.nextLine());
        
        int eleccion;
        while(true){
            try{
                System.out.println("Estas seguro que deseas actualizar los datos");
                System.out.println("1. Para si, 2. Para No");
                if(!leer.hasNextInt()){
                    throw new InputException("Debes ingresar un numero valido");
                }
                eleccion = leer.nextInt();
                leer.nextLine();
                if(eleccion == 1 || eleccion == 2){
                    break;
                }else{
                    System.out.println("Opcion no valida, seleccione una correcta");
                }
            }catch (InputException e){
                System.out.println(e.getMessage());
                leer.nextLine();
            }
        }
        
        if (eleccion == 1){
            System.out.println("Datos actualizados exitosamente");
            profesorTemporal = profesorActualizado;
            profesores.add(profesorTemporal);
        }else{
            System.out.println("No se realizaron cambios");
            profesores.add(profesorTemporal);
        }
        return profesorTemporal;
    }
    
    //DELETE CRUD
    public String eliminarProfesor(String id){
        String respuesta = "";
        Profesor profesorEncontrado;
        for(int i = 0; i < profesores.size(); i++){
            profesorEncontrado = profesores.get(i);
            if(profesorEncontrado.getId().equals(id)){
                profesores.remove(i);
                respuesta = "Profesor eliminado exitosamente";
            }
        }
        return respuesta;
    }
    
}
