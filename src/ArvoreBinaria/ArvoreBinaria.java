package ArvoreBinaria;

import java.util.ArrayList;
import java.util.Scanner;

public class ArvoreBinaria {

    private Nodo raiz;

    private ArrayList<Integer> ListaRemove = new ArrayList<Integer>(); //cria lista para remover um e remontar arvore

    public boolean insere(int value) {
        if (raiz == null) {
            System.out.println(value + " eh a raiz da arvore");
            raiz = new Nodo(value);
            return true;
        } else {
            return raiz.insere(value);
        }
    }

    public void percorre(IPercorre metodo) {
        metodo.percorre(raiz);
    }

    public void preencheLista(Nodo nodo) { //insere valores na lista
        if (nodo != null) {
            preencheLista(nodo.getEsquerda());

            preencheLista(nodo.getDireita());
            ListaRemove.add(nodo.getValor());
        }
    }

    public void remove() {
        int valor = -9000;
        System.out.println("Digite o valor a Remover.");
        Scanner ler = new Scanner(System.in);
        valor = Integer.parseInt(ler.nextLine());

        preencheLista(raiz);
        int pos = ListaRemove.indexOf(valor);
        ListaRemove.remove(pos);
        ArvoreBinaria ab = new ArvoreBinaria();
        for (int i = ListaRemove.size() - 1; i >= 0; i--) {
            ab.insere(ListaRemove.get(i));
        }
      
    }
}
