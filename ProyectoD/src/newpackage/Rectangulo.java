
package newpackage;

public class Rectangulo {

    // Atributos
    private int base;
    private int altura ;
    // Constructor

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }
    
    // Metodos Setters y Getter 

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public int get_superficie(){
        int sup=0;
        sup = base * altura;
        System.out.println("La superficie del rectangulo es: "+sup);
        return sup;
    }
    public int get_perimitro(){
        int per=0;
        per =(base + altura)/2;
        System.out.println("El perimetro del rectangulo es : "+per);
        return per;
        
    }
    public void dibujo(int base,int altura){
        
        for (int i = 0; i < altura; i++) {
          for (int j = 0; j < base; j++) {
              System.out.print(" * ");
            }
            System.out.println(" ");
        }
        
    }
    
    
}

