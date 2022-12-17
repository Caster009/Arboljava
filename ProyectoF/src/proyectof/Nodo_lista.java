package proyectof;

public class Nodo_lista {
   
     Persona info;
    Nodo_lista sig;
    Nodo_lista ant;
   
    Nodo_lista(Persona info){
        this.info=info;
        sig=ant=null;
    }

    public Persona getInfo() {
        return info;
    }

    public void setInfo(Persona info) {
        this.info = info;
    }

}
