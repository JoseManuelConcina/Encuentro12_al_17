
package proyectoc;

import java.util.Scanner;

public class Operacion {
    // Atributos
    private int numero1;
    private int numero2;
  
    // Constructor

    public Operacion(int numero1, int numero2, int suma) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }
    
    // Metodo Setter y Getter.

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

     // Metodos
    
    public void crearOperacion (){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un valor para el numero 1 : ");
        numero1 = leer.nextInt();
        System.out.print("Ingrese un valor para el numero 2 : ");
        numero2 = leer.nextInt();
    }
   
    public int getSumar (){
        int resultado=numero1 + numero2;
        System.out.println("El resultado de la suma es:"+resultado);
    return resultado;
    }
    public int getRestar (){
        int resultado=numero1-numero2;
         System.out.println("El resultado de la resta es:"+resultado);
        return resultado;
    }
    public int getmultiplicar (){
       int resultado=0;
        if((numero1==0)||(numero2==0)){
            System.out.println("***ERROR** Algunos o ambos numeros tienen el valos de 0");
        }else{resultado=numero1*numero2;  }    
        System.out.println("El resultado del producto es:" + resultado);
        return resultado;
    }
     public double getdividir (){
       double resultado=0;
        if((numero1==0)||(numero2==0)){
            System.out.println("***ERROR** Algunos o ambos numeros tienen el valos de 0");
        }else{resultado=numero1/numero2;  }    
         System.out.println("El resultado de la divicion es: "+ resultado);
         return resultado;
    }
    
}
