package newpackage;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Cocina {

    private String ingredientes;
    private double cantidades;
    private String preparacion;
    private float tiempoCoccion;

    public Cocina(String ingredientes, double cantidades, String preparacion, float tiempoCoccion) {
        this.ingredientes = ingredientes;
        this.cantidades = cantidades;
        this.preparacion = preparacion;
        this.tiempoCoccion = tiempoCoccion;
    }

    public Cocina() {
    }

  

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public double getCantidades() {
        return cantidades;
    }

    public void setCantidades(double cantidades) {
        this.cantidades = cantidades;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }

    public float getTiempoCoccion() {
        return tiempoCoccion;
    }

    public void setTiempoCoccion(float tiempoCoccion) {
        this.tiempoCoccion = tiempoCoccion;
    }
    public void nuevasRecetas(){
        Scanner leer = new Scanner(System.in);
        ingredientes = JOptionPane.showInputDialog("Ingrese un  ingrediente :");
        cantidades = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad: "));
        preparacion = JOptionPane.showInputDialog("Ingrese la preparacion: ");
        tiempoCoccion = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el tiempo de coccion: "));
        
        
        }
            
    @Override
    public String toString() {
        return "Cocina{" + "ingredientes=" + ingredientes + ", cantidades=" + cantidades + ", preparacion=" + preparacion + ", tiempoCoccion=" + tiempoCoccion + '}';
    }
    
}
