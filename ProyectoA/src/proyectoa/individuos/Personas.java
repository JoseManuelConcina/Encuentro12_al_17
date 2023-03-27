package proyectoa.individuos;

import java.util.Date;

public class Personas {

    public String nombre;
    public String sexo;
    public String dni;
  
    public double altura;
    public double peso;

    public Personas() {

    }

    public Personas(String nombre, String sexo, String dni, double altura, double peso) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.dni = dni;
       
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }


    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

     
    
    
}
