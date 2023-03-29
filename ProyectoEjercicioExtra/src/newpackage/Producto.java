
package newpackage;

import java.util.Scanner;

public class Producto {
    // Atributos
    private String nombre;
    private int codigo;
    private int stock;
    private double precio;
    // Contructor

    public Producto() {
    }

    public Producto(String nombre, int codigo, int stock, double precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.stock = stock;
        this.precio = precio;
    }
    // Getter y Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    // Metodos
    public void crearProducto(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto :");
        nombre =leer.next();
        System.out.println("Ingrese el codigo del producto :");
        codigo =leer.nextInt();
        System.out.println("Ingrese el stock del producto :");
        stock =leer.nextInt();
        System.out.println("Ingrese el precio del producto :");
        precio =leer.nextDouble();
    }
    
    public void venderProducto(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de producto a restar : ");
       int canvendido=leer.nextInt();
        stock -= canvendido;
    }
    public void cambiarPrecio(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Asignar un nuevo precio : ");
        precio=leer.nextDouble();
    }
    public void metodoMostrar(){
        System.out.println("Producto: "+nombre);
        System.out.println("Codigo: "+ codigo);
        System.out.println("Stock: "+ stock);
        System.out.println("Precio: "+ precio);
    }
    
    
    
}
