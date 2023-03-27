
package newpackage;

public class Cancion {
    //Atributos
    private String titulo;
    private String autor;
    
    //Conctructor

    public Cancion() {
        titulo ="";
        autor="";
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    // Setters y Getters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public void llenado(String titulo,String autor){
        System.out.println("El Titulo de la cancion es : "+titulo); 
        System.out.println("El Autor de la cancion es: "+autor);
       
    }
    
}
