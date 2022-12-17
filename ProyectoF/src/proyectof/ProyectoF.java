package proyectof;
public class ProyectoF {

       Nodo_Arbol raiz;
    int cant;
    int altura;
    Persona resul;

    public ProyectoF() {
        raiz = null;
    }

    public void Insertar(Nodo_Arbol nuevo) {

        if (raiz == null) {
            raiz = nuevo;
        } else {
            Nodo_Arbol auxiliar = raiz;
            Nodo_Arbol padre;
            while (true) {
                padre = auxiliar;
                if (nuevo.dato < auxiliar.dato) {
                    auxiliar = auxiliar.izq;

                    if (auxiliar == null) {
                        padre.izq = nuevo;

                        return;
                    }
                } else {
                    auxiliar = auxiliar.der;
                    if (auxiliar == null) {
                        padre.der = nuevo;
                        return;
                    }}}}}
    
    public boolean Vacio() {
        return raiz == null;
    }

    public void InOrden(Nodo_Arbol r) {
        if (r != null) {
            InOrden(r.izq);
            System.out.print(r.dato + ",");
            InOrden(r.der);
        }
    }

    public void PreOrden(Nodo_Arbol r) {
        if (r != null) {
            System.out.print(r.dato+ ",");
            PreOrden(r.izq);
            PreOrden(r.der);
        }
    }

    public void PostOrden(Nodo_Arbol r) {
        if (r != null) {
            PostOrden(r.izq);
            PostOrden(r.der);
            System.out.println(r.dato + ", ");
            
        }}

    public String BuscarNodo(int d) {
        Nodo_Arbol aux = raiz;
        while (aux.dato != d) {
            if (d < aux.dato) {
                aux = aux.izq;
            } else {
                aux = aux.der;
            }
            if (aux == null) {
                return null;
            }
        }
        return aux.toString();
    }

    public boolean existe(int info) {
        Nodo_Arbol reco = raiz;
        while (reco != null) {
            if (info == reco.dato) {
                return true;
            } else if (info > reco.dato) {
                reco = reco.der;
            } else {
                reco = reco.izq;
            }}
        return false;
    }

    public boolean Eliminar(int d) {
        Nodo_Arbol auxiliar = raiz;
        Nodo_Arbol padre = raiz;
        boolean hijoizq = true;
        while (auxiliar.dato != d) {
            padre = auxiliar;
            if (d < auxiliar.dato) {
                hijoizq = true;
                auxiliar = auxiliar.izq;
            } else {
                hijoizq = false;
                auxiliar = auxiliar.der;
            }
            if (auxiliar == null) {
                return false;
            }
        }//si es hoja 
        if (auxiliar.izq == null && auxiliar.der == null) {
            if (auxiliar == raiz) {
                raiz = null;
            } else if (hijoizq) {
                padre.izq = null;
            } else {
                padre.der = null;
            }
        } else if (auxiliar.der == null) {
            if (auxiliar == raiz) {
                raiz = auxiliar.izq;
            } else if (hijoizq) {
                padre.izq = auxiliar.izq;
            } else {
                padre.der = auxiliar.izq;
            }
        } else if (auxiliar.izq == null) {
            if (auxiliar == raiz) {
                raiz = auxiliar.der;
            } else if (hijoizq) {
                padre.izq = auxiliar.der;
            } else {
                padre.der = auxiliar.der;
            }// es la raiz
        } else {
            Nodo_Arbol reemplazo = ObtenerReemplazo(auxiliar);
            if (auxiliar == raiz) {
                raiz = reemplazo;
            } else if (hijoizq) {
                padre.izq = reemplazo;
            } else {
                padre.der = reemplazo;
            }
            reemplazo.izq = auxiliar.izq;
        }
        return true;
    }

    public Nodo_Arbol ObtenerReemplazo(Nodo_Arbol nodoreemplazo) {
        Nodo_Arbol reemplazarpadre = nodoreemplazo;
        Nodo_Arbol reemplazo = nodoreemplazo;
        Nodo_Arbol auxiliar = nodoreemplazo.der;
        while (auxiliar != null) {
            reemplazarpadre = reemplazo;
            reemplazo = auxiliar;
            auxiliar = auxiliar.izq;
        }
        if (reemplazo != nodoreemplazo.der) {
            reemplazarpadre.izq = reemplazo.der;
            reemplazo.der = nodoreemplazo.der;
        }
        System.out.println("El Nodo Reemplazo es:" + reemplazo);
        return reemplazo;
    }

    public int cantidadNodos() {
        cant = 0;
        cantidad(raiz);
        return cant;
    }

    private void cantidad(Nodo_Arbol reco) {
        if (reco != null) {
            cant++;
            cantidad(reco.izq);
            cantidad(reco.der);
        }}

    public Nodo_Arbol Raiz() {
        return raiz;
    }}
   