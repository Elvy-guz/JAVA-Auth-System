package org.elvyguzman.system;
import org.elvyguzman.models.Persona;

public class Alumno extends Persona{
    
    //Atributos - ENCAPSULAMIENTO
    private String carnet;
    private String grado;
    private String seccion;
    
   //Constrsuctor Vacio
    public Alumno(){}
    
    //Constrsuctor lleno
    public Alumno(String nombres, String apellidos, Integer edad, 
            String carnet, String grado, String seccion){
        
        super(nombres, apellidos, edad);
        this.carnet = carnet;
        this.grado = grado;
        this.seccion = seccion;
    } 
    
    //Encapsulamiento
    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }
    //Sobrecarga de toString
    @Override
    public String toString() {
        return super.toString()+ "Alumno{" + "carnet=" + carnet + ", grado=" + grado + 
                ", seccion=" + seccion + '}';
    } 
    
    
}
