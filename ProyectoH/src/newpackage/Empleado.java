
package newpackage;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Empleado {
    private String nombre;
    private int edad;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public  void calcular_aumento(){
        Scanner leer = new Scanner(System.in);
       nombre = JOptionPane.showInputDialog("Ingrese su nombre : ");
       edad=Integer.parseInt(JOptionPane.showInputDialog(nombre+" Ingrese su edad "));
       salario =Double.parseDouble(JOptionPane.showInputDialog(nombre+" Ingrese su salario : "));
       if (edad > 30 ){
           salario = salario*1.10;
           JOptionPane.showMessageDialog(null, nombre +" Usted cobrara un 10 % de aumento su salario quedara en : " + salario);
       }else if (edad<=30){
           salario = salario*1.05;
           JOptionPane.showMessageDialog(null, nombre +" Usted cobrara un 5 % de aumento su salario quedara en : " + salario);
       }
        
        
    }

    @Override
    public String toString() {
        return " Empleado { " + "nombre = " + nombre + ", edad = " + edad + ", salario = " + salario + '}';
    }
    
    
}
