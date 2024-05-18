package org.example.ArbolBinario;

public class Arbol {

    //nodo raiz del arbol
    private  Nodo raiz;
    //constructuor de la clase arbol
    public Arbol(){this.raiz= null;}

    //inserta un nodo con el valor del dato, si el arbol está vacio se crea un nodo nuevo
    public void insertar(int dato){
        if (this.raiz==null){
            this.raiz= new Nodo(dato);
        }else {
            this.insertar(this.raiz,dato);
        }
    }
    // si no tiene valor nulo se inserta en una orden
    private void insertar(Nodo padre, int dato){

        if (dato<padre.valorNodo()){
            if(padre.GetSubarbolIzdo()==null){
                padre.SetRamaIzdo(new Nodo(dato));
            }else {
                insertar(padre.GetSubarbolIzdo(),dato);

            }
        }else if (dato>padre.valorNodo()){
            if (padre.GetSubarbolDcho()==null){
                padre.SetRamaDcho(new Nodo(dato));
            }else {
                insertar(padre.GetSubarbolDcho(),dato);
            }
        }
    }




}
