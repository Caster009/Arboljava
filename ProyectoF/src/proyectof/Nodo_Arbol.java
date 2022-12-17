package proyectof;
public class Nodo_Arbol {
    
    
     int dato;
    String nombre;
    
    Nodo_Arbol izq, der;
   
    

    public Nodo_Arbol(String nombre,String genero) {
        genero=genero;
        nombre=nombre;
        izq = der = null;
    }

    public String toString(String genero, String nombre) {
        return "persona ="+nombre+"{" + "genero" + genero + '}';
    }
   
}
