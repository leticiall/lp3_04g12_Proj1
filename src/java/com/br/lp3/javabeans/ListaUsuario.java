package com.br.lp3.javabeans;

/**
 *
 * @author 31400817
 */
public class ListaUsuario {

    private Usuario[] lista;

    public ListaUsuario() {
        this.lista = new Usuario[5];
        lista[0] = new Usuario("oi","oi");
        lista[1] = new Usuario("a","b");
        lista[2] = new Usuario("c","d");
        lista[3] = new Usuario("e","f");
        lista[4] = new Usuario("g","h");
        
    }

    public Usuario[] getLista() {
        return lista;
    }

    public void setLista(Usuario[] lista) {
        this.lista = lista;
    }
    
}
