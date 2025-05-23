package org.elvyguzman.models;

public abstract class Persona {
    //Atributos
    public String nombres; //public es accesible desde cualquier programa
    private String apellidos; // es accesible solamente dentro de la misma clase
    protected Integer edad; //es accesible desde subclases y dentro del mismo package
    
    //Constructores
    //estoy aplicando el polimorfismo por sobrecarga y que varien sus atributos
    public void Persona (){}    //no reciba ningun atritubo
    
    //que reciba todos los atributos
    public Persona(String nombres, String apellidos, Integer edad){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    //getters y setters
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    
    public String getApellidos(){
        return apellidos;
    }
    
    public void setNombres(String nombres){
        this.nombres = nombres;
    }
    
    public String getNombres(){
        return nombres;
    }
    
    public void setEdad(Integer edad){
        if(edad >= 0){
            this.edad = edad;
        }
    }
    
    public Integer getEdad(){
        return edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombres=" + nombres + ", apellidos=" + apellidos + ", edad=" + edad + '}';
    }
    
    
}

