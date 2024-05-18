package org.example.ArbolBinario;

public class Nodo {
    protected int dato;
    protected Nodo izdo;
    protected Nodo dcho;
    public  Nodo(int valor){
        dato = valor;
        izdo = dcho= null;
    }


    public Nodo(Nodo ramaIzdo, int valor, Nodo ramaDcho){
        dato= valor;
        izdo= ramaIzdo;
        dcho = ramaDcho;

    }


    //opreradore des acceso

    public  int valorNodo(){return  dato;}
    public Nodo GetSubarbolIzdo(){return izdo;}
    public Nodo GetSubarbolDcho(){return dcho;}
    public void nuevoValor(int d){dato= d;}
    public void SetRamaIzdo(Nodo n){izdo = n;}
    public void SetRamaDcho(Nodo n){dcho = n;}
    public void imprimiDato(){
        System.out.println(this.valorNodo());
    }

}
