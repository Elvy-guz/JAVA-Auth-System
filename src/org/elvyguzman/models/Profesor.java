package org.elvyguzman.models;
//herencia de clase persona y abstraccion, al ser una clase abstracta 
public class Profesor extends Persona{
    //Atributos de clase ENCAPSULAMIENTO
    private String email;
    private String id;
    private String phone;
   
    //constrsuctor vacio
    public Profesor(){}
    
    //constrsuctor lleno (sobrecarga de contrsuctor, polimorfismo)
    public Profesor(String nombres, String apellidos, Integer edad, 
            String email, String id, String phone){
        super(nombres, apellidos, edad);
        if(email != null && email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")){
            this.email = email;
        }else{
            this.email = "Email invalido";
        }
        this.id = id;
        this.phone = phone;
    }

// Mis getters and setters
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email != null && email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")){
            this.email = email;
        }else{
            this.email = "Email invalido";
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return """
               
               --- PROFESOR ---
               Nombre: """ + getNombres() + " " + getApellidos() + "\n" +
                "Edad: " + getEdad() + "\n" +
                "ID: " + id + "\n" +
                "Email: " + email + "\n" +
                "Telefono: " + phone + "\n";
    }   
}
